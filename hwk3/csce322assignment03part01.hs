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
     let result = onePlayerOneMove game (head moves)
     printGame result

-- YOUR CODE SHOULD COME AFTER THIS POINT
onePlayerOneMove :: [[Char]] -> Int -> [[Char]]
onePlayerOneMove game move = playerMoveOnce game (move - 1) '1'

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