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
public class senjataApi_Aksi {
    public static void main(String[] args) {
        senjataApi M4A1 = new senjataApi();
        senjataApi AK47 = new senjataApi();
        senjataApi SCARL = new senjataApi();
        
        M4A1.jarakTembak="710M";
        M4A1.jenisPeluru="Timah";
        M4A1.beratSenjata="7,13 Kg";
        M4A1.kapasitasPeluru="30 s/d 80 Peluru per satu slot/magazine";
        M4A1.warnaSenjata="Hitam";
        
        M4A1.cetakInfo();
    
        AK47.jarakTembak="530M";
        AK47.jenisPeluru="Timah";
        AK47.beratSenjata="7 Kg";
        AK47.kapasitasPeluru="30 s/d 100 Peluru per satu slot/magazine";
        AK47.warnaSenjata="Coklat Tua, Hitam";
        
        AK47.cetakInfo();
        
        SCARL.jarakTembak="810M";
        SCARL.jenisPeluru="Timah";
        SCARL.beratSenjata="8,3 Kg";
        SCARL.kapasitasPeluru="20 s/d 40 Peluru per satu slot/magazine";
        SCARL.warnaSenjata="Coklat Muda";
        
        SCARL.cetakInfo();
    }
}
