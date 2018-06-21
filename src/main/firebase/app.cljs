(ns firebase.app
  (:require ["@firebase/app" :refer (firebase)]))


(js/goog.exportSymbol "firebase" firebase)
