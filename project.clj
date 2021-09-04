(defproject clj-lein-webapp-example "0.1.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [metosin/reitit "0.5.15"]]
  ;; :main ^:skip-aot clj-lein-webapp-example.core
  :repl-options {:init-ns clj-lein-webapp-example.server}
  :profiles {:uberjar
             {:aot :all
              :uberjar-name "app.jar"}})
