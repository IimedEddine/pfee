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
import javafx.scene.input.KeyEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.TextArea;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuButton;
/**MenuButton
 * FXML Controller class
 *
 * @author imad_
 */
public class consultationController implements Initializable {

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
    private void cerOrd(ActionEvent event) throws IOException{
     FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cerOrd.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();

    
    }
    @FXML
    private TextArea Crondu;
    @FXML
     TextField ng;
    @FXML
    private Label nbrgr;
    
    @FXML private RadioButton femme;
    @FXML 
    void Show(ActionEvent event){
    ng.setVisible(true);
    nbrgr.setVisible(true);
    G.setVisible(true);
       gp.setVisible(true);
      slash.setVisible(true);
      p.setVisible(true);
    }
    @FXML
     void hide(ActionEvent event){
    ng.setVisible(false);
    nbrgr.setVisible(false);
    G.setVisible(false);
       gp.setVisible(false);
      slash.setVisible(false);
      p.setVisible(false);
    }
    @FXML
    private AnchorPane color;
     
     @FXML
     void blue(ActionEvent event){
     color.setStyle("-fx-background-color:blue;");
     
     }
     
     @FXML
      Label G;
    @FXML 
    Label slash;
    @FXML
    Label gp;
    @FXML
    TextField p;
    @FXML
    Label enfant;
    @FXML
    RadioButton o;
    @FXML
    RadioButton non;
    
    @FXML
    void showEnfmar(ActionEvent event){
    enfant.setVisible(true);
    o.setVisible(true);
    non.setVisible(true);
            select.setText("Marié(e)");
    
    }
      @FXML
    void showEnfdiv(ActionEvent event){
    enfant.setVisible(true);
    o.setVisible(true);
    non.setVisible(true);
    select.setText("Divorcé(e)");
    }
    @FXML
    void hidEnf(ActionEvent event){
    enfant.setVisible(false);
    o.setVisible(false);
    non.setVisible(false);
    select.setText("Celibataire");
    
    }
    @FXML
    MenuButton select;
    @FXML 
    MenuItem celib;
    @FXML
    MenuItem div;
    @FXML
    MenuItem mar;
    
    @FXML
    void gP(KeyEvent key){
    G.setText(ng.getText());
    }
    
    
    public void initialize(URL url, ResourceBundle rb) {
        ng.setVisible(false);
        nbrgr.setVisible(false);
       G.setVisible(false);
       gp.setVisible(false);
      slash.setVisible(false);
      p.setVisible(false);
       enfant.setVisible(false);
    o.setVisible(false);
    non.setVisible(false);
    }    
    
}
