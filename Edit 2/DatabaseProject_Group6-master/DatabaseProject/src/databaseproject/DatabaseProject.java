/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseproject;



import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kristian
 */
public class DatabaseProject {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseProject pro=new DatabaseProject();
        pro.createConnection();
        // TODO code application logic here
    }
    void createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kipol","root","kpaul57285.");
              Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from _names");
            while(rs.next()){
                String fname=rs.getString("first_name");
                String lname=rs.getString("last_name");
                
                System.out.println(fname+lname);
            }
              
              System.out.println("database success");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseProject.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
