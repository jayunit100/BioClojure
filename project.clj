(defproject BioClojure "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [commons-lang "2.3"]
                 [compojure "0.6.4"]
                 [hiccup "0.3.6"]]
  :dev-dependencies [[lein-ring "0.4.5"]]
  :ring {:handler BioClojure.web.core/app})
