/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package namklabank;

/**
 *
 * @author test
 */
import java.sql.*;
public class DataBaseConnect {

    Connection databaseconnect(){
        Connection con=null;
         try{
            // Step 1  Register the driver class
                Class.forName("com.mysql.jdbc.Driver");

                // Step 2 Create the connection object
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/namkla bank","root","");

                        }
       catch(ClassNotFoundException | SQLException e){
           System.out.println(e);

        }
    return con;
}
}

