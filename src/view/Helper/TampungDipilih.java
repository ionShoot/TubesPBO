/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Helper;

import java.util.Date;

/**
 *
 * @author user
 */
public class TampungDipilih {
    private int banyakPenumpang = 0;
    private String jamBerangkat;
    private Date tanggalBerangkat;
    private double hargaRute;
    private double hargaBis;
    private int idRute;
    private String kotaAsal;
    private String kotaTujuan;
    private int idbis;
    
    public TampungDipilih() {
        
    }

    public TampungDipilih(String jamBerangkat, Date tanggalBerangkat, double hargaRute, double hargaBis, int idRute, String kotaAsal, String kotaTujuan, int idbis, int banyakPenumpang) {
        this.idRute = idRute;
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
        this.idbis = idbis;
        this.jamBerangkat = jamBerangkat;
        this.tanggalBerangkat = tanggalBerangkat;
        this.hargaBis = hargaBis;
        this.hargaRute = hargaRute;
        this.banyakPenumpang = banyakPenumpang;
    }

    public int getBanyakPenumpang() {
        return banyakPenumpang;
    }

    public void setBanyakPenumpang(int banyakPenumpang) {
        this.banyakPenumpang = banyakPenumpang;
    }
    
    public int getIdRute() {
        return idRute;
    }

    public void setIdRute(int idRute) {
        this.idRute = idRute;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    public int getIdbis() {
        return idbis;
    }

    public void setIdbis(int idbis) {
        this.idbis = idbis;
    }

    public String getJamBerangkat() {
        return jamBerangkat;
    }

    public void setJamBerangkat(String jamBerangkat) {
        this.jamBerangkat = jamBerangkat;
    }

    public Date getTanggalBerangkat() {
        return tanggalBerangkat;
    }

    public void setTanggalBerangkat(Date tanggalBerangkat) {
        this.tanggalBerangkat = tanggalBerangkat;
    }

    public double getHargaRute() {
        return hargaRute;
    }

    public void setHargaRute(double hargaRute) {
        this.hargaRute = hargaRute;
    }

    public double getHargaBis() {
        return hargaBis;
    }

    public void setHargaBis(double hargaBis) {
        this.hargaBis = hargaBis;
    }
    
    @Override
    public String toString(){
        return this.getIdRute() + this.getKotaAsal() + this.getKotaTujuan() +
               this.getIdbis() + this.getJamBerangkat() + this.getTanggalBerangkat() +
               this.getHargaRute() + this.getHargaBis();
    }
    
}
