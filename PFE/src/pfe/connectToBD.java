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


        public static void main(String[] args) throws SQLException {

        Connection myConnection = null;
        Statement myStatement = null;
        ResultSet myResult = null;

       
        try {
            // 1. Get a connection to database
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CabinetDB?autoReconnect=true&useSSL=false","root", "zaki    usa");

            // 2. Create a statement
            myStatement = myConnection.createStatement();

            // 3. Execute SQL query
            myResult = myStatement.executeQuery("");

            // 4. Process the result set
            while (myResult.next()) {
                System.out.println(myResult.getString("") + ", " + myResult.getString(""));
            }

        } catch (SQLException exc) {
        } finally {
            if (myResult != null) {
                myResult.close();
            }

            if (myStatement != null) {
                myStatement.close();
            }

            if (myConnection != null) {
                myConnection.close();
            }
        }
    }   

}

