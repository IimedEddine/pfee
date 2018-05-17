/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
          String url = "jdbc:sqlite:C:\\Users\\info\\pfee\\PFE\\src\\pfe\\DBpfee.db"; // The Url of your database 'Strecture be like: xD' jbdc:sqlite: + the path of your db        
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
    public void Afficher(int id ){
        String sqlQuery = "SELECT contenuJour FROM Agenda WHERE jour= ?";
        
        try {
     	  PreparedStatement statement = myConn.prepareStatement(sqlQuery);
              
          statement.setInt(1, this.jour);
        statement.executeUpdate();
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        
        
        }
        
        
    }
    
    
}
