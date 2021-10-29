(defproject town.lilac/pyramid "3.1.1"
  :description "A library for storing and querying graph data in a Clojure map"
  :url "https://github.com/lilactown/pyramid"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v20.html"}
  :source-paths ["src"]
  :dependencies [[edn-query-language/eql "1.0.1"]
                 [fast-zip/fast-zip "0.7.0"]]
  :deploy-repositories [["snapshots" {:sign-releases false
                                      :url "https://clojars.org"
                                      :creds :gpg}]])
