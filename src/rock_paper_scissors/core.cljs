(ns rock-paper-scissors.core
  (:require [reagent.core :as reagent]
            [reagent.dom :as dom]
            [re-frame.core :as re-frame]
            [rock-paper-scissors.events :as events]
            [rock-paper-scissors.views :as views]
            [rock-paper-scissors.config :as config]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (dom/render [views/main-panel]
              (.getElementById js/document "root")))

(defn ^:export init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
