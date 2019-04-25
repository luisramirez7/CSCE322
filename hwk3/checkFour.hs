


checkFour :: [[a]] -> Bool
checkFour [] = False
checkFour (row:rows)
	  | checkFourRow row = True
	  | checkFourRow col = True
	  | checkFour rows = True
	  | checkFour cols = True
	  | checkFourDiag (getDiag (row:rows)) = True
	  where (col:cols) = ourTranspose (row:rows)

getDiag :: [[a]] -> [a]
getDiag (row:rows)
	| ((length row) >= 4) && (length (row:rows) >= 4) = ourDiag
	| otherwise	      	 	 	       	  = []
	where ourDiag = first ++ secnd ++ third ++ frth 
	      first   = [head row]
	      secnd   = [(head (tail (head rows)))]
	      third   = [(head (drop 2 (head (drop 1 rows))))]
	      frth    = [(head (drop 3 (head (drop 2 rows))))]

checkFourRow :: [a] -> Bool
checkFourRow _ = True

checkFourDiag :: [[a]] -> Bool
checkFourDiag = True

getElement :: [a] -> Integer -> a
getElement (el:els) 0 = el
getElement (el:els) n = getElement els (n-1)

getCol :: [[a]] -> Integer -> [a]
getCol [row] co = [(getElement row co)]
getCol (row:rows) co = (getElement row co):(getCol rows co)

dropFirstCol :: [[a]] -> [[a]]
dropFirstCol [] = []
dropFirstCol (row:rows) = (tail row):(dropFirstCol rows)

ourTranspose :: [[a]] -> [[a]]
ourTranspose [] = []
ourTranspose (row:rows)
	          | (length row) == 0 = []
		  | otherwise	      = (getCol (row:rows) 1):(ourTranspose (dropFirstCol (row:rows)))

