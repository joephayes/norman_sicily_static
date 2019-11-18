(ns norman-sicily-static.places)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "ifm-container places-ifm"}
       [:iframe {:src "/places/map/"}]]]]]])
