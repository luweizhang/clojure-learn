;; test cases

(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))

(= (__ '((((:a))))) '(:a))

;; solution 1

(fn f [[h & t]]
  (cond
    (nil? h) ()
    (sequential? h) (concat (f h) (f t))
    true (cons h (f t))))
