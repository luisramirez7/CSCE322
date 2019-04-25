



dropn :: Integer -> [a] -> [a]
dropn 0 list = list
dropn _ [] = []
dropn n (h:t) = dropn (n-1) t
