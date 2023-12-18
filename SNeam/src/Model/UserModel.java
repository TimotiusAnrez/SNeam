package Model;

import Domain.User;
import Util.Database;
import java.sql.*;

public class UserModel {

    private User user;
    private final Database db = Database.getDbInstance();
    private ResultSet rs;

    User getUser() {
        return this.user;
    }

    void setUser(User user) {
        this.user = user;
    }

    public User getUserByEmail(String Email) throws SQLException {

        User initialUser = new User("", "", "", "", "", "");
        setUser(initialUser);
        System.out.println(Email);
        db.start();
        String sqlStatement = String.format("select * from user where Email = \"%s\"", Email);
        
        rs = db.execute(sqlStatement);

        if(rs == null){
            System.out.println(initialUser + "line 32");
            return getUser();
        }

        while (rs.next()) {
            initialUser = new User(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                    );
                    setUser(initialUser);
        }

        return getUser();
    }
}
