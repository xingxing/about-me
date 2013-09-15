(defproject about-me "0.1.0-SNAPSHOT"
  :description "我的日记本"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [ring "1.2.0"]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler about-me.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]
                        [ring-serve "0.1.2"]
                        [enlive "1.1.4"]]}})
