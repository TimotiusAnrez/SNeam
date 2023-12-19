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

    public String getLastID() throws SQLException {
        String sqlQuery = "select UserID from user order by UserID desc limit 1";
        db.start();
        String lastID = "";

        rs = db.execute(sqlQuery);

        while (rs.next()) {
            lastID = rs.getString("UserID");
        }

        db.close();

        return lastID;
    }

    public void createUser(User user) throws SQLException {
        db.start();
        Connection con = db.getConnection();
        String sqlStatement = String.format("insert into user values(?,?,?,?,?,?)");

        PreparedStatement ps = con.prepareStatement(sqlStatement);
        ps.setString(1, user.getUserID());
        ps.setString(2, user.getUsername());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getPhoneNumber());
        ps.setString(5, user.getEmail());
        ps.setString(6, user.getRole());
        ps.execute();


        System.out.println("User Created");

        ps.close();
        con.close();

        
    }

    public User checkUserByEmail(String Email) throws SQLException {
        User initialUser = null;

        db.start();
        String sqlStatement = String.format("select * from user where Email = \"%s\"", Email);
        rs = db.execute(sqlStatement);
        while (rs.next()) {
            initialUser = new User(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6));
            setUser(initialUser); // ?means email is not unique
            System.out.println(initialUser.toString());
        }

        db.close();
        return initialUser;
    }

    public User getUserByEmail(String Email) throws SQLException {

        User initialUser = new User("", "", "", "", "", "");
        setUser(initialUser);
        System.out.println(Email);
        db.start();
        String sqlStatement = String.format("select * from user where Email = \"%s\"", Email);

        rs = db.execute(sqlStatement);

        if (rs == null) {
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
                    rs.getString(6));
            setUser(initialUser);
        }

        db.close();
        return getUser();
    }
}
