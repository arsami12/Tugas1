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
        
        M4A1.nama="M4A1";
        M4A1.jarakTembak="710M";
        M4A1.jenisPeluru="Timah";
        M4A1.beratSenjata="7,13 Kg";
        M4A1.kapasitasPeluru="30 s/d 80 Peluru per satu slot/magazine";
        M4A1.warnaSenjata="Hitam";
        M4A1.caraMenembak="Masukkan slot pada bagian bawah, tarik kebelakang "
                + "pada gagang di samping kanan, bidik dan tekan pelatuk.";
        M4A1.SPACI="";
        
        M4A1.cetakInfo();
        
        AK47.nama="AK47";
        AK47.jarakTembak="530M";
        AK47.jenisPeluru="Timah";
        AK47.beratSenjata="7 Kg";
        AK47.kapasitasPeluru="30 s/d 100 Peluru per satu slot/magazine";
        AK47.warnaSenjata="Coklat Tua, Hitam";
        AK47.caraMenembak="Masukkan slot pada bagian bawah, tarik kebelakang "
                + "pada gagang di samping kanan, bidik dan tekan pelatuk.";
        AK47.SPACI="";
        
        AK47.cetakInfo();
        
        SCARL.nama="SCARL";
        SCARL.jarakTembak="810M";
        SCARL.jenisPeluru="Timah";
        SCARL.beratSenjata="8,3 Kg";
        SCARL.kapasitasPeluru="20 s/d 40 Peluru per satu slot/magazine";
        SCARL.warnaSenjata="Coklat Muda";
        SCARL.caraMenembak="Masukkan slot pada bagian bawah, tarik kebelakang "
                + "pada gagang di samping kanan, bidik dan tekan pelatuk.";
        SCARL.SPACI="";
                
        SCARL.cetakInfo();
    }
}
