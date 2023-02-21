(println "----------------------- FIZZBUZZ -----------------------")
(defn fizzbuzz [ns]
  (for [n ns]
    (cond
      (= 0 (mod n 15)) "FizzBuzz"
      (= 0 (mod n 3)) "Fizz"
      (= 0 (mod n 5)) "Buzz"
      :else n
      )))
(println (fizzbuzz '(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)))


(println "----------------------- MAP -----------------------")
(def x (range 1 10))
(println x)
(println (map inc x))
