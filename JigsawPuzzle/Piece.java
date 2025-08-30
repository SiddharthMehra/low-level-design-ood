package JigsawPuzzle;

import java.util.ArrayList;
import java.util.List;

public class Piece {

    private List<Side> sides = new ArrayList<>();

    public boolean checkCorner() {
        return true;
    }

    public boolean checkMiddle() {
        return true;
    }

    public boolean checkEdge() {
        return true;
    }

}
