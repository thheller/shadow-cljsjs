(ns cljsjs.react.dom.server
  (:require ["react-dom/server" :as rdom]))

(js/goog.exportSymbol "ReactDOMServer" rdom)