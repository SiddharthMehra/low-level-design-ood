package Chess;

public class Player {

    private String name;
    private boolean whiteSide;

    public Player(String name, boolean whiteSide) {
        this.name = name;
        this.whiteSide = whiteSide;
    }

    public String getName() {
        return name;
    }

    public boolean getWhiteSide() {
        return whiteSide;
    }
}
