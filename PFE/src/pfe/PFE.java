/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

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
    
    @Override
    public void start(Stage stage) throws Exception {
<<<<<<< HEAD
    	
=======
>>>>>>> 7a78823ae67d78b9a8fbc5332d872c32c5a1263a
        Parent root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
        
        Scene scene = new Scene(root);
       
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    }
