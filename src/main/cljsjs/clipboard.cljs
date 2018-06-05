(ns cljsjs.clipboard
  (:require ["clipboard" :as clipboard]))

(js/goog.exportSymbol "Clipboard" clipboard)
