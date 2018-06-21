/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empModel;

import java.io.Serializable;


public class UserDTO implements Serializable {

    private String name,fname,email,password,cpassword;
    private int mobile;
    
    
   
    public UserDTO() {
    }

    public UserDTO(String name, String fname, String email, String password, String cpassword, int mobile) {
        this.name = name;
        this.fname = fname;
        this.email = email;
        this.password = password;
        this.cpassword = cpassword;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
    
   
}
