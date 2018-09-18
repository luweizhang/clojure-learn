(ns ring-app.core
  (:require [compojure.core :refer :all]
            [org.httpkit.server :refer [run-server]]))


(defn cheese [] (str "I Like Cheese"))

(defroutes myapp
           (GET "/" [] "Hello World")
           (GET "/hello/:name" [name] (str "Hello " name))
           ;(GET "/cheese" (cheese))
           (GET "/is-json" []
             {:status 200 :headers {"Content-Type" "application/json"} :body "{}"})
           )

(defn -main []
  (run-server myapp {:port 5000}))


