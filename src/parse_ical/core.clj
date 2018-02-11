(ns parse-ical.core)

(defrecord vcalendar [prodid
                      version
                      calscale
                      events])

(defrecord vevent [dtstamp
                   dtstart
                   dtend
                   uid
                   summary
                   description
                   location])
(defn split-by-newline [s] (clojure.string/split s #"\n"))

(defn begin-vcalendar? [s] (= s "BEGIN:VCALENDAR"))
(defn end-vcalendar? [s] (= s "END:VCALENDAR"))
(defn begin-event? [s] (= s "BEGIN:VEVENT"))
(defn end-event? [s] (= s "END:VEVENT"))

(defn parse-ical
  "Parses the passed string as an iCalendar"
  [s]
  (let [lines (split-by-newline s)]
    (reduce 
      (fn [acc s] 
        (if ()) [] s))))
