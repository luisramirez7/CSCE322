grammar csce322assignment01part01;

// rules
connectFour : ((game moves) | (moves game)) EOF {System.out.println("End of File");} | error;
moves: moveTitle beginSection beginMoves (move '_')* move endMoves endSection;
game: gameTitle beginSection beginGame row* lastrow endGame endSection;

row: column+ endRow;
lastrow : column+;
column: (gameNum | hyphen);
gameNum: MOVE{System.out.println("Number: " + $MOVE.text);} | error;
hyphen: GAME{System.out.println("Space: Empty");} | error;

move: MOVE{System.out.println("Number: " + $MOVE.text);} | error;

moveTitle: MOVETITLE{System.out.println("Moves Section");} | error;
gameTitle: GAMETITLE{System.out.println("Game Section");} | error;


endRow: ROWEND{System.out.println("End of Row");}|error;

beginSection: BEGIN{System.out.println("Beginning of Section");}|error;
endSection: END{System.out.println("End of Section");}|error;

beginGame: GAMEBEGIN{System.out.println("Start of Game");}|error;
endGame: GAMEEND{System.out.println("End of Game");}|error;

beginMoves: MOVEBEGIN{ System.out.println("Beginning of List");}|error;
endMoves: MOVEENDING{System.out.println("End of List");}|error;

error: ERRORTOKEN {System.out.println("SYNTAX PROBLEM ON LINE " + $ERRORTOKEN.line); System.exit(1);};

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