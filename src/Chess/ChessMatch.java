package Chess;

import BoardGame.Board;
import BoardGame.Position;
import chesspieces.King;
import chesspieces.Rook;

public class ChessMatch {

    private final Board board;

    public ChessMatch(){
        board = new Board(8 ,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumn()];
        for(int i = 0; i<board.getRows();i++){
            for(int j = 0; j<board.getColumn(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(2,1));
        board.placePiece(new King(board, Color.WHITE), new Position(7,4));
    }

}
