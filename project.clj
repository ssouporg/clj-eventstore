(defproject clj-eventstore "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-beta1"]
                 [com.taoensso/faraday "1.6.0"]]
  :main ^:skip-aot clj-eventstore.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
