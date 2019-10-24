/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan61.bangunruang;

/**
 *
 * @author 
 * NAMA     : M Dandri Handian
 * KELAS    : PBOIF2
 * NIM      : 10118062
 */
public class PBOIF210118062Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bolabasket bb = new Bolabasket();
        bb.setJariJari(7);
        System.out.println("Volume Bola Basket : " +bb.hitungVolume()+ " Cm");
    
        Tabung tbg = new Tabung();
        tbg.setJariJari(10);
        tbg.setTinggi(21);
        System.out.println("Volume Tabung : " +tbg.hitungVolume()+ " Cm");

        Kerucut krc = new Kerucut();
        krc.setJariJari(14);
        krc.setTinggi(9);
        System.out.println("Volume Kerucut : "+krc.hitungVolume()+ " Cm");

    
    }
    
}
