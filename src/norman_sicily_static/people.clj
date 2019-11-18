(ns norman-sicily-static.people)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "ifm-container people-ifm"}
       [:iframe {:src "/people/family-tree/nsp.html"}]]
      [:div {:class "text-center top-padding"}
       [:p "Hover over individual nodes to discover relationships. Nodes can be moved with a click of the mouse and you may zoom in or zoom out on the graph."]
       [:p "The mother-child link between Elvira of León-Castile and Gisela of Burgundy is based on Dr. Hayes' proposal in " [:em "Roger II of Sicily: Family, Faith and Empire in the Medieval Mediterranean World (Brepols, 2020)"]]]]]]])
