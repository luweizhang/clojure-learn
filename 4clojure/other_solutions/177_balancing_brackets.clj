;; solution 1 

(defn brackets [s]
  (empty?
   (reduce
    (fn [[left & other :as stack] right]
      (cond
       ; New char closes the inner-most open bracket -> pop inner-most.
       (= right ({\[ \], \( \), \{ \}} left)) other
       ; New char opens a new bracket -> push new bracket.
       ((set "{}[]()") right) (cons right stack)
       ; Not a bracket.
       :else stack
       )
      )
    ()
    s
    )
   )
  )

;; using reduce to iterate through the brackets (like a for loop)
;; iterate through a vector of brackets and update the accumulator
;; if the next element completes the bracket, then pop it from the stack
;; otherwise, add the next element to the stack
;; if the element is not a bracket, then ignore it 
;; at the end check if there is anything inside the accumulator
;; here, we are treating the accumulator as a stack.
  
;; solution 2
(defn balanced? [string]
  (let [pairs {\( \) \[ \] \{ \}}]
    (loop [[ch & more] string
           stack []]
      (if (nil? ch) (empty? stack)  ; at the end, non-empty stack indicates too many left symbols
          (if (pairs ch) (recur more (cons ch stack))  ; put left symbols on the stack
              (if (some #{ch} (vals pairs))  ; for right hand symbols, ensure matches top of stack
                (and (= ch (pairs (first stack))) (recur more (rest stack)))
                (recur more stack)))))))
                
                
(brackets "class Test {
      public static void main(String[] args) {
        System.out.println(\"Hello world.\");
      }
    }")
(brackets "This string has no brackets.")
(brackets "(start, end]")
(brackets "())")
(brackets "[ { ] } ")
(brackets "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))")
