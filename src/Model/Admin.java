/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Admin extends User {
    private String ID;
    ArrayList<Rute> rute;
  
    public Admin(){
        
    }
    
    public Admin(String nama, String password, String alamat, String noHp, String ID){
        super(nama, password, alamat, noHp);
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void tambahPerjalanan(Rute rute){
        
    }
    
    public void lihatMember(){
        
    }
}
