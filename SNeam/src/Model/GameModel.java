package Model;

import Domain.Game;
import java.util.ArrayList;

public class GameModel {
    private Game game;
    private ArrayList<Game> gameList;
    

    public Game getGame() {
        return this.game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public ArrayList<Game> getGameList() {
        return this.gameList;
    }

    public void setGameList(ArrayList<Game> gameList) {
        this.gameList = gameList;
    }

}
