(ns norman-sicily-static.partials
  (:require [cheshire.core :as json]))

(defn render-navbar
  []
  [:nav {:class "navbar navbar-default navbar-static-top"}
   [:div {:class "container"}
    [:div {:id "navbar-button-bar" :class "navbar-header"}
     [:a {:href "/about/" :class "btn btn-default navbar-btn image-button about-button navbar-right"} [:div {:class "overlay-text" :data-hover "About"}]]
     [:a {:href "/resources/" :class "btn btn-default navbar-btn image-button resources-button navbar-right"} [:div {:class "overlay-text" :data-hover "Resources"}]]
     [:a {:href "/analytics/" :class "btn btn-default navbar-btn image-button analytics-button navbar-right"} [:div {:class "overlay-text" :data-hover "Analytics"}]]
     [:a {:href "/essays/" :class "btn btn-default navbar-btn image-button essays-button navbar-right"} [:div {:class "overlay-text" :data-hover "Essays"}]]
     [:a {:href "/chattels/" :class "btn btn-default navbar-btn image-button chattels-button navbar-right"} [:div {:class "overlay-text" :data-hover "Chattels"}]]
     [:a {:href "/places/" :class "btn btn-default navbar-btn image-button places-button navbar-right"} [:div {:class "overlay-text" :data-hover "Places"}]]
     [:a {:href "/people/" :class "btn btn-default navbar-btn image-button people-button navbar-right"} [:div {:class "overlay-text" :data-hover"People"}]]
     [:a {:href "/" :class"btn btn-default navbar-btn image-button home-button navbar-right"} [:div { :class "overlay-text" :data-hover "Home"}]]
     [:a {:href "/" :class "navbar-left"} [:img {:class "logo" :src "/images/title_bar.png"}]]]]])

(defn render-site-data
  []
  [:script {:type "application/ld+json"}
   (json/generate-string
     {"@context" "http://schema.org"
      "@type" "WebSite"
      :url "http://www.normansicily.org/"
      :name "The Norman Sicily Project"
      :description
      "The Norman Sicily Project is an effort to document the cultural heritage of Sicily from c. 1061 - 1194."
      :author [{"@type" "Person"
                :name "Dawn Marie Hayes"
                :honorificSuffix "Ph.D."
                :email "mailto:dawn.hayes@montclair.edu"
                :jobTitle "Associate Professor of Medieval History"
                :url "http://www.thehayesweb.org/dhayes/"
                :sameAs ["https://worldcat.org/identities/lccn-n2002112933/",
                         "https://montclair.academia.edu/DawnMarieHayes",
                         "https://www.linkedin.com/in/dawn-marie-hayes-49b05414/",
                         "http://viaf.org/viaf/76568635",
                         "https://www.researchgate.net/profile/Dawn_Hayes3",
                         "https://www.montclair.edu/profilepages/view_profile.php?username=hayesd" ]}
               {"@type" "Person"
                :name "Joseph Hayes"
                :email "mailto:joephayes@gmail.com"
                :url "https://www.linkedin.com/in/joephayes/"
                :sameAs ["https://github.com/joephayes"]}]
      :sameAs ["https://www.facebook.com/TheNormanSicilyProject/"
               "https://twitter.com/Norman_Sicily"
               "https://www.instagram.com/thenormansicilyproject/"
               "https://github.com/the-norman-sicily-project"
               "http://www.worldcat.org/oclc/1003325014"]
      :license "http://creativecommons.org/licenses/by-sa/4.0/"})])

(defn render-footer
  []
  [:div {:class "footer"}
   [:div {:class "container"}
    [:div {:class "row bottom-padding"}
     [:div {:class "col-12-xs"}
      [:div {:class "center-block"}
       [:a {:href "https://www.facebook.com/TheNormanSicilyProject/" :class "side-padded" :target "_blank"} [:i {:class "fa fa-facebook fa-1x rounded-corner-icon" :title "Facebook"}]]
       [:a {:href "https://twitter.com/Norman_Sicily" :class "side-padded" :target "_blank"} [:i {:class "fa fa-twitter fa-1x rounded-corner-icon" :title "Twitter"}]]
       [:a {:href "https://www.instagram.com/thenormansicilyproject/?hl=en" :class "side-padded" :target "_blank"} [:i {:class "fa fa-instagram fa-1x rounded-corner-icon" :title "Instagram"}]]
       [:a {:href "https://github.com/the-norman-sicily-project" :class "side-padded" :target "_blank"} [:i {:class "fa fa-github fa-1x rounded-corner-icon" :title "GitHub"}]]]]]
    [:div {:class "row"}
     [:div {:class="col-12-xs"}
      [:div {:class "footer-links"}
       [:p
        "&copy; 2015 - 2018 by Dawn Marie Hayes and Joseph Hayes. All Rights Reserved."

        [:div {:id "license"}
         [:a {:rel "license" :href "http://creativecommons.org/licenses/by-sa/4.0/"} [:img {:alt "Creative Commons License" :style "border-width:0;padding-bottom:10px" :src "https://i.creativecommons.org/l/by-sa/4.0/88x31.png"}]] [:br ] "This " [:span {:xmlns:dct "http://purl.org/dc/terms/" :href "http://purl.org/dc/dcmitype/StillImage" :rel "dct:type"} "work"] " by " [:a {:xmlns:cc "http://creativecommons.org/ns#" :href "normansicily.org" :property "cc:attributionName" :rel "cc:attributionURL"} "Dawn Marie Hayes, Ph.D. and Joseph Hayes "] "is licensed under a" [:a {:rel "license" :href "http://creativecommons.org/licenses/by-sa/4.0/"} "  Creative Commons Attribution-ShareAlike 4.0 International License"]]]]]]]])
