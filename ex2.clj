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


(def x (range 1 10))
(def y [1 2 3 4 5])
(def z '(6 7 8 9))

(println "----------------------- MAP -----------------------")
(println x)
(println (map inc x))

(println "----------------------- REDUCE -----------------------")
(println (reduce + x))

(println "----------------------- POP -----------------------")
(println (pop y))
(println (pop z))

(println "----------------------- PEEK -----------------------")
(println (peek y))
(println (peek z))

(println "----------------------- CONVERT COLLECTIONS -----------------------")
(println (map inc x))
(println (into [] (map inc x)))

(println "----------------------- GROUP BY -----------------------")
(println (group-by even? x))

(println "----------------------- CONTAINS -----------------------")
(println (contains? y 2))

(println "----------------------- RECORD (kinda) -----------------------")
(def x {:name "Helder", :surname "De Oliveira"})
(println x)
(println (class x))
(println (contains? x :name))
(println (contains? x :name))

(println "----------------------- A NOT-SO-READABLE FIZZBUZZ -----------------------")
(defn fizzbuzz [ns]
  (map
       (fn [n] (cond
                 (= 0 (mod n 15)) "FizzBuzz"
                 (= 0 (mod n 3)) "Fizz"
                 (= 0 (mod n 5)) "Buzz"
                 :else n
                 )) ns))
(println (fizzbuzz '(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)))

(println "----------------------- A MORE READABLE FIZZBUZZ -----------------------")
(defn innerfizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "FizzBuzz"
    (= 0 (mod n 3)) "Fizz"
    (= 0 (mod n 5)) "Buzz"
    :else n
    ))

(defn fizzbuzz [ns]
  (map innerfizzbuzz ns))

(println (fizzbuzz '(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)))
