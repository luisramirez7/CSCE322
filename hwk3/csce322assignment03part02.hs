import Prelude
import System.Environment ( getArgs )
import Data.List
import Helpers

-- The main method that will be used for testing / comgand line access
main = do
     args <- getArgs
     filename <- readFile (head args)
     (game,moves) <- readConnectFourFile filename
     print "Result"
     let result = onePlayerManyMoves game moves
     printGame result

-- YOUR CODE SHOULD COME AFTER THIS POINT
onePlayerManyMoves :: [[Char]] -> [Int] -> [[Char]]
onePlayerManyMoves game [] = game
onePlayerManyMoves game (move:moves) 
    | winConnectFour game = game
    | otherwise = onePlayerManyMoves (playerMoveOnce game (move - 1) '1') moves

playerMoveOnce :: [[Char]] -> Int -> Char -> [[Char]]
playerMoveOnce [] _ _ = []
playerMoveOnce game col player = gameTwo where
    row = findRowValid game col 0
    gameTwo = setPiece game (row,col) player

findRowValid :: [[Char]] -> Int -> Int -> Int
findRowValid [] _ num = num - 1
findRowValid (row : rows) col num = if (row !! col) == '-'
                                    then findRowValid rows col (num+1)
                                    else num - 1

setPiece :: [[Char]] -> (Int,Int) -> Char -> [[Char]]
setPiece [] (_,_) _ = []
setPiece (row:rows) (0,col) player = (setSecondPiece row col player):rows
setPiece (row:rows) (r,col) player = row:(setPiece rows (r-1,col) player)

setSecondPiece :: [Char] -> Int -> Char -> [Char]
setSecondPiece [] _ _ = []
setSecondPiece (col:cols) 0 player = player:cols
setSecondPiece (col:cols) c player = col:(setSecondPiece cols (c-1) player)

winConnectFour :: [[Char]] -> Bool
winConnectFour game
    | checkFourHorizontal game 0 = True
    | checkFourVertical game = True
    | checkFourDiagUp game = True
    | checkFourDiagDown game 0 = True
    | otherwise = False

checkFourHorizontal :: [[Char]] -> Int -> Bool
checkFourHorizontal [] _ = False
checkFourHorizontal (row:rows) i
    | i > (length row) - 4 = checkFourHorizontal rows 0
    | row !! i /= '-' && row !! i == row !! (i+1) && row !! i == row !! (i+2) && row !! i == row !! (i+3) = True
    | otherwise = checkFourHorizontal (row:rows) (i+1)

checkFourVertical :: [[Char]] -> Bool
checkFourVertical game = checkFourHorizontal (transpose game) 0

checkFourDiagUp :: [[Char]] -> Bool
checkFourDiagUp game = checkFourDiagDown (reverse game) 0

checkFourDiagDown :: [[Char]] -> Int -> Bool
checkFourDiagDown game i
    | (length game) < 4 = False
    | i > ((length (game !! 0)) - 4) = checkFourDiagDown (tail game) 0
    | (game !! 0) !! i /= '-' && (game !! 0) !! i == (game !! 1) !! (i+1) && (game !! 0) !! i == (game !! 2) !! (i+2) &&(game !! 0) !! i == (game !! 3) !! (i+3) = True
    | otherwise = checkFourDiagDown game (i+1)