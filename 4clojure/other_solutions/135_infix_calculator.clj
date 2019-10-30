;; http://www.4clojure.com/problem/135

;; reduce takes two inputs, the accumulated output so far, and a vector of new inputs
;; basically, you take the first arg, and partition the rest of the args, and access them with the [op b]

(fn infix [& args]
  (reduce (fn [a [op b]] (op a b))
          (first args)
          (partition 2 (rest args))))


;; e.g. (infix 1 + 7 - 3 + 5) returns 10

