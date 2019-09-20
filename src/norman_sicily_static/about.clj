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
       [:p "We are grateful for the financial support this project has received from the Angelo and Mary Cali Fund for Italian Studies,
           an award administered by the Dean of the "
        [:a {:href "http://www.montclair.edu/chss/"} "College of Humanities and Social Sciences"]", "
        [:a {:href "http://www.montclair.edu/"} "Montclair State University (MSU)"]", from the "
        [:a {:href "https://www.montclair.edu/chss/about-the-college/deans-office/"} "CHSS Dean&#39;s Office"]
        " itself, from the Herman and Margaret Sokol Faculty/Student Research Grant Program that is administered by MSU&#39;s "
        [:a {:href "https://www.montclair.edu/csam/"} "College of Science and Mathematics"]
        " (CSAM) as well as from MSU&#39;s "
        [:a {:href "https://www.montclair.edu/csam/pseg-sustainability-institute/"} "PSEG Institute for Sustainability Studies"]"."
        " In addition, we are also enormously grateful for the support of the " [:a {:href "https://www.neh.gov/"} "National Endowment for the Humanities"]
        ", whose logo appears below, for the generous grant it awarded the project for the 2019-2020 academic year through its "
        [:a {:href "https://www.neh.gov/grants/preservation/humanities-collections-and-reference-resources"} "Humanities Collections and Reference Resources"]
        " program."
        [:a {:href "https://www.neh.gov/"}
         [:img {:class "img-responsive centered-responsive-img in-text-img" :src "/images/NEH-Preferred-Seal820.jpg"
                :alt "National Endowment for the Humanities logo"}]]]
       [:p "More information about Dr. Hayes&#39; research on medieval Sicily is available on her "
        [:a {:href "http://www.thehayesweb.org/dhayes"} "website"]". Information about Joe Hayes, the project&#39;s primary developer, may be found on his "
        [:a {:href "https://www.linkedin.com/in/joephayes/"} "LinkedIn"]" page."]]]]]
   [:br]
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "inner"}
      [:div {:class "text-center"}
       [:div {:class "credits-header"} "Credits"]
       [:p "A number of " [:a {:href "http://www.montclair.edu/"} "Montclair State University"]
        " students have been playing critical roles in the development of this site as
        it gets off the ground. Ryan Marshall (" [:a {:href "https://www.montclair.edu/csam/"} "CSAM"]
        ", 2019) helped develop the interactive map that enables the site's users to engage the data.
        Isamar Cortes (" [:a {:href "https://www.montclair.edu/csam/"} "CSAM"]
        ", 2019) was also instrumental; her experience with various GIS packages
        to create elevations and maps that allow for the visualization of data
        in their geographical contexts has been invaluable. Another important member
        of our team, Jamila Haramuniz (" [:a {:href "https://www.montclair.edu/csam/"} "CSAM"]
        ", 2020), has kindly been loaning her prodigious statistical skills as well
        as her knowledge of R to the project, making it possible to consider the
        data in new ways. In addition, Matthew Parlapiano (" [:a {:href "https://www.montclair.edu/cehs/"} "CEHS"]
        ", 2019) did a fine job of extracting data from Alexander of Telese's " [:em "History"]
        ", performing the tedious work of preparing the text for machine processing. We are enormously grateful to each of them."]
       [:p "Other assistance was generously offered by Max Wilson (B.A., "
        [:a {:href "http://yale.edu/"} "Yale University"] ", 2019), who served as a research assistant during the project's 2019 fieldwork. That same summer, Anastasia Hayes (B.A., "
        [:a {:href "https://macaulay.cuny.edu/" } "Macaulay Honors College"] ", " [:a {:href "https://www.cuny.edu/"} "CUNY"] ", 2017) provided invaluable translation support and participated in data collection as Madeleine Hayes (B.A., "
        [:a {:href "https://macaulay.cuny.edu/" } "Macaulay Honors College"] ", " [:a {:href "https://www.cuny.edu/"} "CUNY"] ", 2018) navigated and managed logistics of travel."]
       [:p "We are also grateful to Mel Colella, whose fine editing skills greatly improved the opening video."]
       [:p "Last but not least, an enormous debt of gratitude is owed to the countless Sicilians who, in numerous ways,
           have helped make this project possible. We hope that this effort is a small repayment for their unfailing kindness and generosity."]]]]]])
