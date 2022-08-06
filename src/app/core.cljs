(ns app.core
  (:require [reagent.core :as r] 
            [reagent.dom :as rdom]))

(defonce db (r/atom {:message "Hello"}))

(defn root []
  [:h1 (:message @db)])

(defn main []
  (rdom/render [root] (js/document.getElementById "app")))

(set! (.-onload js/window) main)
