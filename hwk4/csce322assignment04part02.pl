occupiedSpaces(Game):-
    flatten(Game, FlatList),
    length(FlatList,FlatListSize),
    exclude(equalityCheck('-'), FlatList,NumsList),
    length(NumsList,Nums),
    Nums < 0.1 * FlatListSize.
% Quinn helped here!
equalityCheck(A, B):- A == B.