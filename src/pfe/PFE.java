/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author imad_
 */
public class PFE extends Application {
    private static Stage stageObj;
    
    @Override
    public void start(Stage stage) throws Exception {
        stageObj = stage;
             try{
        Parent root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
        
        Scene scene = new Scene(root);
       
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }catch(Exception ex){
        ex.printStackTrace();
    }
    
    }

  
    public static void main(String[] args) {
        launch(args);
        int labelId; 
    }

    public static Stage getStageObj(){
     return stageObj;  
    }
    }
