(ns cljsjs.showdown
  (:require ["showdown" :as x]))

(js/goog.exportSymbol "showdown" x)