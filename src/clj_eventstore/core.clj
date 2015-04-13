(ns clj-eventstore.core
    (:require [taoensso.faraday :as far])
    (:gen-class))

(def client-opts
  {;;; For DDB Local just use some random strings here, otherwise include your
   ;;; production IAM keys:
   :access-key "<AWS_DYNAMODB_ACCESS_KEY>"
   :secret-key "<AWS_DYNAMODB_SECRET_KEY>"

   ;;; You may optionally override the default endpoint if you'd like to use DDB
   ;;; Local or a different AWS Region (Ref. http://goo.gl/YmV80o), etc.:
   :endpoint "http://localhost:8091"                   ; For DDB Local
   ;; :endpoint "http://dynamodb.eu-west-1.amazonaws.com" ; For EU West 1 AWS region
   })

(far/list-tables client-opts)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
