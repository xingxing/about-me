(ns about-me.handler
  (:use compojure.core
        net.cgrand.enlive-html)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :as ring-res]
            [ring.adapter.jetty :as ring-adpt]))

(deftemplate the-index "index.html" []
  [:title] (content "s"))

(defroutes app-routes
  (GET "/" [] (the-index))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))


(defn -main [port]
  (let [port-int (Integer. port)]
    (ring-adpt/run-jetty #'app {:port (or port-int 8080) :join? false})))
  

