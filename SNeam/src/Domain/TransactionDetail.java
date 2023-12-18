package Domain;
import java.util.Objects;

public class TransactionDetail {
    String TransactionID, GameID;
    int Quantity;


    public TransactionDetail() {
    }

    public TransactionDetail(String TransactionID, String GameID, int Quantity) {
        this.TransactionID = TransactionID;
        this.GameID = GameID;
        this.Quantity = Quantity;
    }

    public String getTransactionID() {
        return this.TransactionID;
    }

    public void setTransactionID(String TransactionID) {
        this.TransactionID = TransactionID;
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

    public TransactionDetail TransactionID(String TransactionID) {
        setTransactionID(TransactionID);
        return this;
    }

    public TransactionDetail GameID(String GameID) {
        setGameID(GameID);
        return this;
    }

    public TransactionDetail Quantity(int Quantity) {
        setQuantity(Quantity);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TransactionDetail)) {
            return false;
        }
        TransactionDetail transactionDetail = (TransactionDetail) o;
        return Objects.equals(TransactionID, transactionDetail.TransactionID) && Objects.equals(GameID, transactionDetail.GameID) && Quantity == transactionDetail.Quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(TransactionID, GameID, Quantity);
    }

    @Override
    public String toString() {
        return "{" +
            " TransactionID='" + getTransactionID() + "'" +
            ", GameID='" + getGameID() + "'" +
            ", Quantity='" + getQuantity() + "'" +
            "}";
    }
    
}
