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
public class Patient {
    String nom;
    String prénom;
    
     String sexe;
     
     String ville;
     
     int iD;
     int age;
     
     
     
    public Patient(String pNom, String pPrénom, String pSexe, String pVille, int pID ){
       
    	nom= pNom;
        prénom= pPrénom;
        
        sexe=pSexe;
        ville=pVille;
        iD=pID;
        
    }
    public void Ajouter(){
        
    }
    public void Modifier(){
        
    }
    public void Supprimer(){


    }
    public void Afficher(){
        
    }
}