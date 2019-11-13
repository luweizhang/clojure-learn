;; solution 1

(fn [num]
  (let [
        vec  (vec (map int (seq (str num))))
        len (count vec)
        end1  (int (/ len 2))
        start2 (if (odd? len) (+ end1 1) end1)
        side1 (subvec vec 0 end1)
        side2 (subvec vec start2 len)
        ]
    (= (apply + side1) (apply + side2))))
