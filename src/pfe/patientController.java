/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author imad_
 */
public class patientController implements Initializable {
   

    @FXML 
    AnchorPane rootpane;
    @FXML 
    TextField recherche;
    @FXML
    RadioButton selecM;
    @FXML
    RadioButton selecF;
    @FXML
    private void radioSelect(ActionEvent event){
   if(selecM.isSelected()&& selecF.isSelected()){  newData.clear(); try {
          myConn=Patient.Connection();
          Statement myStatement = myConn.createStatement();
          String sql = "SELECT * FROM `patient` ";
          ResultSet rs = myStatement.executeQuery(sql);

             while (rs.next()) {  
               newData.add(new Patient(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(9),rs.getString(11),rs.getString(16)));    
         }
           
            id.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("id"));
            nom.setCellValueFactory(new PropertyValueFactory<Patient,String>("nom"));
            prenom.setCellValueFactory(new PropertyValueFactory<Patient,String>("prenom"));
            age.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("age"));  
            sexe.setCellValueFactory(new PropertyValueFactory<Patient,String>("sexe"));
            ville.setCellValueFactory(new PropertyValueFactory<Patient,String>("ville"));
            situation.setCellValueFactory(new PropertyValueFactory<Patient,String>("situation"));
            myTable.setItems(newData);
            
             
      } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(patientController.class.getName()).log(Level.SEVERE, null, ex);
      }}else  
    if (selecM.isSelected()){
        try {
          myTable.getItems().removeAll(myTable.getItems());
          myConn=Patient.Connection();
          Statement myStatement = myConn.createStatement();
          String sql = "SELECT * FROM patient WHERE sexePatient ='M'";
          ResultSet rs = myStatement.executeQuery(sql);

             while (rs.next()) {  
               newData.add(new Patient(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(9),rs.getString(11),rs.getString(16)));    
         }
           
            id.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("id"));
            nom.setCellValueFactory(new PropertyValueFactory<Patient,String>("nom"));
            prenom.setCellValueFactory(new PropertyValueFactory<Patient,String>("prenom"));
            age.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("age"));  
            sexe.setCellValueFactory(new PropertyValueFactory<Patient,String>("sexe"));
            ville.setCellValueFactory(new PropertyValueFactory<Patient,String>("ville"));
            situation.setCellValueFactory(new PropertyValueFactory<Patient,String>("situation"));
            myTable.setItems(newData);
             
      } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(patientController.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }else if(selecF.isSelected()){
        try {
          myTable.getItems().removeAll(myTable.getItems());
          myConn=Patient.Connection();
          Statement myStatement = myConn.createStatement();
          String sql = "SELECT * FROM patient WHERE sexePatient ='F'";
          ResultSet rs = myStatement.executeQuery(sql);

             while (rs.next()) {  
               newData.add(new Patient(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(9),rs.getString(11),rs.getString(16)));    
         }
           
            id.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("id"));
            nom.setCellValueFactory(new PropertyValueFactory<Patient,String>("nom"));
            prenom.setCellValueFactory(new PropertyValueFactory<Patient,String>("prenom"));
            age.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("age"));  
            sexe.setCellValueFactory(new PropertyValueFactory<Patient,String>("sexe"));
            ville.setCellValueFactory(new PropertyValueFactory<Patient,String>("ville"));
            situation.setCellValueFactory(new PropertyValueFactory<Patient,String>("situation"));
            myTable.setItems(newData);
             
      } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(patientController.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }else{
    
    newData.clear(); try {
          myConn=Patient.Connection();
          Statement myStatement = myConn.createStatement();
          String sql = "SELECT * FROM `patient` ";
          ResultSet rs = myStatement.executeQuery(sql);

             while (rs.next()) {  
               newData.add(new Patient(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(9),rs.getString(11),rs.getString(16)));    
         }
           
            id.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("id"));
            nom.setCellValueFactory(new PropertyValueFactory<Patient,String>("nom"));
            prenom.setCellValueFactory(new PropertyValueFactory<Patient,String>("prenom"));
            age.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("age"));  
            sexe.setCellValueFactory(new PropertyValueFactory<Patient,String>("sexe"));
            ville.setCellValueFactory(new PropertyValueFactory<Patient,String>("ville"));
            situation.setCellValueFactory(new PropertyValueFactory<Patient,String>("situation"));
            myTable.setItems(newData);
            
             
      } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(patientController.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    
    }




   }
    
    @FXML
    void refresh(ActionEvent event){
    
    newData.clear();
    try {
          myConn=Patient.Connection();
          Statement myStatement = myConn.createStatement();
          String sql = "SELECT * FROM `patient` ";
          ResultSet rs = myStatement.executeQuery(sql);

             while (rs.next()) {  
               newData.add(new Patient(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(9),rs.getString(11),rs.getString(16)));    
         }
           
            id.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("id"));
            nom.setCellValueFactory(new PropertyValueFactory<Patient,String>("nom"));
            prenom.setCellValueFactory(new PropertyValueFactory<Patient,String>("prenom"));
            age.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("age"));  
            sexe.setCellValueFactory(new PropertyValueFactory<Patient,String>("sexe"));
            ville.setCellValueFactory(new PropertyValueFactory<Patient,String>("ville"));
            situation.setCellValueFactory(new PropertyValueFactory<Patient,String>("situation"));
            myTable.setItems(newData);
            
             
      } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(patientController.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    @FXML
    private void exitButton(ActionEvent event) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Quit.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
    }
     @FXML
    void minimize(ActionEvent event){
    
      Stage stage =(Stage)rootpane.getScene().getWindow();
      stage=(Stage)((Button)event.getSource()).getScene().getWindow();
      stage.setIconified(true);
    
    
    
    }
  
     @FXML
    private void consultation(ActionEvent event) throws IOException{
      AnchorPane pane= FXMLLoader.load(getClass().getResource("consultation.fxml"));
      rootpane.getChildren().setAll(pane);
    
    }
    @FXML
    void back(MouseEvent MOUSE_CLICKED) throws IOException{
    
      AnchorPane pane= FXMLLoader.load(getClass().getResource("homePage.fxml"));
      rootpane.getChildren().setAll(pane);
    }
    
    @FXML 
    void test(ActionEvent event) throws IOException, SQLException{
       try{
         myTable.setEditable(true);
         int selectedIndex = myTable.getSelectionModel().getSelectedIndex();
         Patient selectedItem = myTable.getSelectionModel().getSelectedItem();
         if (selectedIndex >= 0) {
         Statement myStatement = myConn.createStatement();
         String sql = "SELECT * FROM `patient` WHERE `id_patient` = "+selectedItem.getId()+"";
         ResultSet rs = myStatement.executeQuery(sql);
         while(rs.next()){
         
         Patient.idTable=rs.getInt("id_patient");
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("changePatient.fxml"));
         Parent root1 = (Parent) fxmlLoader.load();
         Stage stage = new Stage();
         stage.setScene(new Scene(root1)); 
         stage.initStyle(StageStyle.UNDECORATED);
         stage.show();
         myTable.setEditable(true);
      
     
    
         }}else {
        
         Alert alert = new Alert(Alert.AlertType.WARNING);
         alert.setTitle("Pas De Selection");
         alert.setHeaderText("Aucune Case sélectionnée");
         alert.setContentText("veuillez sélectionner un patient dans la table.");
         alert.showAndWait();
      }} catch (SQLException ex) {
          Logger.getLogger(patientController.class.getName()).log(Level.SEVERE, null, ex);
      }
        
      
    }
    
   @FXML 
   private AnchorPane color;
    
   private double xOffset;
   private double yOffset;
   
   
   @FXML
    private TableView<Patient> myTable;
   @FXML
    private TableColumn<Patient,Integer> id;       
   @FXML
    private TableColumn<Patient,String> nom;           
   @FXML
    private TableColumn<Patient,String> prenom; 
   @FXML
    private TableColumn<Patient,Integer> age;
   @FXML
    private TableColumn<Patient,String> sexe;
   @FXML
    private TableColumn<Patient,String> ville;
   @FXML
    private TableColumn<Patient,String> situation;
    Connection myConn=null;
    public ObservableList<Patient>newData=FXCollections.observableArrayList();
       
   @FXML
    void supprimer (ActionEvent event ){
        try{    
         myTable.setEditable(true);
         int selectedIndex = myTable.getSelectionModel().getSelectedIndex();
         Patient selectedItem = myTable.getSelectionModel().getSelectedItem();
       if (selectedIndex >= 0) {  
         myConn=Patient.Connection();
         myTable.getItems().remove(selectedIndex);
         String sql = "DELETE FROM `patient` WHERE `id_patient` = "+selectedItem.getId()+"";
         myConn=Patient.Connection();
         Statement myStatement = myConn.createStatement();       
         myStatement.executeUpdate(sql);
       }else {
        
         Alert alert = new Alert(Alert.AlertType.WARNING);
         alert.setTitle("Pas De Selection");
         alert.setHeaderText("Aucune Case sélectionnée");
         alert.setContentText("veuillez sélectionner un patient dans la table.");
         alert.showAndWait();
      }

      }catch (SQLException ex) {
           Logger.getLogger(patientController.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
           Logger.getLogger(patientController.class.getName()).log(Level.SEVERE, null, ex);
      }
  
    }
   @FXML 
   void recherche(KeyEvent key){
        String word=recherche.getText();
    try {
        myTable.getItems().removeAll(myTable.getItems());
        myConn=Patient.Connection();
        Statement myStatement = myConn.createStatement();
        String sql = "SELECT * FROM patient WHERE nomPatient LIKE '"+word+"%' "
                     + "OR prenomPatient LIKE '"+word+"%' order by nomPatient ";
        ResultSet rs = myStatement.executeQuery(sql);

         while (rs.next()) {  
           newData.add(new Patient(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(9),rs.getString(11),rs.getString(16)));    
         }
           
           id.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("id"));
           nom.setCellValueFactory(new PropertyValueFactory<Patient,String>("nom"));
           prenom.setCellValueFactory(new PropertyValueFactory<Patient,String>("prenom"));
           age.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("age"));  
           sexe.setCellValueFactory(new PropertyValueFactory<Patient,String>("sexe"));
           ville.setCellValueFactory(new PropertyValueFactory<Patient,String>("ville"));
           situation.setCellValueFactory(new PropertyValueFactory<Patient,String>("situation"));
           myTable.setItems(newData);
             
      } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(patientController.class.getName()).log(Level.SEVERE, null, ex);
      }
   
   
   
   
   }
    
   
    
    
    public void initialize(URL url, ResourceBundle rb) {
     color.setOnMousePressed( e ->{
     xOffset = PFE.getStageObj().getX() - e.getSceneX();
     yOffset = PFE.getStageObj().getY() - e.getSceneY();
     color.setCursor(Cursor.CLOSED_HAND);
 
 });
    color.setOnMouseDragged( e ->{
    PFE.getStageObj().setX( e.getSceneX() + xOffset);
    PFE.getStageObj().setY( e.getSceneY() + yOffset);
 
  });
 
    color.setOnMouseReleased( e ->{ 
    color.setCursor(Cursor.DEFAULT);
 });

   
       try {
          myConn=Patient.Connection();
          Statement myStatement = myConn.createStatement();
          String sql = "SELECT * FROM `patient` ";
          ResultSet rs = myStatement.executeQuery(sql);

             while (rs.next()) {  
               newData.add(new Patient(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(9),rs.getString(11),rs.getString(16)));    
         }
           
            id.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("id"));
            nom.setCellValueFactory(new PropertyValueFactory<Patient,String>("nom"));
            prenom.setCellValueFactory(new PropertyValueFactory<Patient,String>("prenom"));
            age.setCellValueFactory(new PropertyValueFactory<Patient,Integer>("age"));  
            sexe.setCellValueFactory(new PropertyValueFactory<Patient,String>("sexe"));
            ville.setCellValueFactory(new PropertyValueFactory<Patient,String>("ville"));
            situation.setCellValueFactory(new PropertyValueFactory<Patient,String>("situation"));
            myTable.setItems(newData);
            
             
      } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(patientController.class.getName()).log(Level.SEVERE, null, ex);
      }
     
       
    }    
    
}
