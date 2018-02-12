(ns parse-ical.core
  (:require [clojure.string :as s :refer [split trim]]))

(set! *warn-on-reflection* true)

(defrecord vcalendar [prodid version calscale events])

(defrecord vevent [dtstamp dtstart dtend uid summary description location])

(defn- split-by-newline [s] (s/split s #"\n"))
(defn- split-into-calendars [s] (s/split s #"(?i)END:VCALENDAR"))

(def ^:private vcalendar-begin? (partial = "BEGIN:VCALENDAR"))
(def ^:private vcalendar-end? (partial = "END:VCALENDAR"))
(def ^:private vevent-begin? (partial = "BEGIN:VEVENT"))
(def ^:private vevent-end? (partial = "END:VEVENT"))

(defn parse-ical
  "Parses the passed string as an iCalendar file containing one or more actual iCalendars"
  [s]
  (let [calendars (split-into-calendars (s/trim s))
        coo (prn calendars)]))
