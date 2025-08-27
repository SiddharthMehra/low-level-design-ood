package Chess;

import java.util.ArrayList;
import java.util.List;

public class ChessGame {

    private Player[] players;
    private ChessBoard board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> moveHistory;
    private ChessMoveController controller;
    private ChessGameView view;

    public ChessGame(Player white, Player black) {
        this.players = new Player[] {white, black};
        this.board = new ChessBoard();
        this.currentTurn = white;
        this.status = GameStatus.ACTIVE;
        this.moveHistory = new ArrayList<>();
        this.controller = new ChessMoveController();
        this.view = new ChessGameView();
    }

    public Player[] getPlayers() {
        return players;
    }

    public ChessBoard getBoard() {
        return board;
    }

    public Player getCurrentTurn() {
        return currentTurn;
    }

    public GameStatus getGameStatus() {
        return status;
    }

    public List<Move> getMoveHistory() {
        return moveHistory;
    }

    public ChessMoveController getController() {
        return controller;
    }

    public ChessGameView getChessGameView() {
        return view;
    }

    public void setCurrentTurn(Player player) {
        this.currentTurn = player;
    }

    public void setStatus(GameStatus gameStatus) {
        this.status = status;
    }
}
