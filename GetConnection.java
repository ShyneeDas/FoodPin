/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author shynee
 */
public class GetConnection {
public static Connection getConnection(){  
     Connection con=null;
    try {
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/universal_info","root","amit");
 
     
            
    }
    catch(ClassNotFoundException | SQLException e){
        
    }
    return con; 
}
}
