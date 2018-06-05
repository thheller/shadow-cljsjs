(ns cljsjs.oauthio
  (:require ["oauthio-web" :refer [OAuth]]))

(js/goog.exportSymbol "OAuth" OAuth)
