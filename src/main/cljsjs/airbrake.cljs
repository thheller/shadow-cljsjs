(ns cljsjs.airbrake
  (:require ["airbrake-js" :as airbrake]))

(js/goog.exportSymbol "airbrake" airbrake)
