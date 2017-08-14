(defproject norman_sicily_static "0.1.0-SNAPSHOT"
  :description "The Norman Sicily Project"
  :url "http://www.normansicily.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [stasis "2.3.0"]
                 [ring "1.6.2"]
                 [hiccup "1.0.5"]
                 [enlive "1.1.6"]
                 [clygments "1.0.0"]
                 [optimus "0.19.3"]
                 [optimus-less "0.2.1"]]
  :ring {:handler norman-sicily-static.web/app}
  :aliases {"build-site" ["run" "-m" "norman-sicily-static.web/export"]}
  :profiles {:dev {:plugins [[lein-ring "0.12.0"]]}
             :test {:dependencies [[midje "1.8.3"]]
                    :plugins [[lein-midje "3.2.1"]]}})
