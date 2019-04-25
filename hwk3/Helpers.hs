module Helpers
( readConnectFourFile
, printGame
) where

import Prelude
import Data.Char
import Data.List
import Debug.Trace

readConnectFourFile :: String -> IO ([[Char]],[Int])
readConnectFourFile = readIO

printGame :: [[Char]] -> IO ()
printGame [] = do
	       print ""
printGame (row:rows) = do
	  	       print row
		       printGame rows

