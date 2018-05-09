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
public class Consultation {
   
  
    int idConsultation;
    int idPatient;
    String nomPatient;
    String prenomPatient;
    int agePatient;
    int poidsPatient;
    int taillePatient;
    int numTelPatient;
    String statutVaccinalPatient;
    char sexePatient;
    String situationFamillePatient;
    String villePatient; 
    String enfantsPatient; 
    int nombreDeGrossesse; 
    int nombreEnfant;
    String antcdsFPatient;
    String antcdsPPatient;
    String motifDeConsultation;
    String compteRenduConsultation;
    String dateConsultation; 
    
   
  
    private Connection myConn;
  
    
    public Consultation (String cNomPatient, String cPrenomPatient, int cAgePatient, int cPoidsPatient, int cTaillePatient, int cNumTelPatient,
                         String cStatutVaccinalPatient, char cSexePatient, String cSituationFamillePatient, String cVillePatient, String cEnfantsPatient, int cNombreDeGrossesse, 
                        int cNombreEnfant, String cAntcdsFPatient, String cAntcdsPPatient, String cMotifDeConsultation, String cCompteRenduConsultation, String cDateConsultation){
       // est ce que nfwtou les ids wla lala ?????
      	this.nomPatient=cNomPatient;
        this.prenomPatient=cPrenomPatient;
        this.agePatient=cAgePatient;
        this.poidsPatient=cPoidsPatient;
        this.taillePatient=cTaillePatient;
        this.numTelPatient=cNumTelPatient;
        this.statutVaccinalPatient=cStatutVaccinalPatient;
        this.sexePatient=cSexePatient;
        this.situationFamillePatient=cSituationFamillePatient;
        this.villePatient=cVillePatient;
        this.enfantsPatient=cEnfantsPatient;
        this.nombreDeGrossesse=cNombreDeGrossesse;
        this.nombreEnfant=cNombreEnfant; 
        this.antcdsFPatient=cAntcdsFPatient;
        this.antcdsPPatient=cAntcdsPPatient;
        this.motifDeConsultation=cMotifDeConsultation; 
        this.compteRenduConsultation=cCompteRenduConsultation; 
        this.dateConsultation=cDateConsultation; 
        
      
                
                
    }
    
    
    		// I'm going to add the ADD method first then we go back to Constr
    
    
 
  	
  
    public void Ajouter(){
     
        String sqlQuery = "INSERT INTO Patient (nomPatient, prenomPatient, agePatient, poidsPatient, taillePatient, numTelPatient, statutVaccinalPatient, sexePatient, situationFamillePatient, villePatient, enfantsPatient, nombreDeGrossesse, nombreEnfant, antcdsFPatient, antcdsPPatient, motifDeConsultation, compteRenduConsultation, dateConsultation  )" 
                         +"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
       	// this is the try statment 
   							
        // so this PreparedStatement class is going to hold our query and also help us to merge our attrs with our query
              		
          try {
   							
            		
              
     	      PreparedStatement statement = myConn.prepareStatement(sqlQuery);
              
               statement.setString(1, this.nomPatient); // This inst is going to replace the first ? with the prenomPatient attr Right ?
  	       statement.setString(2, this.prenomPatient);
               statement.setInt(3, this.agePatient);
               statement.setInt(4, this.poidsPatient);	
               statement.setInt(5, this.taillePatient)	;	
               statement.setInt(6, this.numTelPatient);
               statement.setString(7, this.statutVaccinalPatient);
               statement.setInt(8, this.sexePatient);
               statement.setString(9, this.villePatient);
               statement.setString(10,this.enfantsPatient);
               statement.setInt(11,this.nombreDeGrossesse);
               statement.setInt(12,this.nombreEnfant);
               statement.setString(13,this.antcdsFPatient);
               statement.setString(14,this.antcdsPPatient);
               statement.setString(15,this.motifDeConsultation);
               statement.setString(16,this.compteRenduConsultation);
               statement.setString(17,this.dateConsultation);
                 
               statement.executeUpdate();
            	
             }catch (SQLException e) {
             System.out.println(e.getMessage()); // this msg is just for showing the error 
    
             } 
    
    }
  
  
    public void Modifier(String nomPatient, String prenomPatient,int agePatient,int poidsPatient,int taillePatient,int numTelPatient, 
                 String statutVaccinalPatient,char sexePatient, String villePatient, String enfantsPatient, int nombreDeGrossesse, int nombreEnfant, String antcdsFPatient, 
                 String  antcdsPPatient, String motifDeConsultation, String compteRenduConsultation, String dateConsultation  ){
      
      
        	String sqlQuery = "UPDATE Patient SET `nomPatient` = ?, `prenomPatient` = ? , `agePatient` = ?, `poidsPatient` = ?" 
            		        + "`taillePatient` = ?, `numTelPatient` = ?, `statutVaccinalPatient` = ?, `sexePatient` = ?, `villePatient` = ?"
            		        + "`enfantsPatient` = ? `nombreDeGrossesse` = ?, `nombreEnfant`= ? , `antcdsFPatient`= ?, `antcdsPPatient`= ? "
                                + "`motifDeConsultation`= ?, `compteRenduConsultation`=?, `dateConsultation`=?";
          
      
      		try {
            
            	PreparedStatement statement = myConn.prepareStatement(sqlQuery);
               statement.setString(1, this.nomPatient); 
  	       statement.setString(2, this.prenomPatient);
               statement.setInt(3, this.agePatient);
               statement.setInt(4, this.poidsPatient);	
               statement.setInt(5, this.taillePatient)	;	
               statement.setInt(6, this.numTelPatient);
               statement.setString(7, this.statutVaccinalPatient);
               statement.setInt(8, this.sexePatient);
               statement.setString(9, this.villePatient);
               statement.setString(10,this.enfantsPatient);
               statement.setInt(11,this.nombreDeGrossesse);
               statement.setInt(12,this.nombreEnfant);
               statement.setString(13,this.antcdsFPatient);
               statement.setString(14,this.antcdsPPatient);
               statement.setString(15,this.motifDeConsultation);
               statement.setString(16,this.compteRenduConsultation);
               statement.setString(17,this.dateConsultation);
               
            
               statement.executeUpdate();
            
          }catch (SQLException e){
            System.out.println(e.getMessage());
          }
    }
  
  public void Supprimer(int ID){
       String sqlQuery = "DELETE Patient WHERE id = ?";
         
         try{
           PreparedStatement statement = myConn.prepareStatement(sqlQuery);
           statement.setInt(1, ID);
           statement.executeUpdate();
         }catch (SQLException e){
           System.out.println(e.getMessage());
         }
           }
    
}