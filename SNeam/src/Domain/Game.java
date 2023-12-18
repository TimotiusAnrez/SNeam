package Domain;
import java.util.Objects;

public class Game {
    String GameID, GameName, GameDescription;
    int Price;

    public Game() {
    }

    public Game(String GameID, String GameName, String GameDescription, int Price) {
        this.GameID = GameID;
        this.GameName = GameName;
        this.GameDescription = GameDescription;
        this.Price = Price;
    }

    public String getGameID() {
        return this.GameID;
    }

    public void setGameID(String GameID) {
        this.GameID = GameID;
    }

    public String getGameName() {
        return this.GameName;
    }

    public void setGameName(String GameName) {
        this.GameName = GameName;
    }

    public String getGameDescription() {
        return this.GameDescription;
    }

    public void setGameDescription(String GameDescription) {
        this.GameDescription = GameDescription;
    }

    public int getPrice() {
        return this.Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public Game GameID(String GameID) {
        setGameID(GameID);
        return this;
    }

    public Game GameName(String GameName) {
        setGameName(GameName);
        return this;
    }

    public Game GameDescription(String GameDescription) {
        setGameDescription(GameDescription);
        return this;
    }

    public Game Price(int Price) {
        setPrice(Price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Game)) {
            return false;
        }
        Game game = (Game) o;
        return Objects.equals(GameID, game.GameID) && Objects.equals(GameName, game.GameName) && Objects.equals(GameDescription, game.GameDescription) && Price == game.Price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(GameID, GameName, GameDescription, Price);
    }

    @Override
    public String toString() {
        return "{" +
            " GameID='" + getGameID() + "'" +
            ", GameName='" + getGameName() + "'" +
            ", GameDescription='" + getGameDescription() + "'" +
            ", Price='" + getPrice() + "'" +
            "}";
    }
    
}
