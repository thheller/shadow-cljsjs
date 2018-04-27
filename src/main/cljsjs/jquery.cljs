(ns cljsjs.jquery
  (:require ["jquery" :as jquery]))

(js/goog.exportSymbol "jQuery" jquery)
