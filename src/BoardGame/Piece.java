package BoardGame;

public class Piece {

    private Position position;
    private Board board;

    public Piece(Board board){
        this.board = board;
        position = null;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    protected Board getBoard() {
        return board;
    }

    //toString se pa!
}
