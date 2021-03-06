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
public class User {
    
    public int ID_User;
    public String username;
    public String password;
    public String repassword;
    public String alamat;
    public String noHp;
    public int tipeUser;
    
    public User() {
    
    }

    public User(int ID_User,String username, String password,String repassword ,String alamat, String noHp,int tipeUser) {
        this.ID_User = ID_User;
        this.username = username;
        this.password = password;
        this.repassword = repassword;
        this.alamat = alamat;
        this.noHp = noHp;
        this.tipeUser = tipeUser;
    }

    public int getTipeUser() {
        return tipeUser;
    }

    public void setTipeUser(int tipeUser) {
        this.tipeUser = tipeUser;
    }
    
    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  
    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
    
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    
    @Override
    public String toString(){
        return "ID : " + this.getID_User() + " Nama : " + this.getUsername() + " Alamat : " + this.getAlamat() + " No.HP : " + this.getNoHp();
    }

}
