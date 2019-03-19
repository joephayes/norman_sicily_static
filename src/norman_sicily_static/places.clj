(ns norman-sicily-static.places)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:iframe {:src "/places/map/"
                 :style "border:0px;width:100%;height:100%;min-height:620px;min-width:1000px"}]]]]]])
