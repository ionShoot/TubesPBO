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
public class ListBis {
    private String namaKelas;
    private int jumlahKapasitas;
    private String namaBis;
    public ArrayList<ListBis> daftarBis;
    
    public enum bisEnum {
        Ekonomi,Reguler,VIP;
    }
    
    public ListBis(String namaKelas, int jumlahKapasitas) {
        this.namaKelas = namaKelas;
        this.jumlahKapasitas = jumlahKapasitas;
    }
    
}