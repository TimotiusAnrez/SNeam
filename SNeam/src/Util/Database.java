package Util;

import java.sql.Connection;
import java.sql.*;

public class Database {
    private static String url = "jdbc:mysql://localhost:3306/sneam"; // 数据库地址
    private static String usn = "root";
    private static String password = "password";
    private static Connection con;
    private static ResultSet rs;
    private static Statement st;

    public void start(){
        try {
            Class.forName("com.mysql.cj.jbdc.Driver");
            con = DriverManager.getConnection(url, usn, password);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public ResultSet execute(String sqlStatement){
        try {
            st = con.createStatement();
            st.executeQuery(sqlStatement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }

    public void close(){
        try {
            if(st != null){
                st.close();
            }

            if(con != null){
                con.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
