/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author USER
 */
public class senjataApi {
       String jarakTembak;
       String jenisPeluru;
       String beratSenjata;
       String kapasitasPeluru;
       String warnaSenjata;
       
       //tambahan
       String SPACI;
       String nama;
       
       //behavior
       String caraMenembak; 
       
       void cetakInfo(){
           System.out.println("Nama Senjata   : "+nama);
           System.out.println("Akurasi        : "+jarakTembak);
           System.out.println("Type Peluru    : "+jenisPeluru);
           System.out.println("Berat          : "+beratSenjata);
           System.out.println("Max Peluru     : "+kapasitasPeluru);
           System.out.println("Warna Senjata  : "+warnaSenjata);
           System.out.println("Cara Pengunaan : "+caraMenembak);
           System.out.println(""+SPACI);
       }
    }
