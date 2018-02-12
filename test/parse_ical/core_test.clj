(ns parse-ical.core-test
  (:require [clojure.test :refer :all]
            [parse-ical.core :refer :all]))

(deftest parse-ical-test
  (testing "Parses empty calendar"
    (is (=
      (parse-ical "BEGIN:VCALENDAR\nPRODID:FOO\nVERSION:2.0\nEND:VCALENDAR ")
      { :prodid "FOO" :version "2.0" :calscale "" :events []})))
  ; (testing "Parses calendar with one event"
  ;   (is (=
  ;     (parse-ical ""))))
      )
