(fn [n seq]
  (let [k (mod n (count seq))]
    (concat (drop k seq) (take k seq))))
