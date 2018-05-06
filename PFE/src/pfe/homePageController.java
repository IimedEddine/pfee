/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.stage.StageStyle;
import javafx.scene.input.DragEvent;

/**
 *
 * @author imad_
 */
public class homePageController implements Initializable {
    
    @FXML
    private Label label;
    
    
    
   
    
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
    private Button button;
        
    @FXML 
    private AnchorPane rootpane;
    
    
    @FXML
    private void agenda(ActionEvent event) throws IOException{
     AnchorPane pane= FXMLLoader.load(getClass().getResource("Agenda.fxml"));
      rootpane.getChildren().setAll(pane);
        

    
    }
    @FXML 
     private void patient(ActionEvent event) throws IOException{
      AnchorPane pane= FXMLLoader.load(getClass().getResource("Patient.fxml"));
      rootpane.getChildren().setAll(pane);

    
    }
     @FXML
    private void consultation(ActionEvent event) throws IOException{
     AnchorPane pane= FXMLLoader.load(getClass().getResource("consultation.fxml"));
      rootpane.getChildren().setAll(pane);
    
    }
    @FXML
    private void cerOrd(ActionEvent event) throws IOException{
     FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cerOrd.fxml"));
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
    AnchorPane color;
    
    @FXML
    void bleu(ActionEvent event){
    color.setStyle("-fx-background-color:#4b7bec;");
    }
      @FXML
    void noir(ActionEvent event){
    color.setStyle("-fx-background-color:#2d3436;");
    }
      @FXML
    void vert(ActionEvent event){
    color.setStyle("-fx-background-color:#218c74;");
    }
      @FXML
    void jaune(ActionEvent event){
     color.setStyle("-fx-background-color:#fbc531;");
    }
      @FXML
    void violet(ActionEvent event){
     color.setStyle("-fx-background-color:#82589F;");
    }
      @FXML
    void rose(ActionEvent event){
     color.setStyle("-fx-background-color:#ef5777;");
    }
   
   
    public void initialize(URL arg0, ResourceBundle arg1) {
    
 
}
}
