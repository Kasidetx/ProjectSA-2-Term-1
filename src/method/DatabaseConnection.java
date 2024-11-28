package method;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kasidet
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        final String URL = "jdbc:ucanaccess://C:/Users/openz/Downloads/ProjectSA/SADB.accdb";
        try {
            Connection conn = DriverManager.getConnection(URL);
            if(conn != null){
                return conn;
            }
            System.out.println("Connected to Access database successfully!");
            return conn;
        } catch (SQLException e) {
            System.err.println("Failed to connect to Access database: " + e.getMessage());
            return null;
        }
    }
}
