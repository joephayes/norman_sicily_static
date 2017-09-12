(ns norman-sicily-static.analytics)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:div {:class "credits-header"} "Analytics Page"]
       [:p "This page will include charts and graphs that will demonstrate
           statistically significant relationships and a map that displays the
           monuments’ location against the seismic threat level reported by the
           Italian government’s Dipartimento della Protezione Civile."]
       [:figure
        [:p]
        [:img {:class "img-responsive centered-responsive-img", :src "/images/monastic_orders_choropleth.gif", :alt "Choropleth map showing the location quotients of Norman monastic foundations by order"}]
        [:figcaption "Choropleth Map Showing the Location Quotients of Norman Monastic Foundations by Order"]]]]]]])
