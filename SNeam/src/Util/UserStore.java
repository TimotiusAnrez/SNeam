package Util;

import Domain.User;

public class UserStore {
    private User userInstance;
    private static UserStore userStoreInstance; //this instance will only be created once when login is success

    private UserStore(User userInstance) {
        this.userInstance = userInstance;
    }

    public User getUserInstance() {
        return userInstance;
    }

    public static void removeUserStore(){
        userStoreInstance = null;
    }

    public static UserStore getUserStore(User user){
        if(userStoreInstance == null){
            userStoreInstance= new UserStore(user);
        }
        return userStoreInstance;
    }
    
}
