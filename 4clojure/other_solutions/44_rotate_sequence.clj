;; solution 1
(fn [n seq]
  (let [k (mod n (count seq))]
    (concat (drop k seq) (take k seq))))

;; solution 2
(fn [n x]
  (take (count x)
        (drop (mod n (count x))
              (cycle x))))
