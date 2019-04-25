columnsAndMoves([H|T],Moves):-
    length(Moves,MovesCounter),
    length(H, ColumnCounter),
    0 is mod(MovesCounter,2),
    0 is mod(ColumnCounter, 2).

columnsAndMoves([H|T], Moves):-
    length(Moves,MovesCounter),
    length(H, ColumnCounter),
    1 is mod(MovesCounter, 2),
    1 is mod(ColumnCounter, 2).