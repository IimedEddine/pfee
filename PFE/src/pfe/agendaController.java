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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author imad_
 */
public class agendaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML 
    AnchorPane rootpane;
    
    @FXML
    private void exitButton(ActionEvent event) {
    	Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
        
    }
    
   public void start(Stage stage) throws Exception {
    	
        Parent root = FXMLLoader.load(getClass().getResource("Agenda.fxml"));
        
        Scene scene = new Scene(root);
       
        
        stage.setScene(scene);
    }
    
     @FXML
    void minimize(ActionEvent event){
    
    Stage stage =(Stage)rootpane.getScene().getWindow();
    stage=(Stage)((Button)event.getSource()).getScene().getWindow();
    stage.setIconified(true);
    
    }
     
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
