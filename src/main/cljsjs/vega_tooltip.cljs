(ns cljsjs.vega-tooltip
  (:require ["vega-tooltip" :as vega-tooltip]))

(js/goog.exportSymbol "vegaTooltip" vega-tooltip)