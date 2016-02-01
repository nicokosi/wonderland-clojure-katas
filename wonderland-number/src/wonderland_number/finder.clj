(ns wonderland-number.finder)

(defn- digits [number]
  (sort (str number)))

(defn- having-correct-digits [number]
  (let [number-digits (digits number)]
    (and
      (= number-digits (digits (* 2 number)))
      (= number-digits (digits (* 3 number)))
      (= number-digits (digits (* 4 number)))
      (= number-digits (digits (* 5 number)))
      (= number-digits (digits (* 6 number)))
    )
  )
)

(defn wonderland-number []
  (first
    (filter
	     having-correct-digits
	      (range 100000 1000000))))
