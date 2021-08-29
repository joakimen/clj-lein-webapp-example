(ns clj-lein-webapp-example.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [ring.util.response :refer [response]])
  (:gen-class))

(defn handler [request]
  (response "Hello, World!"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (run-jetty handler {:port 3000}))
