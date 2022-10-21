(ns cljsjs.vega-lite
  (:require ["vega-lite" :as vega-lite]))

(js/goog.exportSymbol "vegaLite" vega-lite)

(js/goog.exportSymbol "vl" vega-lite)