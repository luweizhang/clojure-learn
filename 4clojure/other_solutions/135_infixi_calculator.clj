(fn infix [& args]
  (reduce (fn [a [op b]] (op a b))
          (first args)
          (partition 2 (rest args))))
