(ns cljsjs.katex
  (:require ["katex/dist/katex.min.js" :as x]))

(js/goog.exportSymbol "katex" x)