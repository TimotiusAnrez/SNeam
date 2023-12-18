package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import Domain.User;
import Model.UserModel;
import Util.UserStore;

public class AuthController {
    private User userInstance;
    private UserModel userModel = new UserModel();
    
    public boolean validateEmail(String email) throws SQLException{
        userInstance = userModel.getUserByEmail(email);
        if (userInstance == null) return true; // Email not in database
        return false;
    }

    //will return true if model is found
    public Boolean validateUser(String email, String password){
        
        if(email.length() == 0 || password.length() == 0){
            return false;
        }
        
        try {
            userInstance = userModel.getUserByEmail(email);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if((userInstance.getPassword().equals(password) && userInstance.getEmail().equals(email))){
            UserStore instance = UserStore.getUserStore(userInstance);
            return true;
        }
        
        
        return false;
    }

    public void createUser(String Username, String Password, String PhoneNumber, String Email){
        
    }
    
}
