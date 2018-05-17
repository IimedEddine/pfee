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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.Label;
/**
 * FXML Controller class
 *
 * @author imad_
 */
public class agendaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML AnchorPane rootpane;
    
  int labelId; 
     
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
    void minimize(ActionEvent event) throws IOException{
    
    Stage stage =(Stage)rootpane.getScene().getWindow();
    stage=(Stage)((Button)event.getSource()).getScene().getWindow();
    stage.setIconified(true);
    }
    @FXML 
    Label label;
    @FXML 
    
    
   
    void label1(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
      
    }
    
    @FXML 
    void label2(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea2.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=2;
    
    }
    
    @FXML 
    void label3(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea3.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=3;
    
    }
    
    @FXML 
    void label4(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea4.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=4;
    
    }
    
    @FXML 
    void label5(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea5.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=5;
    
    }
    
    @FXML 
    void label6(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea6.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=6;
    
    }
    
    @FXML 
    void label7(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea7.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=7;
    
    }
    
    @FXML 
    void label8(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea8.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=8;
    
    }
    @FXML 
    void label9(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea9.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=9;
    
    }
    
    @FXML 
    void label10(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea10.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=10;
    
    }
    
    @FXML 
    void label11(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea11.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=11;
    
    }
    
    @FXML 
    void label12(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea12.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=12;
    
    }
    
    @FXML 
    void label13(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea13.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=13;
    
    }
    
    @FXML 
    void label14(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea14.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=14;
    
    }
    
    @FXML 
    void label15(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea15.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=15;
    
    }
    
    @FXML 
    void label16(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea16.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=16;
    
    }
    
    @FXML 
    void label17(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea17.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=17;
    
    }
    
    @FXML 
    void label18(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea18.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=18;
    
    }
    
    @FXML 
    void label19(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea19.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=19;
    
    }
    
    @FXML 
    void label20(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea20.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=20; 
    
    }
    
     @FXML 
    void label21(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea21.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=21;
    
    }
    
     @FXML 
    void label22(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea22.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=22;
    }
    
     @FXML 
    void label23(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea23.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=23;
    
    }
    
     @FXML 
    void label24(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea24.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=24;
    
    }
    
     @FXML 
    void label25(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea25.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=25;
    
    }
    
     @FXML 
    void label26(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea26.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=26;
    
    }
    
     @FXML 
    void label27(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea27.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=27;
    
    }
    
     @FXML 
    void label28(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea28.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=28;
    
    }
    
     @FXML 
    void label29(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea29.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=29;
    
    }
    
     @FXML 
    void label30(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea30.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=30;
    
    }
    
     @FXML 
    void label31(MouseEvent MOUSE_CLICKED) throws IOException{
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AgendaTextArea31.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
       Stage stage = new Stage();
       stage.setScene(new Scene(root1)); 
       stage.initStyle(StageStyle.UNDECORATED);
       stage.show();
       labelId=31;
    
    }
            
    
    
    
    @FXML
    void back(MouseEvent MOUSE_CLICKED) throws IOException{
    AnchorPane pane= FXMLLoader.load(getClass().getResource("homePage.fxml"));
    rootpane.getChildren().setAll(pane);
    }
    
    @FXML private AnchorPane color;
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
 });    }    
    
}
