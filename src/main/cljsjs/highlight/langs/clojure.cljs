(ns cljsjs.highlight.langs.clojure
  (:require ["highlight.js" :as highlight]
            ["highlight.js/lib/languages/clojure" :as c]))

(.registerLanguage highlight "clojure" c)
