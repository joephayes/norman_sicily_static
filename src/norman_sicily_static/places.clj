(ns norman-sicily-static.places)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:div {:class "credits-header"} "Places Page"]
       [:p "This page will be a portal to the sites of Norman Sicily."]
       [:figure
        [:p]
        [:img {:clas "img-responsive centered-responsive-img", :src "/images/map.png", :alt "Map"}]
        [:figcaption "Map of Sicily Displaying Markers for each Monastic Foundation"]]
       [:figure
        [:p]
        [:img {:clas "img-responsive centered-responsive-img", :src "/images/map_detail.png", :alt "Map"}]
        [:figcaption "Detail Showing a Monastery&#39;s Informational Popup"]]]]]]])
