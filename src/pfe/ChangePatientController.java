/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.net.URL;
import java.util.ResourceBundle;
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
    private TextField gsurp;
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
        
        
        
     
    
    @FXML 
    void modifier(ActionEvent event){
    
   if(nom.isEditable()==false){
   
   nom.setEditable(true);
   prenom.setEditable(true);
   age.setEditable(true);
   poids.setEditable(true);
   taille.setEditable(true);
   numdetel.setEditable(true);
   gsurp.setEditable(true);
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
   
   
   }
    }
    
    @FXML 
    void sauvgarder(ActionEvent event){
    
    if(nom.isEditable()==true){
    nom.setEditable(false);
    prenom.setEditable(false);
    age.setEditable(false);
    poids.setEditable(false);
    taille.setEditable(false);
    numdetel.setEditable(false);
    gsurp.setEditable(false);
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
    
    
    }
    
    }
    
   
    public void initialize(URL url, ResourceBundle rb) {
        
       
        
    }    
    
}
