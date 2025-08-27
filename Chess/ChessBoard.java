package Chess;

public class ChessBoard {

    private Box[][] boxes = new Box[8][8];

    public ChessBoard() {
        for(int i=0; i<8; i++) {
            for (int j=0; j<8; j++)
                boxes[i][j] = new Box(i, j, null);
        }
    }

    public Box getBox(int x, int y) {
        return boxes[x][y];
    }

    public Box[][] getBoxes() {
        return boxes;
    }
}
