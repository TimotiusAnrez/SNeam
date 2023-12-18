package Domain;
import java.util.Objects;

public class User {
    private String UserID, Username, Password, PhoneNumber, Email, Role;

    public User() {
    }

    public User(String UserID, String Username, String Password, String PhoneNumber, String Email, String Role) {
        this.UserID = UserID;
        this.Username = Username;
        this.Password = Password;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Role = Role;
    }

    public String getUserID() {
        return this.UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRole() {
        return this.Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public User UserID(String UserID) {
        setUserID(UserID);
        return this;
    }

    public User Username(String Username) {
        setUsername(Username);
        return this;
    }

    public User Password(String Password) {
        setPassword(Password);
        return this;
    }

    public User PhoneNumber(String PhoneNumber) {
        setPhoneNumber(PhoneNumber);
        return this;
    }

    public User Email(String Email) {
        setEmail(Email);
        return this;
    }

    public User Role(String Role) {
        setRole(Role);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(UserID, user.UserID) && Objects.equals(Username, user.Username) && Objects.equals(Password, user.Password) && Objects.equals(PhoneNumber, user.PhoneNumber) && Objects.equals(Email, user.Email) && Objects.equals(Role, user.Role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserID, Username, Password, PhoneNumber, Email, Role);
    }

    @Override
    public String toString() {
        return "{" +
            " UserID='" + getUserID() + "'" +
            ", Username='" + getUsername() + "'" +
            ", Password='" + getPassword() + "'" +
            ", PhoneNumber='" + getPhoneNumber() + "'" +
            ", Email='" + getEmail() + "'" +
            ", Role='" + getRole() + "'" +
            "}";
    }
    
}
