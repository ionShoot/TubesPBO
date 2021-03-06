/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Helper.FontStyle;
import view.Helper.DateLabelFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import model.*;

/**
 *
 * @author lenovo
 */
public class AddRuteScreen implements ActionListener {
    
    JFrame frameRute = new JFrame("Terminal Bis Emen");
    JLabel title = new JLabel("Menambahkan Rute");
    JLabel idRute = new JLabel("ID Rute : ");
    JTextField idRuteText = new JTextField();
    
    JLabel kotaAsal = new JLabel("Kota Asal : ");
    JTextField kotaAsalText = new JTextField();
    
    JLabel kotaTujuan = new JLabel("Kota Tujuan : ");
    JTextField kotaTujuanText = new JTextField();
    
    JLabel jam = new JLabel("Jam Berangkat : ");
    JTextField jamText = new JTextField();
    
    JLabel idBis = new JLabel("ID Bis : ");
    JTextField idBisText = new JTextField();
    
    JLabel tanggalBerangkat = new JLabel("Tanggal : ");
    JDatePickerImpl datePicker;
    UtilDateModel model;
    Properties p;
    JDatePanelImpl datePanel;
    
    JLabel kelasBis = new JLabel("Kelas Bis : ");
    JRadioButton vip = new JRadioButton(EnumBis.VIP.toString());    
    JRadioButton reguler = new JRadioButton(EnumBis.REGULER.toString());
    JRadioButton ekonomi = new JRadioButton(EnumBis.EKONOMI.toString()); 
    ButtonGroup bg2 = new ButtonGroup(); 
    
    JLabel hargaBis = new JLabel("Harga Bis : ");
    JTextField hargaBisText = new JTextField();
    
    JLabel hargaRute = new JLabel("Harga Rute : ");
    JTextField hargaRuteText = new JTextField();
    
    JLabel jumlahKapasitas = new JLabel("Jumlah Kapasitas : ");
    JTextField isiJumlahKapasitas = new JTextField();
    
    JButton buttonAdd = new JButton("Add");
    
    public AddRuteScreen() {
        
        title.setBounds(550,1,400,150);
        title.setFont(FontStyle.medium);
        
        idRute.setBounds(450,70,230,100);
        idRuteText.setBounds(600,110,300,30);
        idRute.setFont(FontStyle.small);
        
        kotaAsal.setBounds(450,110,230,100);
        kotaAsalText.setBounds(600,150,300,30);
        kotaAsal.setFont(FontStyle.small);
        
        kotaTujuan.setBounds(450,150,230,100);
        kotaTujuanText.setBounds(600,190,300,30);
        kotaTujuan.setFont(FontStyle.small);
        
        tanggalBerangkat.setBounds(450,200,200,100);
        tanggalBerangkat.setFont(FontStyle.small);
        
        model = new UtilDateModel();
        p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        
        datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setBounds(600, 240, 300, 30);
        datePicker.setFont(FontStyle.small);
        
        jam.setBounds(450,270,200,50);
        jamText.setBounds(630,285,90,35);
        jam.setFont(FontStyle.small);
        
        kelasBis.setBounds(450,320,200,50);
        kelasBis.setFont(FontStyle.small);
        vip.setBounds(600,330,50,30);
        vip.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    hargaBisText.setText("50000");
                    isiJumlahKapasitas.setText("10");
                }
            }
        });
        reguler.setBounds(670,330,80,30);
        reguler.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    hargaBisText.setText("30000");
                    isiJumlahKapasitas.setText("15");
                }
            }
        });
        ekonomi.setBounds(760,330,80,30);
        ekonomi.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                     hargaBisText.setText("20000");
                     isiJumlahKapasitas.setText("20");
                }
            }
        });
        bg2.add(vip);
        bg2.add(reguler);
        bg2.add(ekonomi);
        
        hargaRute.setBounds(450,370,200,50);
        hargaRuteText.setBounds(600,380,300,30);
        hargaRute.setFont(FontStyle.small);
        
        hargaBis.setBounds(450,420,200,50);
        hargaBisText.setBounds(600,430,300,30);
        hargaBis.setFont(FontStyle.small);
        
        idBis.setBounds(450,470,200,50);
        idBisText.setBounds(600,480,300,30);
        idBis.setFont(FontStyle.small);
        
        jumlahKapasitas.setBounds(450,520,200,50);
        jumlahKapasitas.setFont(FontStyle.small);
        isiJumlahKapasitas.setBounds(650,530,300,30);
        
        buttonAdd.setBounds(580,600,100,30);
        buttonAdd.addActionListener(this);
        buttonAdd.setFont(FontStyle.small);
        
        frameRute.add(title);
        frameRute.add(idRute);
        frameRute.add(idRuteText);
        frameRute.add(kotaAsal);
        frameRute.add(kotaAsalText);
        frameRute.add(kotaTujuan);
        frameRute.add(kotaTujuanText);
        frameRute.add(tanggalBerangkat);
        frameRute.add(datePicker);
        frameRute.add(jam);
        frameRute.add(jamText);
        frameRute.add(kelasBis);
        frameRute.add(vip);
        frameRute.add(reguler);
        frameRute.add(ekonomi);
        frameRute.add(hargaRute);
        frameRute.add(hargaRuteText);
        frameRute.add(hargaBis);
        frameRute.add(hargaBisText);
        frameRute.add(idBis);
        frameRute.add(idBisText);
        frameRute.add(jumlahKapasitas);
        frameRute.add(isiJumlahKapasitas);
        frameRute.add(buttonAdd);
        frameRute.setLayout(null);
        frameRute.setVisible(true);
        frameRute.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameRute.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        int ID_Rute = Integer.parseInt(this.idRuteText.getText());
        String kotaAsal = kotaAsalText.getText();
        Date tgl = null;
        try{
            tgl = new SimpleDateFormat("yyyy-MM-dd").parse(this.datePicker.getJFormattedTextField().getText());
        }catch(ParseException ex){
            Logger.getLogger(AddRuteScreen.class.getName()).log(Level.SEVERE,null,ex);
        }
        String jam = this.jamText.getText();
        int kelasBis = 0;
        if(this.vip.isSelected()){ 
            kelasBis = 1;
        }else if(this.reguler.isSelected()){
            kelasBis = 2;
        }else if(this.ekonomi.isSelected()){
            kelasBis = 3;
        }
        double hargaBis = Double.parseDouble(this.hargaBisText.getText());
        double hargaRute = Double.parseDouble(this.hargaRuteText.getText());
        int ID_Bis = Integer.parseInt(this.idBisText.getText());
        int jumlahMuatan = Integer.parseInt(this.isiJumlahKapasitas.getText());
        String kotaTujuan = kotaTujuanText.getText();
        int Choose = JOptionPane.showOptionDialog(null, "Sudah Yakin?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(Choose == JOptionPane.YES_OPTION){
            if(ID_Rute == 0 || kotaAsal.length() == 0 || kotaTujuan.length() == 0 || tgl == null
                || jam.length() == 0 || kelasBis == 0 || ID_Bis == 0 || hargaRute == 0 || hargaBis == 0){
                JOptionPane.showMessageDialog(null, "Input Semua Data! ", "Alert", JOptionPane.WARNING_MESSAGE);
            }else{
                if(Controller.cekIdBis(ID_Bis)){
                    JOptionPane.showMessageDialog(null,"ID Bis Sudah Ada!");
                }else{
                    if(Controller.cekRute(ID_Rute)){
                        JOptionPane.showMessageDialog(null,"ID Rute Sudah Ada!");
                    }else{    
                        DetailRute Detailrute = new DetailRute();
                        ListBus list = new ListBus();
                        list.setIdBis(ID_Bis);
                        if(kelasBis == 1){
                            list.setKelas(EnumBis.VIP);
                        }else if(kelasBis == 2){
                            list.setKelas(EnumBis.REGULER);
                        }else if(kelasBis == 3){
                            list.setKelas(EnumBis.EKONOMI);
                        }
                        list.setJumlahKapasitas(jumlahMuatan);
                        Detailrute.setIdRute(ID_Rute);
                        Detailrute.setIdbis(ID_Bis);
                        Detailrute.setKotaAsal(kotaAsal);
                        Detailrute.setKotaTujuan(kotaTujuan); 
                        Detailrute.setHargaBis(hargaBis);
                        Detailrute.setHargaRute(hargaRute);
                        Detailrute.setJamBerangkat(jam);
                        Detailrute.setTanggalBerangkat(tgl);
                        if(Controller.insertPerjalanan(Detailrute, list)){
                            JOptionPane.showMessageDialog(null, "Rute berhasil ditambahkan !");
                            new MenuUtamaAdmin();
                            frameRute.dispose(); 
                        }else{   
                            JOptionPane.showMessageDialog(null, "Rute Gagal Ditambahkan!", "Alert", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }  
        } 
    }
}
