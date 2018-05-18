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
public class AgendaTextArea18Controller implements Initializable {

    @FXML
   TextArea area18;
   @FXML
   
    private void ok(ActionEvent event) throws ClassNotFoundException {
        Agenda myAgenda=new Agenda(18,area18.getText());
        myAgenda.Ajouter(18);
       Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
        
        
    }
    
    public void initialize(URL url, ResourceBundle rb) {
         try {
            Agenda myAgenda=new Agenda(18,area18.getText());
            area18.setText(myAgenda.Afficher(18));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaTextAreaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaTextAreaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
}
