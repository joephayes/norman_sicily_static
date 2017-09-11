(ns norman-sicily-static.resources)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:div {:class "credits-header"} "Resources Page"]
       [:p "This page will contain links and information about the data models
           and vocabularies which the website will use to describe the people
           and places of Norman Sicily."]
       [:p "It will also facilitate the interpretation of the data using
           various analytical techniques."]
       [:figure
        [:p]
        [:img {:class "img-responsive centered-responsive-img", :src "/images/monastic_orders_choropleth.gif", :alt "Choropleth map showing the location quotients of Norman monastic foundations by order"}]
        [:figcaption "Choropleth Map Showing the Location Quotients of Norman Monastic Foundations by Order"]]]]]]] )
