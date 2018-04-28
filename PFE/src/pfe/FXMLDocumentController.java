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
/**
 *
 * @author imad_
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    
    
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.exit(0);
    }
        @FXML
    private Button button;
        
    @FXML 
    private AnchorPane rootpane;
    
    
    @FXML
    private void haha(ActionEvent event) throws IOException{
     FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXML.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1));  
       stage.show();

    
    }
    @FXML 
     private void jj(ActionEvent event) throws IOException{
     FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXML1.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1));  
       stage.show();

    
    }
    
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    
    }    
      @FXML 
     void min(ActionEvent event){
    
    
    
    
    }
}
