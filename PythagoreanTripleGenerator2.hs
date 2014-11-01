-- ピタゴラス数生成2

module PythagoreanTripleGenerator2 (
  pythagoreanTriples,
  main
) where

pythagoreanTriples :: Integral a => [(a, a, a)]
pythagoreanTriples =
  [(m ^ 2 - n ^ 2, 2 * m * n, m ^ 2 + n ^ 2) |
    m <- [1..], n <- [1..(m - 1)], gcd m n == 1, odd (m - n)]

-- 利用例
main :: IO ()
main = print $ take 10 pythagoreanTriples
