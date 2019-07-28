(defn is-palindromic [num]
  "function to detect a palindromic number"
  (let [num-string (str num)
        reverse-num (Integer. (clojure.string/reverse  num-string))]
    (if (= num reverse-num)
      true
      false)
    )
  )

(defn palin-lazy [n]
  "how many palindromic numbers do you want? starting from 0"
  (take n (filter is-palindromic (range)))
  )

(palin-lazy 20)
(palin-lazy 300)

(is-palindromic 121)
(is-palindromic 123)
(is-palindromic 123454321)
