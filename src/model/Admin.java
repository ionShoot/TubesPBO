/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Hp
 */

public class Admin extends User {
    
    private String IDAdmin;
    
    public Admin() {
        
    }
    
    public Admin(int id_user, String nama, String password, String repassword, String alamat, String noHp,int tipeUser ,String IDAdmin) {
        super(id_user, nama, password, repassword, alamat, noHp,tipeUser);
        this.IDAdmin = IDAdmin;
    }
    
    public Admin(String IDAdmin){
         this.IDAdmin = IDAdmin;
    }
    
    public String getIDAdmin() {
        return IDAdmin;
    }

    public void setIDAdmin(String IDAdmin) {
        this.IDAdmin = IDAdmin;
    }
    
}