(ns cljsjs.keycloak-js
  (:require ["keycloak-js" :as keycloak-js]))

(js/goog.exportSymbol "Keycloak" keycloak-js)
