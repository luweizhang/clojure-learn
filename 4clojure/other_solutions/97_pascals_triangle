;; solution 1
;; use non tail recursion 
;; shift the last row to the left and right and add them together to get the next row

(fn pascal-tri [n]
  (condp = n
    1 [1]
    (let [last (pascal-tri (dec n))
          last-a (concat [0] last)
          last-b (concat last [0])]
      (vec(map + last-a last-b)))))
