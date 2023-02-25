
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELCOT
 */
public class MyConnection {
    public static Connection GetConnection(){
        
       
            Connection con = null;
           try {  
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/new_table","root","");
        } catch (ClassNotFoundException | SQLException ex) {
           System.out.println(ex.getMessage());
        }
            return con;
        
        
    }

   
    
}
