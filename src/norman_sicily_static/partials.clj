(ns norman-sicily-static.partials)

(defn render-navbar
  []
  [:nav {:class "navbar navbar-default navbar-static-top"}
   [:div {:class "container"}
    [:div {:id "navbar-button-bar" :class "navbar-header"}
     [:a {:href "/about/" :class "btn btn-default navbar-btn image-button about-button navbar-right"} [:div {:class "overlay-text" :data-hover "About"}]]
     [:a {:href "/resources/" :class "btn btn-default navbar-btn image-button resources-button navbar-right"} [:div {:class "overlay-text" :data-hover "Resources"}]]
     [:a {:href "/analytics/" :class "btn btn-default navbar-btn image-button analytics-button navbar-right"} [:div {:class "overlay-text" :data-hover "Analytics"}]]
     [:a {:href "/interpretations/" :class "btn btn-default navbar-btn image-button interpretations-button navbar-right"} [:div {:class "overlay-text" :data-hover "Interpretations"}]]
     [:a {:href "/chattels/" :class "btn btn-default navbar-btn image-button chattels-button navbar-right"} [:div {:class "overlay-text" :data-hover "Chattels"}]]
     [:a {:href "/places/" :class "btn btn-default navbar-btn image-button places-button navbar-right"} [:div {:class "overlay-text" :data-hover "Places"}]]
     [:a {:href "/people/" :class "btn btn-default navbar-btn image-button people-button navbar-right"} [:div {:class "overlay-text" :data-hover"People"}]]
     [:a {:href "/" :class"btn btn-default navbar-btn image-button home-button navbar-right"} [:div { :class "overlay-text" :data-hover "Home"}]]
     [:a {:href "/" :class "navbar-left"} [:img {:class "logo" :src "/images/title_bar.png"}]]]]])

(defn render-footer
  []
  [:div {:class "footer"}
   [:div {:class "container"}
    [:div {:class "row bottom-padding"}
     [:div {:class "col-12-xs"}
      [:div {:class "center-block"}
       [:a {:href "https://www.facebook.com/TheNormanSicilyProject/" :class "side-padded"} [:i {:class "fa fa-facebook fa-2x circle-icon" :title "Facebook"}]]
       [:a {:href "https://twitter.com/Norman_Sicily" :class "side-padded"} [:i {:class "fa fa-twitter fa-2x circle-icon" :title "Twitter"}]]
       [:a {:href "https://www.instagram.com/thenormansicilyproject/?hl=en" :class "side-padded"} [:i {:class "fa fa-instagram fa-2x circle-icon" :title "Instagram"}]]
       [:a {:href "https://github.com/the-norman-sicily-project" :class "side-padded"} [:i {:class "fa fa-github fa-2x circle-icon" :title "GitHub"}]]]]]
    [:div {:class "row"}
     [:div {:class="col-12-xs"}
      [:div {:class "footer-links"}
       [:p
        "&copy; 2015 - 2017 by Dawn Marie Hayes and Joseph Hayes. All Rights Reserved."

        [:div {:id "license"}
         [:a {:rel "license" :href "http://creativecommons.org/licenses/by-nc-sa/4.0/"} [:img {:alt "Creative Commons License" :style "border-width:0;padding-bottom:10px" :src "https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png"}]] [:br ] "This " [:span {:xmlns:dct "http://purl.org/dc/terms/" :href "http://purl.org/dc/dcmitype/StillImage" :rel "dct:type"} "work"] " by " [:a {:xmlns:cc "http://creativecommons.org/ns#" :href "normansicily.org" :property "cc:attributionName" :rel "cc:attributionURL"} "Dawn Marie Hayes, Ph.D. and Joseph Hayes "] "is licensed under a" [:a {:rel "license" :href "http://creativecommons.org/licenses/by-nc-sa/4.0/"} "  Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License"]]]]]]]])
