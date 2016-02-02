(ns wonderland-number.finder)

(defn- digits [number]
  (sort (str number)))

(defn- correct-digits? [number]
  (->> (map #(* number %) (range 2 7))
       (map digits)
       (every? #(= (digits number) %))))

(defn wonderland-number []
  (first
    (filter
	     correct-digits?
	      (range 100000 1000000))))
