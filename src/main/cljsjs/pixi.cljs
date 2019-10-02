(ns cljsjs.pixi
  (:require ["pixi.js" :as pixi]))

(js/goog.exportSymbol "PIXI" pixi)
