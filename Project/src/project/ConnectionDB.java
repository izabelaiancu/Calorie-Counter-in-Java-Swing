/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iuliano
 */
public class ConnectionDB {
    
    public static Connection getConnection()
    {
   Connection con = null;
   

       try {
           con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/1Kwh70UeIL?useSSL=false","1Kwh70UeIL","BVj2Nb0f9Z");
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return con;

}
}
