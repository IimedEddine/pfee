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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;




/**
 * FXML Controller class
 *
 * @author imad_
 */
public class CerOrdController implements Initializable {
  @FXML AnchorPane rootpane;
     
    @FXML
    private void exitButton(ActionEvent event) {
       Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
        
        
    }
     @FXML
    void minimize(ActionEvent event){
    
    Stage stage =(Stage)rootpane.getScene().getWindow();
    stage=(Stage)((Button)event.getSource()).getScene().getWindow();
    stage.setIconified(true);
    
    
    
    }
   
    
    
    @FXML
    private AnchorPane ordd;
    
    @FXML
    private AnchorPane blanc;
    
    @FXML
    void showOrd(ActionEvent event) throws IOException{
    
    AnchorPane pane= FXMLLoader.load(getClass().getResource("ordd.fxml"));
    blanc.getChildren().setAll(pane);
    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    
    
}
