module.exports = {
    onePlayerManyMoves: onePlayerManyMoves
}

var helpers = require('./helpers');

function onePlayerManyMoves(game) {

    function whatever(moves) {
        for (let i = 0; i < moves.length; i++) {
            game = changeBoard(game, moves[i]);
            gameStatus = checkGameStatus(game);
            if (gameStatus != 0) {
                break;
            }
        }
        return game;
    }

    return whatever;
}

function checkGameStatus(game) {
    for (let i = 0; i < game.length; i++) {
        for (let j = 0; j < game[0].length - 3; j++) {
            if (game[i][j] != '-' && game[i][j] == game[i][j + 1] && game[i][j + 1] == game[i][j + 2] && game[i][j + 2] == game[i][j + 3]) {
                return 1;
            }
        }
    }
    /*
    *  Check for vertical connect four in the win condition
    */
    for (let i = 0; i < game.length - 3; i++) {
        for (let j = 0; j < game[0].length; j++) {
            if (game[i][j] != '-' && game[i][j] == game[i + 1][j] && game[i + 1][j] == game[i + 2][j] && game[i + 2][j] == game[i + 3][j]) {
                return 1;
            }
        }
    }

    for (let i = 0; i < game.length - 3; i++) {
        for (let j = 0; j < game[0].length - 3; j++) {
            if (game[i][j] != '-' && game[i][j] == game[i + 1][j + 1] && game[i + 1][j + 1] == game[i + 2][j + 2] && game[i + 2][j + 2] == game[i + 3][j + 3]) {
                return 1;
            }
        }
    }
    /*
    *  Check for diagonal connect four in the backwards position win condition
    */
    for (let i = 3; i < game.length; i++) {
        for (let j = 0; j < game[0].length - 3; j++) {
            if (game[i][j] != '-' && game[i][j] == game[i - 1][j + 1] && game[i - 1][j + 1] == game[i - 2][j + 2] && game[i - 2][j + 2] == game[i - 3][j + 3]) {
                return 1;
            }
        }
    }
    return 0;
}

function changeBoard(game, move) {
    let rows = game.length - 1
    for (i = rows; rows > 0; rows--) {
        if (game[rows][move - 1] == '-') {
            game[rows][move - 1] = '1';
            break;
        }
    }
    return game;
}