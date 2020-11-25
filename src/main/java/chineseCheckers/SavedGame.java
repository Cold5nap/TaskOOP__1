package chineseCheckers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SavedGame implements Serializable {

    private GameField gBoard;
    private final List<Tile> tiles = new ArrayList<>();
    public SavedGame(GameField gBoard) {
        this.gBoard = gBoard;
    }

    public GameField getGBoard() {
        return gBoard;
    }

    public void setTiles(List<Tile> tiles){
        for (Tile tile :
                tiles) {
            this.tiles.add(new Tile(tile.getX(), tile.getY()));
        }
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    public void setGBoard(GameField gBoard) {
        this.gBoard = gBoard;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "gameField=" + gBoard +
                '}';
    }
}
