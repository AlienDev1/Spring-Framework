package test_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class testConnection {
    public static void main(String[] args) {
        //The code below is to check to make sure you have a database connection with MySQL
        String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/?user=hibernatedb";
        String user = "hibernatedb";
        String password = "hibernatedb";
        try{
            System.out.println("Connecting to database: " + jdbcUrl);
            Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection successful!!!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
