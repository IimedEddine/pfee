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
  @FXML AnchorPane rootpane;
     
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
    private AnchorPane ordd;
    
    @FXML
    private AnchorPane blanc;
    
    @FXML
    void showOrd(ActionEvent event) throws IOException{
    
    AnchorPane pane= FXMLLoader.load(getClass().getResource("ordd.fxml"));
    blanc.getChildren().setAll(pane);
    }
   @FXML
    void back(MouseEvent MOUSE_CLICKED) throws IOException{
    
    AnchorPane pane= FXMLLoader.load(getClass().getResource("homePage.fxml"));
    rootpane.getChildren().setAll(pane);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    
    
}
