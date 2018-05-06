/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class connectToBD {


        public static void main(String[] args) throws Exception {

        Connection myConnection;
        Statement myStatement;
        

       
        try {
            // 1. Get a connection to database
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabinetdb","root", "");

            // 2. Create a statement
            myStatement = myConnection.createStatement();

            // 3. Execute SQL query
            ResultSet myResult = myStatement.executeQuery("Select * From Agenda");

            // 4. Process the result set
            while (myResult.next()) {
                System.out.println(myResult.getString("jour"));
            }

        } catch (Exception exc) {
        	
        	System.out.println(exc.getMessage());
        } 
    }   

}

