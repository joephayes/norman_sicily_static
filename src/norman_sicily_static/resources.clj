(ns norman-sicily-static.resources
  (:require [cheshire.core :as json]))

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:div {:class "credits-header"} "Resources Page"]
       [:p "This page includes downloadable data sets in multiple machine
           readable formats so that users can conduct their own analyses and the
           vocabularies of metadata. Eventually it will include a form through
           which users can submit feedback as well as additional information
           about existing sites that the collaborators will corroborate in
           advance of inclusion."]
       [:p "The project's "
        [:a {:href "https://youtu.be/YGKlwjaH-cw"} "backstory."]]
       [:div {:class "credits-header"} "Vocabulary"]
       [:p "For its linked open datasets the Norman Sicily Project uses a
           custom vocabulary, which is available "
        [:a {:href "http://www.normansicily.org/nsp"} "here."]]
       [:p "Previous versions and source code are available via "
        [:a {:href "https://github.com/the-norman-sicily-project/vocabulary"}
         "Github."]]
       [:div {:class "credits-header"} "Site Dataset"]
       [:script {:type "application/ld+json"}
        (json/generate-string
          {"@context" "http://schema.org"
           "@type" "Dataset"
           :name "The Norman Sicily Project Place data"
           :description "Data about places collected by The Norman Sicily Project"
           :creator {"@type" "Organization"
                     :name "The Norman Sicily Project"
                     :url "http://www.normansicily.org/"}
           :datePublished "2018-07-27"
           :dateModified "2019-10-09"
           :url "http://www.normansicily.org/data/"
           :sameAs "https://github.com/the-norman-sicily-project/data-dumps/tree/master/2019-10-09"
           :distribution [{"@type" "DataDownload"
                           :encodingFormat "text/csv"
                           :contentUrl "http://www.normansicily.org/data/places-20191009.csv"}
                          {"@type" "DataDownload"
                           :encodingFormat "application/geo+json"
                           :contentUrl "http://www.normansicily.org/data/places-20191009.geojson"}
                          {"@type" "DataDownload"
                           :encodingFormat "application/ld+json"
                           :contentUrl "http://www.normansicily.org/data/places-20191009.jsonld"}
                          {"@type" "DataDownload"
                           :encodingFormat "text/n3"
                           :contentUrl "http://www.normansicily.org/data/places-riot-20191009.n3"}
                          {"@type" "DataDownload"
                           :encodingFormat "application/rdf+xml"
                           :contentUrl "http://www.normansicily.org/data/places-riot-20191009.rdfxml"}
                          {"@type" "DataDownload"
                           :encodingFormat "text/turtle"
                           :contentUrl "http://www.normansicily.org/data/places-riot-20191009.ttl"}]
           :license "http://creativecommons.org/licenses/by-sa/4.0/"
           :temporalCoverage "1060/1194"
           :spatialCoverage {"@type" "Place"
                             :name "Sicily"
                             :containedIn {"@type" "Place"
                                           :name "Italy"}}})]
       [:p "Currently, the site dataset includes Norman monasteries in Sicily from
           the period beginning 1060 until 1194. It is available in various
           formats, including "
        [:a {:href "/data/places-20191009.csv"} "CSV"] ", "
        [:a {:href "/data/places-20191009.geojson"} "GeoJSON"] ", "
        [:a {:href "/data/places-20191009.jsonld"} "JSON-LD"] ", "
        [:a {:href "/data/places-riot-20191009.n3"} "N3"] ", "
        [:a {:href "/data/places-riot-20191009.rdfxml"} "RDF/XML"] " and "
        [:a {:href "/data/places-riot-20191009.ttl"} "TTL"]
        ". For the CSV and GeoJSON formats, there is a "
        [:a {:href "/data/places_column_dictionary_20191009.csv"} "data dictionary"]
        " to describe the columns."]
       [:p "Previous versions and source code are available via "
        [:a {:href "https://github.com/the-norman-sicily-project/data-dumps"} "Github"] "."]
       [:div {:class "credits-header"} "People Dataset"]
       [:script {:type "application/ld+json"}
        (json/generate-string
          {"@context" "http://schema.org"
           "@type" "Dataset"
           :name "The Norman Sicily Project People data"
           :description "Data about people collected by The Norman Sicily Project"
           :creator {"@type" "Organization"
                     :name "The Norman Sicily Project"
                     :url "http://www.normansicily.org/"}
           :datePublished "2018-11-18"
           :dateModified "2019-11-18"
           :url "http://www.normansicily.org/data/"
           :sameAs "https://github.com/the-norman-sicily-project/genealogical-trees/tree/jph-nsp/data"
           :distribution [{"@type" "DataDownload"
                           :encodingFormat "text/plain"
                           :contentUrl "http://www.normansicily.org/data/nsp.ged"}
                          {"@type" "DataDownload"
                           :encodingFormat "text/turtle"
                           :contentUrl "http://www.normansicily.org/data/nsp.ged.ttl"}
                          {"@type" "DataDownload"
                           :encodingFormat "text/plain"
                           :contentUrl "http://www.normansicily.org/data/nsp.ged.ttl.owl"}
                          {"@type" "DataDownload"
                            :encodingFormat "text/plain"
                            :contentUrl "http://www.normansicily.org/data/nsp.json"}]
           :license "http://creativecommons.org/licenses/by-sa/4.0/"
           :temporalCoverage "900/1300"
           :spatialCoverage {"@type" "Place"
                             :name "Europe"}})]
       [:p "Currently, the people dataset includes the Hautevilles who ruled Sicily and southern Italy as well as a wide variety
           of individuals who were part of their extended family network. Developed from numerous published scholarly sources,
           the tree is both chronologically and geographically broad in an effort to situate the Hautevilles within numerous
           aristocratic families from across the European continent. With that said, the genealogy is meant to be suggestive,
           not comprehensive. It is available for download in various formats, including "
        [:a {:href "/data/nsp.ged"} "GEDCOM"] ", "
        [:a {:href "/data/nsp.ged.ttl"} "TTL"] ", "
        [:a {:href "/data/nsp.ged.ttl.owl"} "OWL"] " and "
        [:a {:href "/data/nsp.json"} "JSON."]]
       [:p "Source code available via "
        [:a {:href "https://github.com/the-norman-sicily-project/genealogical-trees"} "Github"] "."]
       [:div {:class "credits-header"} "Dataset Notes"]
       [:p "All of the datasets are LOD three star compliant "
        [:a {:href "https://5stardata.info/en/"}
         [:img {:src "/images/data-badge-3.png"}]] "."]
       [:p "All of the datasets are released under "
        [:a {:rel "license" :href "http://creativecommons.org/licenses/by-sa/4.0/"}
         [:img {:alt "Creative Commons License" :style "border-width:0;padding-bottom:10px" :src "https://i.creativecommons.org/l/by-sa/4.0/88x31.png"}]]]]]]]])

