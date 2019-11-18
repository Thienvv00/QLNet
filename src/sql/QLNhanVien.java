package sql;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author VAN NAM
 */
public class QLNhanVien {

    /**
     * @param args the command line arguments
     */
    private static Connection conn = null;
    public static void main(String[] args) {
      conn = new ConnectDB().getConnect();
        if (conn !=null) {
            System.out.println("thanh cong");
        }
    
  
    }
    
}
