/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Iuliano
 */
public class Food {
    
    public void insertUpdateDeleteFood(char operation,String tableName,String foodName, String foodType, float protein, float carbs, float fats, float grams )
    {
    
    
    Connection con = ConnectionDB.getConnection();
    PreparedStatement ps;
    //i - insert
    
    if(operation == 'i'){
        
        String sql = "INSERT INTO "+tableName +" (FoodName,FoodType,Protein,Carbs,Fats,Grams,TotalCalories) VALUES(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,foodName);
            ps.setString(2,foodType);
            ps.setFloat(3,protein);
                 ps.setFloat(4,carbs);
                      ps.setFloat(5,fats);
                           ps.setFloat(6,grams);
                           float totalCalories=(4*protein+4*carbs+9*fats)/100;
                           totalCalories = totalCalories * grams;
                           
                           ps.setFloat(7,totalCalories);
                           
          if(ps.executeUpdate()>0)
          {
              JOptionPane.showMessageDialog(null, "New Food Added!");
          }
            
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
    }
    
    
    }
    
}
