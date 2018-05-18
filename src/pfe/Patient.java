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
    int id;
    String nom;
    String prenom;
    int age;
    String sexe;
    String ville;
    String situation;
    static int idTable;

    //private Connection myConn;

    public Patient(int id,String pNom, String pPrenom, int pAge, String pSexe, String pVille, String pSituation ) throws ClassNotFoundException{
        
        /* try {
    
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:C:\\Users\\info\\pfee\\PFE\\src\\pfe\\DBpfee.db"; // The Url of your database 'Strecture be like: xD' jbdc:sqlite: + the path of your db
    
       // Create the Connection ## Pass url (Path) as param
         myConn = DriverManager.getConnection(url); 
        }catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
        }*/
        this.id=id;
        this.nom=pNom;
        this.prenom= pPrenom;
        this.age=pAge;
        this.sexe=pSexe;
        this.ville=pVille;
        this.situation=pSituation;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public static void setMyConn(Connection myConn) {
        Patient.myConn = myConn;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getSexe() {
        return sexe;
    }

    public String getVille() {
        return ville;
    }

    public String getSituation() {
        return situation;
    }

    public static Connection getMyConn() {
        return myConn;
    }

   
    
  /*  
    
    public ArrayList<Patient> Afficher() throws ClassNotFoundException{
        
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
    



    
    public ArrayList<Patient> Recherche(String word) throws ClassNotFoundException{
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

*/

      static Connection myConn=null;
 public static Connection Connection() throws ClassNotFoundException{
  
     try {
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:C:\\Users\\imad_\\Documents\\pfee\\src\\pfe\\DBpfee.db"; // The Url of your database 'Strecture be like: xD' jbdc:sqlite: + the path of your db
         myConn = DriverManager.getConnection(url); 
         System.out.println("Connected");
        }catch (SQLException e) {
         System.out.println("Error : " + e.getMessage());
        }
     
        return myConn;
  }  
    
}


