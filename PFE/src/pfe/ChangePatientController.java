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
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
