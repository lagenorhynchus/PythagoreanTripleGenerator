;; ピタゴラス数生成2

(ns pythagorean-triple-generator2
  (:require [clojure.math.numeric-tower :refer [expt gcd]]))

(defn pythagorean-triples []
  (for [m (iterate inc 1)
        n (range 1 m)
        :when (and (== (gcd m n) 1)
                   (odd? (- m n)))]
    [(- (expt m 2) (expt n 2)) (* 2 m n) (+ (expt m 2) (expt n 2))]))

;; 利用例
(println (take 10 (pythagorean-triples)))
