package Model;

import Domain.User;

public class UserModel {
    
    private User user;

    User getUser() {
        return this.user;
    }

    void setUser(User user) {
        this.user = user;
    }

    public User getUserByID(String userID){
        return getUser();
    }
}
