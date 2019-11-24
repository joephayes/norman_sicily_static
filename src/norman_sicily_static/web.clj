(ns norman-sicily-static.web
  (:require [optimus.assets :as assets]
            [optimus.html]
            [optimus.export]
            [optimus.link :as link]
            [optimus.optimizations :as optimizations]
            [optimus.prime :as optimus]
            [optimus.strategies :as strategies]
            [optimus-less.core]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [hiccup.page :refer [html5 include-css include-js]]
            [hiccup.element :refer [javascript-tag]]
            [stasis.core :as stasis]
            [norman-sicily-static.partials :as partials]
            [norman-sicily-static.about :as about]
            [norman-sicily-static.chattels :as chattels]
            [norman-sicily-static.people :as people]
            [norman-sicily-static.places :as places]
            [norman-sicily-static.resources :as resources]
            [norman-sicily-static.index :as index]
            [norman-sicily-static.analytics :as analytics]
            [norman-sicily-static.essays :as essays]
            [ring.middleware.content-type :refer [wrap-content-type]]
            [ring.middleware.not-modified :refer [wrap-not-modified]]))

(def config
  (let [env (or (System/getenv "ENVIRONMENT") "dev")]
      {:env (keyword env)}))

(defn get-assets []
  (concat
    (assets/load-assets "public" [#"/icons/.*"])
    (assets/load-assets "public" [#"/images/.*"])
    (assets/load-assets "public" [#"/data/.*"])
    (assets/load-assets "public" ["/scripts/app.js" "/scripts/bootstrap.min.js" "/scripts/tether.min.js"])
    (assets/load-bundle "public" "app.css" ["/styles/app.less"])
    (assets/load-assets "public" [#"/svg/.*"])
    (assets/load-assets "public" ["/favicon.ico" "/robots.txt" "/sitemap.xml"])))

(defn layout-page [request page]
  (let [site-title "The Norman Sicily Project"
        web-url "http://www.normansicily.org/"
        site-description "The Norman Sicily Project is an effort to document the cultural heritage of Sicily from c. 1061 - 1194."]
    (html5
      {:lang "en"}
      [:head
       [:meta {:charset "utf-8"}]
       [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
       [:meta {:name "viewport"
               :content "width=device-width, initial-scale=1.0"}]
       [:link {:rel "apple-touch-icon" :sizes "180x180" :href "/images/favicon-180.png"}]
       [:link {:rel "apple-touch-icon" :sizes "167x167" :href "/images/favicon-167.png"}]
       [:link {:rel "apple-touch-icon" :sizes "152x152" :href "/images/favicon-152.png"}]
       [:link {:rel "icon" :type "image/png" :sizes "192x192" :href "/images/favicon-192.png"}]
       [:link {:rel "icon" :type "image/png" :sizes "32x32" :href  "/images/favicon-32.png"}]
       [:link {:rel "shortcut icon" :type "image/png" :sizes "196x196" :href "/images/favicon-196.png"}]
       [:link {:rel "shortcut icon" :href "/favicon.ico"}]
       [:link {:rel "manifest" :href "/manifest.json"}]
       [:meta {:name "msapplication-TileColor" :content "#fff"}]
       [:meta {:name "msapplication-config" :content "/browserconfig.xml"}]
       [:meta {:name "twitter:card" :content "summary"}]
       [:meta {:name "twitter:site" :content "@Norman_Sicily"}]
       [:meta {:name "twitter:creator" :content "@Norman_Sicily"}]
       [:meta {:name "og:title" :content site-title}]
       [:meta {:name "og:type" :content "website"}]
       [:meta {:name "og:url" :content web-url}]
       [:meta {:name "og:description" :content site-description}]
       [:meta {:name "og:image" :content "/images/favicon-196.png"}]
       [:meta {:name "og:image:url" :content "/images/favicon-196.png"}]
       [:meta {:name "og:image:type" :content "image/png"}]
       [:meta {:name "og:image:width" :content "196"}]
       [:meta {:name "og:image:height" :content "196"}]
       [:title site-title]
       (optimus.html/link-to-css-bundles request ["app.css"])
       (javascript-tag (str
                         "(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
                         (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
                         m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
                         })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

                         ga('create', 'UA-75482271-1', 'auto');
                         ga('require', 'linkid');
                         ga('send', 'pageview');"))]
      [:body
       [:div.body
        (partials/render-navbar)
        page]
       (partials/render-site-data)
       (partials/render-footer)
       [:script
        {:src "https://code.jquery.com/jquery-3.2.1.slim.min.js"
         :integrity "sha256-k2WSCIexGzOj3Euiig+TlR8gA0EmPjuc79OEeY5L45g="
         :crossorigin "anonymous"}]
       (include-js (link/file-path request "/scripts/tether.min.js"))
       (include-js (link/file-path request "/scripts/bootstrap.min.js"))
       (include-js (link/file-path request "/scripts/app.js"))])))

(defn partial-pages [pages]
  (zipmap (keys pages)
          (map #(fn [req] (layout-page req %)) (vals pages))))

(defn get-raw-pages []
  (stasis/merge-page-sources
    {:public
     (stasis/slurp-directory "resources/public" #".*\.(html|css|js)$")
     :partials
     (let [pages {"/" (index/render-page)
                  "/about/" (about/render-page)
                  "/resources/" (resources/render-page)
                  "/analytics/" (analytics/render-page)
                  "/essays/" (essays/render-page)
                  "/chattels/" (chattels/render-page)
                  "/places/" (places/render-page)
                  "/people/" (people/render-page)}]
       (partial-pages pages))}))

(defn prepare-page [page req]
  (-> (if (string? page) page (page req))))

(defn prepare-pages [pages]
  (zipmap (keys pages)
          (map #(partial prepare-page %) (vals pages))))

(defn get-pages []
  (prepare-pages (get-raw-pages)))

(def app (-> (stasis/serve-pages get-pages)
             (optimus/wrap get-assets
                           (if (= :dev (:env config))
                             optimizations/none
                             optimizations/all)
                           (if (= :dev (:env config))
                             strategies/serve-live-assets
                             strategies/serve-frozen-assets))
             (wrap-content-type)
             (wrap-not-modified)))

(def export-dir "dist")

(defn export []
  (let [assets (optimizations/all (get-assets) {})]
    (stasis/empty-directory! export-dir)
    (optimus.export/save-assets assets export-dir)
    (stasis/export-pages (get-pages) export-dir {:optimus-assets assets})))
