(ns norman-sicily-static.web
  (:require [optimus.assets :as assets]
            [optimus.export]
            [optimus.link :as link]
            [optimus.optimizations :as optimizations]
            [optimus.prime :as optimus]
            [optimus.strategies :refer [serve-live-assets]]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [hiccup.page :refer [html5]]
            [stasis.core :as stasis]))

(defn get-assets []
  (assets/load-assets "public" [#".*"]))

(defn layout-page [request page]
  (html5
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
     [:meta {:name "viewport"
             :content "width=device-width, initial-scale=1.0"}]
     [:title "The Norman Sicily Project"]
     [:link {:rel "stylesheet" :href "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" :integrity "sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" :crossorigin "anonymous"} ]
     [:link {:rel "stylesheet" :href "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" :integrity "sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" :crossorigin "anonymous"}]
     [:link {:rel "stylesheet" :href (link/file-path request "/styles/main.css")}]]
    [:body
     [:div.body page]
     [:script
      {:src "http://code.jquery.com/jquery-3.2.1.slim.min.js"
       :integrity "sha256-k2WSCIexGzOj3Euiig+TlR8gA0EmPjuc79OEeY5L45g="
       :crossorigin "anonymous"}]
     [:script {:src "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" :integrity "sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" :crossorigin "anonymous"}]
     [:script {:src (link/file-path request "/scripts/app.js")}]]))

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
    (stasis/empty-directory! export-dir)
    (optimus.export/save-assets assets export-dir)
    (stasis/export-pages (get-pages) export-dir {:optimus-assets assets})))
