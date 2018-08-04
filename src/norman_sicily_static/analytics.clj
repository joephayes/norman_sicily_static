(ns norman-sicily-static.analytics)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:div {:class "credits-header"} "Analytics Page"]
       [:p "This pages includes links to different ways of analyzing and
           interpreting the data gathered by the project."]
       [:div {:class "credits-header"} "Links"]
       [:p [:a {:href "http://www.normansicily.org/sicilian_monastic_choropleth_map/"}
            "Choropleth Map of Norman Sicilian Monastic Orders"]]
       [:p "In economics, a location quotient is used to determine areas where
       employment in a specific industry may be over or under represented.
       In this example, the location quotient concept is applied to the number
       of monastic foundations by order in Norman Sicily. Hopefully, location
       quotients will identify concentrations of orders in certain provinces of
       Sicily. In the model, the monastic order replaces the concept of
       industry. For regions, the boundaries of the modern provinces are used
       for convenience, while the reference area is the whole of Sicily."]]]]]])
