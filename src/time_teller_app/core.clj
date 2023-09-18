(ns time-teller-app.core
  (:require [ring.util.response :as response]
            [compojure.core :refer [defroutes GET]]))

(defn home-page [request]
  (response "Welcome to Time Teller App!"))

(defn current-time []
  (str "The current time is: " (java.time.LocalTime/now)))

(defroutes app-routes
  (GET "/" [] home-page)
  (GET "/time" [] (response (current-time))))

(def app
  (-> app-routes
      ; middlewares if any
      ))

