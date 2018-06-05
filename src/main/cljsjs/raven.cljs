(ns cljsjs.raven
  (:require ["raven-js" :as Raven]))

(js/goog.exportSymbol "Raven" Raven)
