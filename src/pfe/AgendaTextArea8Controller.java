/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author imad_
 */
public class AgendaTextArea8Controller implements Initializable {

  
    @FXML
   TextArea area8;
   @FXML
   
    private void ok(ActionEvent event) throws ClassNotFoundException {
        Agenda myAgenda=new Agenda(8,area8.getText());
        myAgenda.Ajouter(8);
       Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
        
        
    }
    
    public void initialize(URL url, ResourceBundle rb) {
         try {
            Agenda myAgenda=new Agenda(8,area8.getText());
            area8.setText(myAgenda.Afficher(8));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaTextAreaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaTextAreaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
}
