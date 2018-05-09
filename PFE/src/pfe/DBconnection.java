/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author imad_
 */
public class DBconnection {
    static Connection Connex = null;
    
    public static Connection getCon(){
        
           try {
            
            java.lang.Class.forName("org.sqlite.JDBC");//Obtenir le driver de base de donnÃ©e
            String RepAccDB = "src/DBpfee.db";//Repertoire de Base de donnÃ©e
            String dbURL = "jdbc:sqlite:" + RepAccDB; //Url(Chemin) de Base de donnÃ©e concatinÃ© au repertoire
            Connex = DriverManager.getConnection(dbURL); //Obtenir de connection
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Probléme : "+ex);
        }
        
    return Connex;}
    
    public static void CloseCon(){
       
        
        try {
            
            Connex.close(); //Fermer la connection
            
            
        } catch (SQLException ex) {
             System.err.println("probléme : "+ex);
        }
        
    }
}
