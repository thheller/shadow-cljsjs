(ns cljsjs.vega-embed
  (:require ["vega-embed" :as vega-embed]))

(js/goog.exportSymbol "vegaEmbed" vega-embed)