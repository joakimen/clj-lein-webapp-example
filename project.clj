(defproject clj-lein-webapp-example "0.1.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring "1.9.4"]]
  :main ^:skip-aot clj-lein-webapp-example.core
  :profiles {:uberjar
             {:aot :all
              :uberjar-name "app.jar"}})
