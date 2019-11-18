package sql;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author WIN pl
 */
public class ConnectDB {
    private Connection _con = null;
    public Connection getConnection() {
        return _con;
    }
    public static Connection getConnect() {
        
        Connection connection = null;
        try {
            connection = (Connection) DriverManager.getConnection(Config.URL);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return null;
        }
        if (connection != null) {
            return connection;
        } else {
            return null;
        }
    }

}
