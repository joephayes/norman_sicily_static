(ns norman-sicily-static.people)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:div {:class "credits-header"} "People Page"]
       [:p "This page, which will ultimately host an interactive genealogy, is under construction. Roger II, Sicily&#39;s first king, is the trunk."]
       [:figure
        [:p]
        [:img {:class "img-responsive centered-responsive-img", :src "/images/roger_ii_family_tree.png"}]
        [:figcaption "Ancestor Chart for Roger II, King of Sicily (ca. 1095 - 1154), and his Wives"]]]]]]] )
