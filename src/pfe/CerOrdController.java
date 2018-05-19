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
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;




/**
 * FXML Controller class
 *
 * @author imad_
 */
public class CerOrdController implements Initializable {
  @FXML 
          private AnchorPane rootpane;
     
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
    void back(MouseEvent MOUSE_CLICKED) throws IOException{
    
    AnchorPane pane= FXMLLoader.load(getClass().getResource("homePage.fxml"));
    rootpane.getChildren().setAll(pane);
    }
    
     @FXML 
    void patient(MouseEvent MOUSE_CLICKED) throws IOException{
    AnchorPane pane= FXMLLoader.load(getClass().getResource("Patient.fxml"));
    rootpane.getChildren().setAll(pane);
    
    
    }
    
    @FXML 
    private void Imprimer (ActionEvent event){
        
    
    
    }
    
    @FXML 
    private AnchorPane color;
    private double xOffset;
    private double yOffset;
    
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
    }    
    
    
}
