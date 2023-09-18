(ns time-teller-app.core
  (:require [ring.adapter.jetty :as jetty]))

(defn app [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body (str "The current time is: " (java.time.LocalTime/now))})

(defn -main [& args]
  (jetty/run-jetty app {:port 3030}))
