(ns BioClojure.web.views
  (:use [hiccup core page-helpers]))

(defn index-page []
  (html5
    [:head
      [:title "BioClojure"]
      (include-css "/css/style.css")]
    [:body
      [:h1 "Welcome to the BioClojure Project"]
      [:p (slurp "README")]]))
