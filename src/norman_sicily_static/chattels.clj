(ns norman-sicily-static.chattels)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:div {:class "credits-header"} "Chattels Page"]
       [:p "This page will ultimately offer links to various categories of moveable objects produced in the Norman Kingdom of Sicily."]
       [:figure
        [:p]
        [:img {:class "img-responsive centered-responsive-img", :src "/images/sicilo-moorishcloak-990X459.png", :alt "Roger II's Coronation Mantle"}]
        [:figcaption "Roger II&#39;s Coronation Mantle, Palermo, c. 1133"
         [:br]"(Gold Embroidery on Red Samite with Pearls and Precious Stones)"
         [:br]"Treasury, "
         [:a {:href "https://www.khm.at/en/"} "Kunsthistorisches Museum"]", Vienna"]]]]]]])
