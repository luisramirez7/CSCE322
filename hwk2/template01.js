var helpers = require( './helpers' );
var part = require( './csce322assignment02part01' );

var moves = helpers.readMovesFile('test02.moves.cnf');
var game = helpers.readGameFile('test02.game.cnf');
var beforeM = moves.slice(0);
var beforeG = game.slice(0);

var theFunction = part.onePlayerOneMove( beforeG );
var after = theFunction( beforeM[0] );
console.log( 'game' );
helpers.printGame( after );
