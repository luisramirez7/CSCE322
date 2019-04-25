grammar csce322assignment01part02;

@members {
    int pieces = 0;
    boolean inputValid = true;
    int rowCounter = 1;
    int colCounter = 0;
    int numMoves = 0; 
    int playersPresent = 0;
}
// rules
connectFour : ((game moves) endOfFile | (moves game)) endOfFile | error;
moves: moveTitle beginSection beginMoves (move '_')* move endMoves endSection | error;
game: gameTitle beginSection beginGame row* lastrow endGame endSection | error;

row: column+ endRow;
lastrow : column+;
column: (gameNum | hyphen);
gameNum: MOVE{
    colCounter++;
    pieces++;
    if(Integer.parseInt($MOVE.text) > playersPresent ){
        playersPresent = Integer.parseInt($MOVE.text);
    }
    } | error;
hyphen: GAME{colCounter++;} | error;

move: MOVE{
    if(Integer.parseInt($MOVE.text) > numMoves){
        numMoves = Integer.parseInt($MOVE.text);
    }
} | error;

moveTitle: MOVETITLE{} | error;
gameTitle: GAMETITLE{} | error;

endRow: ROWEND{rowCounter++;}|error;

beginSection: BEGIN{}|error;
endSection: END{}|error;

beginGame: GAMEBEGIN{}|error;
endGame: GAMEEND{}|error;

beginMoves: MOVEBEGIN{}|error;
endMoves: MOVEENDING{}|error;

error: ERRORTOKEN {System.out.println("SYNTAX PROBLEM ON LINE " + $ERRORTOKEN.line); System.exit(1);};
endOfFile: EOF {
    colCounter = colCounter / rowCounter;
    if(playersPresent < 2){
        System.out.println("SEMANTIC PROBLEM 1");
        inputValid = false;
    }
    if(rowCounter < 6 || rowCounter > 10 ){
        System.out.println("SEMANTIC PROBLEM 2");
        inputValid = false;
    }
    if(colCounter < 6 || colCounter > 10){
        System.out.println("SEMANTIC PROBLEM 3");
        inputValid = false;
    }
    if(numMoves > colCounter){
        System.out.println("SEMANTIC PROBLEM 4");
        inputValid = false;
    }
    if(inputValid == true ){
        System.out.println(pieces + " pieces have been played");
    }
};


// tokens
BEGIN: '/*';
END: '*/';
MOVETITLE: 'moves';
GAMETITLE: 'game';
MOVE: [0-9]+;
GAME: '-';
ROWEND: '|';
GAMEBEGIN: '[';
GAMEEND: ']';
MOVEBEGIN: '{';
MOVEENDING: '}';
WS: [ \n\t\r]+ { skip(); };
ERRORTOKEN: .;