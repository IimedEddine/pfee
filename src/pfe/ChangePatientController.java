/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author imad_
 */
public class ChangePatientController implements Initializable {

    
     @FXML
    private void annuler(ActionEvent event) {
       Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
        
        
    }
    @FXML 
    public TextField nom;
      @FXML 
    private TextField prenom;
        @FXML 
    private TextField age;
        @FXML 
    private TextField poids;
      @FXML 
    private TextField taille;
        @FXML 
    private TextField numdetel;
        
       @FXML 
    private TextField grossesse;
       @FXML
    private TextField nombreEnfants;
      @FXML 
    private TextField sexe;
        @FXML 
    private TextField situationFamilliale;
        @FXML 
    private TextField nombreGrossesse;
      @FXML 
    private TextField enfants;
        @FXML 
    private TextField dateConsultation;
         @FXML 
    private TextField statutVaccinal;
        @FXML 
    private TextField ville;
        @FXML 
        private TextArea Afamilliaux;
        @FXML 
        private TextArea Apersonnels;
        @FXML 
        private TextArea motifConsultation;
        @FXML 
        private TextArea compteRendu;
        Connection myConn=null;
        int id=Patient.idTable;
    
    @FXML 
    void modifier(ActionEvent event){
    
   if(nom.isEditable()==false){
   
   nom.setEditable(true);
   prenom.setEditable(true);
   age.setEditable(true);
   poids.setEditable(true);
   taille.setEditable(true);
   numdetel.setEditable(true);
   grossesse.setEditable(true);
   sexe.setEditable(true);
   situationFamilliale.setEditable(true);
   nombreGrossesse.setEditable(true);
   enfants.setEditable(true);
   dateConsultation.setEditable(true);
   statutVaccinal.setEditable(true);
   ville.setEditable(true);
   Afamilliaux.setEditable(true);
   Apersonnels.setEditable(true);
   motifConsultation.setEditable(true);
   compteRendu.setEditable(true);
   nombreEnfants.setEditable(true);
   
   
   }
    }
    
    @FXML 
    void sauvgarder(ActionEvent event) throws ClassNotFoundException{
    
    if(nom.isEditable()==true){
    nom.setEditable(false);
    prenom.setEditable(false);
    age.setEditable(false);
    poids.setEditable(false);
    taille.setEditable(false);
    numdetel.setEditable(false);
    grossesse.setEditable(false);
    sexe.setEditable(false);
    situationFamilliale.setEditable(false);
    nombreGrossesse.setEditable(false);
    enfants.setEditable(false);
    dateConsultation.setEditable(false);
    statutVaccinal.setEditable(false);
    ville.setEditable(false);
    Afamilliaux.setEditable(false);
    Apersonnels.setEditable(false);
    motifConsultation.setEditable(false);
    compteRendu.setEditable(false);
    nombreEnfants.setEditable(false);
    
    
    }
    
   /* try{ myConn=Patient.Connection();
          
           myConn=Patient.Connection();
          Statement myStatement = myConn.createStatement();
          String sql = "UPDATE patient SET `nomPatient` = ?, `prenomPatient` = ? , `agePatient` = ?, `poidsPatient` = ?" 
            		        + "taillePatient`=?, `numTelPatient` = ?, `statutVaccinalPatient` = ?, `sexePatient` = ?,`situationFamillePatient`=?, `villePatient` = ?"
            		        + "`enfantsPatient` = ?, `nombreDeGrossesse` = ?, `nombreEnfant`= ? , `antcdsFPatient`= ?, `antcdsPPatient`= ? "
                                + "`motifDeConsultation`= ?, `compteRenduConsultation`=?, `dateConsultation`=?"
                                +"WHERE id_patient="+Patient.idTable;
         
        
          ResultSet rs = myStatement.executeQuery(sql);
           PreparedStatement statement = myConn.prepareStatement(sql);
           
               statement.setString(1, this.nomPatient); 
  	       statement.setString(2, this.prenomPatient);
               statement.setInt(3, this.agePatient);
               statement.setInt(4, this.poidsPatient);	
               statement.setInt(5, this.taillePatient);	
               statement.setInt(6, this.numTelPatient);
               statement.setString(7, this.statutVaccinalPatient);
               statement.setString(8, this.sexePatient);
               statement.setString(9, this.situationFamillePatient);
               statement.setString(10, this.villePatient);
               statement.setString(11,this.enfantsPatient);
               statement.setString(12,this.nombreDeGrossesse);
               statement.setString(13,this.nombreEnfant);
               statement.setString(14,this.antcdsFPatient);
               statement.setString(15,this.antcdsPPatient);
               statement.setString(16,this.motifDeConsultation);
               statement.setString(17,this.compteRenduConsultation);
               statement.setString(18,this.dateConsultation);
    
    
    
    }catch (SQLException ex) {    
             Logger.getLogger(ChangePatientController.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ChangePatientController.class.getName()).log(Level.SEVERE, null, ex);
         }    
    */
    Consultation myConsultation= new Consultation(nom.getText(),prenom.getText(),Integer.parseInt(age.getText()),Integer.parseInt(poids.getText()),Integer.parseInt(taille.getText()),Integer.parseInt(numdetel.getText()),statutVaccinal.getText(), sexe.getText(),situationFamilliale.getText(),ville.getText(),enfants.getText(),nombreGrossesse.getText(),nombreEnfants.getText(),Afamilliaux.getText(),Apersonnels.getText(),  motifConsultation.getText(),compteRendu.getText(),dateConsultation.getText());
    myConsultation.Modifier(Patient.idTable);
    }
    
   
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
          myConn=Patient.Connection();
          Statement myStatement = myConn.createStatement();
          String sql = "SELECT * FROM `patient` WHERE `id_patient`="+Patient.idTable;
          ResultSet rs = myStatement.executeQuery(sql);
        
          while (rs.next()) {
          nom.setText(rs.getString(2));
          prenom.setText(rs.getString(3));
          age.setText(rs.getString(4));
          poids.setText(rs.getString(5));
          taille.setText(rs.getString(6));
          numdetel.setText(rs.getString(7));
          statutVaccinal.setText(rs.getString(8));
          sexe.setText(rs.getString(9));
          situationFamilliale.setText(rs.getString(10));
          ville.setText(rs.getString(11));
          enfants.setText(rs.getString(12));
          nombreGrossesse.setText(rs.getString(13));
          grossesse.setText(rs.getString(13));
          nombreEnfants.setText(rs.getString(14));
          Afamilliaux.setText(rs.getString(15));
         Apersonnels.setText(rs.getString(16));
         motifConsultation.setText(rs.getString(17));
         compteRendu.setText(rs.getString(18));
          dateConsultation.setText(rs.getString(19));
         
          
          }
              
              
        
       
        
    }    catch (SQLException ex) {    
             Logger.getLogger(ChangePatientController.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ChangePatientController.class.getName()).log(Level.SEVERE, null, ex);
         }    
    
}
}
