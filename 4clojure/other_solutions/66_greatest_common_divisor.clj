;; solution 1

;; filter out all numbers from 1 to n that have a non-zero remainder and store into a set
;; find the intersection between those two sets
;; get that max of that intersection

(fn [a b]
  (let [get-divisor (fn [n] (into #{}
                              (filter #(zero? (rem n %))
                                      (range 1 (inc n)))
                              ))
        a-divisor (get-divisor a)
        b-divisor (get-divisor b)
        commom-divisor (clojure.set/intersection a-divisor b-divisor)]
    (apply max commom-divisor)))
