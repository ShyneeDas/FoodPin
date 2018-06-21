/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template 90in the editor.
 */
package empModel;


import empService.GetConnection;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author shynee
 */
public class userDAO {
public boolean insertUser (UserDTO udto){
    boolean b=false;
        Connection con=GetConnection.getConnection();
        String sql="insert into user values(?,?,?,?,?,?)";
    try{
        PreparedStatement ps= con.prepareStatement(sql);
       
        ps.setString(1,udto.getName());
        ps.setString(2,udto.getFname());
        ps.setString(3,udto.getEmail());
        ps.setString(4,udto.getPassword());
        ps.setString(5,udto.getCpassword());
        ps.setInt(6,udto.getMobile());
        int i=ps.executeUpdate();
        if(i>0){
            b=true;
        }
    }
    catch(Exception e){
        System.out.println("Try Again");
    }
    return b;
}    
public boolean loginUser (UserDTO udto){
    boolean b=false;
    try{
    Connection con=GetConnection.getConnection();
    String sql="select * from user where email=? and password=?";
    
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,udto.getEmail());
        ps.setString(2,udto.getPassword());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            b=true;
            
             }
        
    }
    catch(Exception e){
        
    }
    return b;
}
}
