package Chess;

public class Move {

    private Box start;
    private Box end;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private Player player;
    private MoveType moveType;

    public Move(Box start, Box end, Piece pieceMoved, Piece pieceKilled, Player player, MoveType moveType) {
        this.start = start;
        this.end = end;
        this.pieceMoved = pieceMoved;
        this.player = player;
        this.moveType = moveType;
    }

    public Box getStart() {
        return start;
    }

    public Box getEnd() {
        return end;
    }

    public Piece getPieceMoved() {
        return pieceMoved;
    }

    public Piece getPieceKilled() {
        return pieceKilled;
    }

    public Player getPlayer() {
        return player;
    }

    public MoveType moveType() {
        return moveType;
    }
}
