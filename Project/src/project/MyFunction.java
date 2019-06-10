/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;


/**
 *
 * @author Iuliano
 */
public class MyFunction {

    public static float countCalories(String tableName)
    {
    float total = 0;
    Connection con = ConnectionDB.getConnection();
    try{
    Statement st=con.createStatement();
    ResultSet rs;
    String sql = "SELECT SUM(TotalCalories)"
            + "FROM "+tableName;
    rs=st.executeQuery(sql);
    while(rs.next())
    {
    
    total = rs.getFloat(1);
    
    }
         }catch(SQLException e){e.printStackTrace();}
    
    return total;
}
    public static float countProtein(String tableName)
    {
    float total = 0;
    Connection con = ConnectionDB.getConnection();
    try{
    Statement st=con.createStatement();
    ResultSet rs;
    String sql = "SELECT SUM(Protein)"
            + "FROM "+tableName;
    rs=st.executeQuery(sql);
    while(rs.next())
    {
    
    total = rs.getFloat(1);
    
    }
         }catch(SQLException e){e.printStackTrace();}
    
    return total;
}
    public static float countFat(String tableName)
    {
    float total = 0;
    Connection con = ConnectionDB.getConnection();
    try{
    Statement st=con.createStatement();
    ResultSet rs;
    String sql = "SELECT SUM(Fats)"
            + "FROM "+tableName;
    rs=st.executeQuery(sql);
    while(rs.next())
    {
    
    total = rs.getFloat(1);
    
    }
         }catch(SQLException e){e.printStackTrace();}
    
    return total;
}
    public static float countCarbs(String tableName)
    {
    float total = 0;
    Connection con = ConnectionDB.getConnection();
    try{
    Statement st=con.createStatement();
    ResultSet rs;
    String sql = "SELECT SUM(Carbs)"
            + "FROM "+tableName;
    rs=st.executeQuery(sql);
    while(rs.next())
    {
    
    total = rs.getFloat(1);
    
    }
         }catch(SQLException e){e.printStackTrace();}
    
    return total;
}
}
