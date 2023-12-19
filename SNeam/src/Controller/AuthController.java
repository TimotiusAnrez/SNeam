package Controller;

import java.sql.SQLException;
import Domain.User;
import Model.UserModel;
import Util.UserStore;

public class AuthController {
    private User userInstance;
    private UserModel userModel = new UserModel();

    public boolean validateEmail(String email) throws SQLException {
        userInstance = userModel.checkUserByEmail(email);
        if (userInstance == null){
            return true; // Email not in database
        }
        return false;
    }

    // will return true if model is found
    public Boolean validateUser(String email, String password) {

        if (email.length() == 0 || password.length() == 0) {
            return false;
        }

        try {
            userInstance = userModel.getUserByEmail(email);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if ((userInstance.getPassword().equals(password) && userInstance.getEmail().equals(email))) {
            UserStore instance = UserStore.getUserStore(userInstance);
            return true;
        }

        return false;
    }

    

    public void createUser(String Username, String Password, String PhoneNumber, String Email) throws SQLException {
        String lastID = userModel.getLastID();
        String[] UserIDSplit = lastID.split("AC");
        int idNum = Integer.parseInt(UserIDSplit[1]) + 1;
        String UserID = "AC";

        if(idNum > 9 && idNum < 100){
            UserID += "0" + idNum;
        }else{
            UserID += "00" + idNum;
        }


        User user = new User(UserID, Username, Password, PhoneNumber, Email, "Customer");
        userModel.createUser(user);
    }

}
