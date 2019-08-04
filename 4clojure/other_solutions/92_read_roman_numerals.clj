;;doesn't work because it doesnt skip the next pair after noticing the subtractive rule...
(defn rnum-to-num [rnums]
  (let [d-rnums {:M 1000
                 :C 100
                 :L 50
                 :X 10
                 :V 5
                 :I 1
                 }
        lookup (fn [num-str] ((keyword (str num-str)) d-rnums))
        num-par (partition 2 1 rnums)
        parse-pair (fn [pair] (println pair) (if
                                (>= (lookup (first pair)) (lookup (second pair))) ;; if first is greater than second
                                (lookup (first pair)) ;; then first, else second minus first
                                (- (lookup (second pair)) (lookup (first pair)))
                                ) )
        ]
    (println num-par)
    (println (keyword (str (first (first num-par)))))
    (map parse-pair num-par)
    ;;(reduce + (map parse-pair num-par))
    )
)

(rnum-to-num "MMMCMXCIX");;5099 (wrong answer should be 3999)

;; this works, uses the reverse / *4 trick
(fn [s]
  (let [numerals {\I 1, \V 5, \X 10, \L 50, \C 100, \D 500, \M 1000}
        add-numeral (fn [n t]
                      (if (> n (* 4 t))
                        (- n t)
                        (+ t n)))
        ]
    (reduce add-numeral (map numerals (reverse s)))
    ))
