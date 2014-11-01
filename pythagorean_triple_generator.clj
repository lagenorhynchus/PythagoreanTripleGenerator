;; ピタゴラス数生成

(ns pythagorean-triple-generator
  (:require [clojure.math.numeric-tower :refer [expt gcd]]))

(defn pythagorean-triples []
  (for [c (iterate inc 1)
        b (range 1 (inc c))
        a (range 1 (inc b))
        :let [coprime (fn [x y z] (and (== (gcd x y) 1)
                                       (== (gcd y z) 1)))]
        :when (and (== (+ (expt a 2) (expt b 2)) (expt c 2))
                   (coprime a b c))]
    [a b c]))

;; 利用例
(println (take 10 (pythagorean-triples)))
