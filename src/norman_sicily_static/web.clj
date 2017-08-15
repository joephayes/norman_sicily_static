(ns norman-sicily-static.web
  (:require [optimus.assets :as assets]
            [optimus.export]
            [optimus.link :as link]
            [optimus.optimizations :as optimizations]
            [optimus.prime :as optimus]
            [optimus.strategies :refer [serve-live-assets]]
            [optimus-less.core]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [hiccup.page :refer [html5 include-css include-js]]
            [stasis.core :as stasis]
            [norman-sicily-static.util :as util]))

(defn get-assets []
  (concat
    (assets/load-assets "public" [#"/icons/.*"])
    (assets/load-assets "public" [#"/images/.*"])
    (assets/load-assets "public" ["/scripts/app.js" "/scripts/bootstrap.min.js"])
    (assets/load-bundle "public" "app.css" ["/styles/app.less"])
    (assets/load-assets "public" [#"/svg/.*"])))

(defn layout-page [request page]
  (html5
    {:lang "en"}
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
     [:meta {:name "viewport"
             :content "width=device-width, initial-scale=1.0"}]
     [:title "The Norman Sicily Project"]
     (include-css (link/file-path request "/bundles/app.css"))]
    [:body
     [:div.body
      (util/render-navbar)
      page]
      (util/render-footer)
     [:script
      {:src "https://code.jquery.com/jquery-3.2.1.slim.min.js"
       :integrity "sha256-k2WSCIexGzOj3Euiig+TlR8gA0EmPjuc79OEeY5L45g="
       :crossorigin "anonymous"}]
     (include-js (link/file-path request "/scripts/bootstrap.min.js"))
     (include-js (link/file-path request "/scripts/app.js"))]))

(defn partial-pages [pages]
  (zipmap (keys pages)
          (map #(fn [req] (layout-page req %)) (vals pages))))

(defn get-raw-pages []
  (stasis/merge-page-sources
    {:public
     (stasis/slurp-directory "resources/public" #".*\.(html|css|js)$")
     :partials
     (partial-pages (stasis/slurp-directory "resources/partials" #".*\.html$"))}))

(defn prepare-page [page req]
  (-> (if (string? page) page (page req))))

(defn prepare-pages [pages]
  (zipmap (keys pages)
          (map #(partial prepare-page %) (vals pages))))

(defn get-pages []
  (prepare-pages (get-raw-pages)))

(def app (optimus/wrap (stasis/serve-pages get-pages)
                       get-assets
                       optimizations/all
                       serve-live-assets))

(def export-dir "dist")

(defn export []
  (let [assets (optimizations/all (get-assets) {})]
    (println assets)
    (stasis/empty-directory! export-dir)
    (optimus.export/save-assets assets export-dir)
    (stasis/export-pages (get-pages) export-dir {:optimus-assets assets})))
