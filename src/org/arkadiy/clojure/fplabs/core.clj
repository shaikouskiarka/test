(ns org.arkadiy.clojure.fplabs.core
  (:gen-class))

(require 'org.arkadiy.clojure.fplabs.clusterization.estimation)
(refer 'org.arkadiy.clojure.fplabs.clusterization.estimation)

(defn -main
  [& args]
  (if-not (first args)
    (println "Pass lab number as command line argument")
    (case (first args)
      "1" (run-estimation (first (rest args))))))