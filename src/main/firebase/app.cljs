(ns firebase.app
  {:skip-goog-provide true}
  (:require ["@firebase/app" :refer (firebase)]))

(js/goog.exportSymbol "firebase" firebase)
