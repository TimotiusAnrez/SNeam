package Util;

import java.sql.Connection;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;;

public class Database {
    private String url = "jdbc:mysql://localhost:3306/sneam";
    private String usn = "root";
    private String password = "password";
    private Connection con;
    private ResultSet rs;
    private Statement st;
    private static Database databaseInstance; // singleton
    private PreparedStatement ps;

    private Database() {
    }

    public void start() {
        try {
            Driver driverManager = new Driver();
            con = DriverManager.getConnection(url, usn, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet execute(String sqlStatement) {
        try {
            st = con.createStatement();
            rs = st.executeQuery(sqlStatement);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    public void exceutePs(String sqlStatement) {
        try {
            ps = con.prepareStatement(sqlStatement);
            ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return this.con;
    }

    public void close() {
        try {
            if (st != null) {
                st.close();
            }

            if (con != null) {
                con.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Database getDbInstance() {
        if (databaseInstance == null) {
            databaseInstance = new Database();
        }

        return databaseInstance;
    }

}
