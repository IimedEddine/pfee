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
import java.util.Date;

/**
 *
 * @author ZaCCC
 */

	
  public class Certi_ordan {
	
    int idCerti;
    int idPatient;
    String nomMedecin;
    String codeMedecin;
    String dateCerti;
    String nomPatient;
    String prenomPatient;
    int agePatient;
    String typeDuContenu;
    String typeDeCertificat; 
    String contenu;

		
    private Connection myConn;

    public Certi_ordan (String cNomMedecin, String cCodeMedecin, String cdateCerti, String cnomPatient, String cprenomPatient, 
		           int cagePatient, String ctypeDuContenu, String ctypeDeCertificat, String cContenu   ){
													
	  
        
          try {
    
        String url = "jdbc:sqlite:C:/sqlite/db/DBpfee.db"; // The Url of your database 'Strecture be like: xD' jbdc:sqlite: + the path of your db
    
       // Create the Connection ## Pass url (Path) as param
         myConn = DriverManager.getConnection(url); 
        }catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
        } 
          
	  this.nomMedecin=cNomMedecin;
	  this.codeMedecin=cCodeMedecin;
          this.dateCerti= cdateCerti;
	  this.nomPatient=cnomPatient;
	  this.prenomPatient=cprenomPatient;
	  this.agePatient=cagePatient;
	  this.typeDuContenu=ctypeDuContenu;
	  this.typeDeCertificat= ctypeDeCertificat;
	  this.contenu=cContenu;
          
         
        

    }												

		
		
    public void Etablir(){
	String sqlQuery = "INSERT INTO certificat (nomMedecin, codeMedecin, dateCerti, nomPatient, prenomPatient, agePatient, typeDeContenu, typeDeCertificat, Contenu  )" 
			 +"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			// this is the try statment 
							
			// so this PreparedStatement class is going to hold our query and also help us to merge our attrs with our query
								
	try {
							
							
						
	PreparedStatement statement = myConn.prepareStatement(sqlQuery);
						
	
        statement.setString(1, this.nomMedecin); // This inst is going to replace the first ? with the prenomPatient attr Right ?
        statement.setString(2, this.codeMedecin);
        statement.setString(3, this.dateCerti);
	statement.setString(4, this.nomPatient);	
	statement.setString(5, this.prenomPatient)	;	
	statement.setInt(6, this.agePatient);
	statement.setString(7, this.typeDuContenu);
	statement.setString(8, this.typeDeCertificat);
	statement.setString(9,this.contenu );
					
							 
	statement.executeUpdate();
						
	}catch (SQLException e) {
	System.out.println(e.getMessage()); // this msg is just for showing the error 
	
	} 
	
    }
			
        
    
    public void Modifier(String NomMedecin, String CodeMedecin, String dateCerti, String nomPatient, String prenomPatient, 
		         int agePatient, String typeDuContenu, String typeDeCertificat, String contenu ){

	String sqlQuery = " UPDATE SET certificat `nomMedecin` = ?, `codeMedecin` = ? , `dateCerti` = ?, `nomPatient` = ?" 
			+ "`prenomPatient` = ?, `agePatient` = ?, `typeDeContenu` = ?, `typeDeCertificat` = ?, `Contenu` = ?";
        
        try {
															            
	PreparedStatement statement = myConn.prepareStatement(sqlQuery);
	statement.setString(1, this.nomMedecin); 
	statement.setString(2, this.codeMedecin);
	statement.setString(3, this.dateCerti);
        statement.setString(4, this.nomPatient);	
	statement.setString(5, this.prenomPatient);	
        statement.setInt(6, this.agePatient);
        statement.setString(7, this.typeDuContenu);
	statement.setString(8, this.typeDeCertificat);
	statement.setString(9, this.contenu);
															            
															               
															            
	statement.executeUpdate();
															            
        }catch (SQLException e){
        System.out.println(e.getMessage());
        } 
 }  		        
        
    
    public void Imprimer(){
        
    } 
    



}




