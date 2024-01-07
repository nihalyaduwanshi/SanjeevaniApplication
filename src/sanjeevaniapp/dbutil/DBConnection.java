/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class DBConnection {
    
    private static Connection conn=null;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("driver loaded successfully");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            System.exit(0);
        }
        try
        {
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-71MLND5:1521/xe", "SANJEEVANI", "Nihal"); 
            System.out.println("connection open succesfully");
        }      
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(0);
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
            
        if(conn!=null)
        {
          try
         {
            conn.close();
            System.out.println("conn close succesfully");
         }
          catch (SQLException e)
         {
            e.printStackTrace();
         }
      }
    }
}

