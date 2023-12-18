package Domain;
import java.util.Objects;

public class Cart {
    String UserID, GameID;
    int Quantity;


    public Cart() {
    }

    public Cart(String UserID, String GameID, int Quantity) {
        this.UserID = UserID;
        this.GameID = GameID;
        this.Quantity = Quantity;
    }

    public String getUserID() {
        return this.UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getGameID() {
        return this.GameID;
    }

    public void setGameID(String GameID) {
        this.GameID = GameID;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Cart UserID(String UserID) {
        setUserID(UserID);
        return this;
    }

    public Cart GameID(String GameID) {
        setGameID(GameID);
        return this;
    }

    public Cart Quantity(int Quantity) {
        setQuantity(Quantity);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) o;
        return Objects.equals(UserID, cart.UserID) && Objects.equals(GameID, cart.GameID) && Quantity == cart.Quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserID, GameID, Quantity);
    }

    @Override
    public String toString() {
        return "{" +
            " UserID='" + getUserID() + "'" +
            ", GameID='" + getGameID() + "'" +
            ", Quantity='" + getQuantity() + "'" +
            "}";
    }
    
}
