(ns cljsjs.moment
  (:require ["moment" :as moment]))

(js/goog.exportSymbol "moment" moment)
