(ns norman-sicily-static.about)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:p "This project is an effort to document the cultural heritage of Sicily from c. 1061 – 1194, a transformative period in the island&#39;s history, by using print, photographic, web and geolocation technologies to identify and explicate dilapidated, at-risk, and/or hard-to-access monuments. The island&#39;s castles, monasteries, churches, palaces, bridges, and other monuments are housed in a NoSQL database that provides maximum flexibility of data storage as well as when information is queried and returned. The website, which is very much under construction, is being developed with a close eye toward usability that encourages both scholars and students to interact with the interface and learn more about Sicily&#39;s Norman past. Each site has its own discrete page embedded with pertinent information, including photos and display location on a regional map. The geolocation information makes it possible to travel to the site and ultimately there will be versions of the interface available to users of both tablets and mobile phones. This is especially valuable as it is difficult to reach many of these sites as they are often not well signed and at significant elevation. In time, there will be an array of visualizations available to help make sense of the data. These will include density charts for monasteries and fortifications as well as pie charts that offer information about Sicily&#39;s religious houses (Latin vs. Greek, monastic order, status, etc.). Key to this site will be several essays. Some will interpret the data we have collected against a wider historical backdrop, providing greater understanding of Norman society. Others will consider the data within a sustainability framework, assessing the sites’ stone weathering and deterioration and offering a prognosis for some of the monuments."]
       [:p "One of the most innovative aspects of this site is its focus on sustainability. In addition to treating these monuments as testaments to a vibrant past, this project also approaches them as living organisms - survivors of centuries of climactic trials and tribulations - which are in desperate need of physical examination. An ongoing collaboration with "
        [:a {:href "http://www.montclair.edu/profilepages/view_profile.php?username=popeg"} "Dr. Greg Pope"]" of MSU&#39;s "
        [:a {:href "https://www.montclair.edu/csam/earth-environment-studies/"} "Department of Earth and Environmental Studies"]" is enabling us to assess the integrity of some of these monuments and to share this information in the sites&#39; records. By doing this, The Norman Sicily Project is providing critical context as we consider not just what the monuments reveal about the past, but also what we might expect for their future survival."]
       [:p "We are grateful for the financial support this project has received from the Angelo and Mary Cali Fund for Italian Studies, an award administered by the Dean of the "
        [:a {:href "http://www.montclair.edu/chss/"} "College of Humanities and Social Sciences"]", "
        [:a {:href "http://www.montclair.edu/"} "Montclair State University (MSU)"]", from the Dean&#39;s Office itself as well as from MSU&#39;s "
        [:a {:href "https://www.montclair.edu/csam/pseg-sustainability-institute/"} "PSEG Institute for Sustainability Studies"]"."]
       [:p "More information about Dr. Hayes&#39; research on medieval Sicily is available on her "
        [:a {:href "http://www.thehayesweb.org/dhayes"} "website"]". Information about Joe Hayes, the project&#39;s primary developer, may be found on his "
        [:a {:href "https://www.linkedin.com/in/joephayes/"} "LinkedIn"]" page."]]]]]
   [:br]
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:div {:class "credits-header"} "Credits"]
       [:p "Thank you to Mel Colella, whose fine film editing skills greatly improved the opening video."]
       [:p "A special credit is extended to the many Sicilians who have provided access to so many of these sites. We hope that this project is a small reward for their kindness."]]]]]])