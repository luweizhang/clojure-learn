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
                                (>= (lookup (first pair)) (lookup (second pair)))
                                (lookup (first pair))
                                (- (lookup (second pair)) (lookup (first pair)))
                                ) )
        ]
    (println num-par)
    (println (keyword (str (first (first num-par)))))
    (map parse-pair num-par)
    ;;(reduce + (map parse-pair num-par))
    )
)


;; if first is greater than second
;; then first, else second minus first


(rnum-to-num "MMMCMXCIX")
