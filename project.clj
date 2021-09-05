(defproject clj-lein-webapp-example "0.2.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [metosin/reitit "0.5.15"]]
  ;; :main ^:skip-aot clj-lein-webapp-example.core
  :repl-options {:init-ns clj-lein-webapp-example.server}
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler clj-lein-webapp-example.server/app}
  :profiles {:uberjar
             {:aot :all
              :uberjar-name "app.jar"}})
