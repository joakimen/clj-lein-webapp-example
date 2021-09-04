(ns clj-lein-webapp-example.greet)

(def routes
  ["/greet"
   {:get {:handler (fn [{{:strs [name]} :query-params}]
                     {:status 200
                      :body {:greeting (str "Hello " (or name "World") "!")}})}}])
