package JigsawPuzzle;

import java.util.List;

public class Puzzle {

    private List<List<Piece>> board;
    private List<Piece> free;
    public void insertPiece(Piece piece, int row, int column) {}

    private static Puzzle puzzle = null;

    public static Puzzle getInstance() {
        if (puzzle == null) {
            puzzle = new Puzzle();
        }
        return puzzle;
    }
}
