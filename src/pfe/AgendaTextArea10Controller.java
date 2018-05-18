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
public class AgendaTextArea10Controller implements Initializable {

   
   @FXML
   TextArea area10;
   @FXML
   
    private void ok(ActionEvent event) throws ClassNotFoundException {
        Agenda myAgenda=new Agenda(10,area10.getText());
        myAgenda.Ajouter(10);
       Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
        
        
    }
    
    public void initialize(URL url, ResourceBundle rb) {
         try {
            Agenda myAgenda=new Agenda(10,area10.getText());
            area10.setText(myAgenda.Afficher(10));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaTextAreaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaTextAreaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
}
