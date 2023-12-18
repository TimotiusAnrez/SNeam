package Domain;
import java.util.Objects;

public class TranasctionHeader {
    String TransactionID, UserID;


    public TranasctionHeader() {
    }

    public TranasctionHeader(String TransactionID, String UserID) {
        this.TransactionID = TransactionID;
        this.UserID = UserID;
    }

    public String getTransactionID() {
        return this.TransactionID;
    }

    public void setTransactionID(String TransactionID) {
        this.TransactionID = TransactionID;
    }

    public String getUserID() {
        return this.UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public TranasctionHeader TransactionID(String TransactionID) {
        setTransactionID(TransactionID);
        return this;
    }

    public TranasctionHeader UserID(String UserID) {
        setUserID(UserID);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TranasctionHeader)) {
            return false;
        }
        TranasctionHeader tranasctionHeader = (TranasctionHeader) o;
        return Objects.equals(TransactionID, tranasctionHeader.TransactionID) && Objects.equals(UserID, tranasctionHeader.UserID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TransactionID, UserID);
    }

    @Override
    public String toString() {
        return "{" +
            " TransactionID='" + getTransactionID() + "'" +
            ", UserID='" + getUserID() + "'" +
            "}";
    }
    
}
