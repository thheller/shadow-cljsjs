(ns cljsjs.amplitude
  (:require ["amplitude-js" :as amplitude]))

(js/goog.exportSymbol "amplitude" amplitude)
