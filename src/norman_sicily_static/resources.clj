(ns norman-sicily-static.resources)

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
       [:div {:class "credits-header"} "Datasets"]
       [:p "Currently, the dataset includes Norman monasteries in Sicily.
           It is available in various formats, including "
        [:a {:href "http://www.normansicily.org/data/places-20180727.csv"} "CSV"] ", "
        [:a {:href "http://www.normansicily.org/data/places-20180727.geojson"} "GeoJSON"] ", "
        [:a {:href "http://www.normansicily.org/data/places-20180727.jsonld"} "JSON-LD"] ", "
        [:a {:href "http://www.normansicily.org/data/places-riot-20180727.n3"} "N3"] ", "
        [:a {:href "http://www.normansicily.org/data/places-riot-20180727.rdfxml"} "RDF/XML"] " and "
        [:a {:href "http://www.normansicily.org/data/places-riot-20180727.ttl"} "TTL"]
        ". For the CSV and GeoJSON formats, there is a "
        [:a {:href "http://www.normansicily.org/data/places_column_dictionary_20180727.csv"} "data dictionary"]
        " to describe the columns."]
       [:p "All of the datasets are LOD three star compliant "
        [:a {:href "https://5stardata.info/en/"}
         [:img {:src "/images/data-badge-3.png"}]] "."]
       [:p "All of the datasets are released under "
        [:a {:rel "license" :href "http://creativecommons.org/licenses/by-sa/4.0/"}
         [:img {:alt "Creative Commons License" :style "border-width:0;padding-bottom:10px" :src "https://i.creativecommons.org/l/by-sa/4.0/88x31.png"}]]]
       [:p "Previous versions and source code are available via "
        [:a {:href "https://github.com/the-norman-sicily-project/data-dumps"} "Github"] "."]]]]]])
