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
    String prenomPatient;
    String dateConsul;
    String nomPatient;
    String antcdsFPatient;
    String antcdsPPatiens;
    int idConsultation;
    String motifDeConsultation;
    String compteRenduConsultation;
    Boolean sexe;
    int agePatient;
    int taillePatient;
    int poidsPatient;
    String adressePatient;
    String villePatient;
    
    public Consultation (String cprenomPateint, String cdateDeConsultation, String cnomPatient, String cantcdsFPatient, String cantcdsPPatient, int cid, String cmotifDeConsultation, String ccompteRenduConsultaion, Boolean csexePatient, int cagePatient, int cTaillePatient, int cPoidsPatient, String cAdressePatient, String cVillePatient){
        prenomPatient= cprenomPateint;
        dateConsul= cdateDeConsultation;
        nomPatient=cnomPatient;
        antcdsFPatient=cantcdsFPatient;
        antcdsPPatiens=cantcdsPPatient;
        idConsultation=cid;
        motifDeConsultation=cmotifDeConsultation;
        compteRenduConsultation=ccompteRenduConsultaion;
        sexe=csexePatient;
        agePatient= cagePatient;       
        taillePatient=  cTaillePatient;      
        poidsPatient=   cPoidsPatient;   
        adressePatient=cAdressePatient;
        villePatient=cVillePatient;
                
                
    }
    
    
    
    
    
    public void Ajouter(){
        
    }
    public void Modifier(){
        
    }
    
}
