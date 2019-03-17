(ns norman-sicily-static.places)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:div {:class "credits-header"} "Places Page"]
       [:iframe {:src "/places/map/"
                 :style "width:100%;height:100%;min-height:620px;min-width:1000px"}]]]]]])
