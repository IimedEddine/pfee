/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

/**
 *
 * @author ZaCCC
 */
public class Patient {
    String nom;
    String prénom;
    String dateDeNaissance;
     String sexe;
     String adresse;
     String numeroDeTel;
     String iD;
     
    public Patient(String pNom, String pPrénom, String pDateNais, String pSexe, String pAdresse, String pID ){
       
    	nom= pNom;
        prénom= pPrénom;
        dateDeNaissance=pDateNais;
        sexe=pSexe;
        adresse=pAdresse;
        iD=pID;
        
    }
    public void Ajouter(){
        
    }
    public void Modifier(){
        
    }
    public void Supprimer(){


    }
}