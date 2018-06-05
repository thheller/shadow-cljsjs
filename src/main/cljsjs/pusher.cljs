(ns cljsjs.pusher
  (:require ["pusher-js" :as Pusher]))

(js/goog.exportSymbol "Pusher" Pusher)
