module.exports = {
    onePlayerOneMove: onePlayerOneMove
}

var helpers = require('./helpers');

function onePlayerOneMove(game) {
    
    function whatever(move) {
        let rows = game.length - 1
        for (i = rows ; rows > 0; rows--) {
            if (game[rows][move - 1] == '-') {
                game[rows][move - 1] = '1';
                break;
            }

        }
        return game;
    }

    return whatever;
}
