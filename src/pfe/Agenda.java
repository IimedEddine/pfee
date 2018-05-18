/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ZaCCC
 */
public class Agenda {
    
    private Connection myConn;
    int jour; 
    String contenuJour; 
      

    

    
      
      public  Agenda (int aJour, String aContenuJour) throws ClassNotFoundException{
        this.jour=aJour; 
        this.contenuJour=aContenuJour; 
        try {
          Class.forName("org.sqlite.JDBC");
              String url = "jdbc:sqlite:C:\\Users\\info\\pfee\\src\\pfe\\DBpfee.db"; // The Url of your database 'Strecture be like: xD' jbdc:sqlite: + the path of your db        
          // Create the Connection ## Pass url (Path) as param
          myConn = DriverManager.getConnection(url); 
        }catch (SQLException e) {
          System.out.println("Error : " + e.getMessage());
        }           
     
      }
      
      
    public void Ajouter(int id){
    
         String sqlQuery;
        sqlQuery = "UPDATE agenda SET `jour`=?, `contenuJour`=?"
                + " WHERE jour = "+id;
    try {
     	  PreparedStatement statement = myConn.prepareStatement(sqlQuery);
              
          statement.setInt(1, this.jour);
          statement.setString(2, this.contenuJour);
          
          statement.executeUpdate();
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
            
        
        
        }
        
        
    }
     
    Connection myconn=null;
    String contenujour;
    public String Afficher(int id ) throws SQLException{
        
        
       
        String myQuery="SELECT contenuJour FROM agenda where jour='"+id+"'";
       Statement myStatement=myConn.createStatement();
       ResultSet rs=myStatement.executeQuery(myQuery);
       while (rs.next()){
           contenujour=rs.getString("contenuJour");
          
       }
       
    return contenujour;
        
        
    }
    
    
}
