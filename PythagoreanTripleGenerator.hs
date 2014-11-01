-- ピタゴラス数生成

module PythagoreanTripleGenerator (
  pythagoreanTriples,
  main
) where

pythagoreanTriples :: Integral a => [(a, a, a)]
pythagoreanTriples =
  [(a, b, c) | c <- [1..], b <- [1..c], a <- [1..b],
    a ^ 2 + b ^ 2 == c ^ 2, coprime a b c]
    where
      coprime x y z = gcd x y == 1 && gcd y z == 1

-- 利用例
main :: IO ()
main = print $ take 10 pythagoreanTriples
