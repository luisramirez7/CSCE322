%Quinn helped me a lot with this
notDiagonal(Game):- length(Game,1).
notDiagonal([TopRow|Tail]):- nth0(0, Tail, SecondObject),
    check(TopRow, SecondObject),
    notDiagonal(Tail).
check(Top, _):- length(Top, 1).
check([A| Top], [C|SecondObject]):- A == '-',
    C == '-',
    check(Top, SecondObject).

check([A|Top], [C|SecondObject]):- A \== '-',
    nth0(0, SecondObject, D),
    A \== D,
    C == '-',
    check(Top,SecondObject).

check([A| Top], [C|SecondObject]):- A == '-',
    C \== '-',
    nth0(0,Top,B),
    C \== B,
    check(Top, SecondObject).

check([A| Top], [C|SecondObject]):- A \== '-',
    C \== '-',
    nth0(0,Top,B),
    nth0(0,SecondObject,D),
    A \== D,
    B \== C,
    check(Top, SecondObject).