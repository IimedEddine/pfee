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
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author ZaCCC
 */
public class Patient {
    int iD;
    String nom;
    String prenom;
    int age;
    String sexe;
    String ville;
    String situation;

    private Connection myConn;

    public Patient(String pNom, String pPrenom, int pAge, String pSexe, String pVille, String pSituation ){
        
         try {
    
        String url = "jdbc:sqlite:C:/sqlite/db/DBpfee.db"; // The Url of your database 'Strecture be like: xD' jbdc:sqlite: + the path of your db
    
       // Create the Connection ## Pass url (Path) as param
         myConn = DriverManager.getConnection(url); 
        }catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
        }
        
        this.nom=pNom;
        this.prenom= pPrenom;
        this.age=pAge;
        this.sexe=pSexe;
        this.ville=pVille;
        this.situation=pSituation;

    }

   
    
    
    
    public ArrayList<Patient> Afficher(){
        
        ArrayList<Patient> list = new ArrayList<>();

        try{
        
        Statement myStatement = myConn.createStatement();
        String sql = "SELECT (id_patient , nomPatient, prenomPatient, agePatient, sexePatient, villePatient, antcdsPPatient) FROM patient";
        
        ResultSet rs = myStatement.executeQuery(sql);
        
        while(rs.next()){
            
            list.add(new Patient(rs.getString("nomPatient"), rs.getString("prenomPatient"), rs.getInt("agePatient"),rs.getString("sexePatient"), rs.getString("villePatient"),rs.getString("antcdsPPatient")));
            
        }
             return list;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
            
        }
            
        
        
    }
    



    
    public ArrayList<Patient> Recherche(String word){
        ArrayList<Patient> list = new ArrayList<>();
        try {
        String sql = "SELECT (id_patient ,nomPatient, prenomPatient, agePatient, sexePatient, villePatient, antcdsPPatient) FROM patient WHERE nomPatient LIKE '" + word + "%' OR prenomPatient LIKE '" + word + "%'";
        Statement myStatement = myConn.createStatement();
        
        ResultSet rs = myStatement.executeQuery(sql);
        
        while(rs.next()){
            
            list.add(new Patient(rs.getString("nomPatient"), rs.getString("prenomPatient"), rs.getInt("agePatient"),rs.getString("sexePatient"), rs.getString("villePatient"),rs.getString("antcdsPPatient")));
            
        }
          return list;
          
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
      
    }



}


