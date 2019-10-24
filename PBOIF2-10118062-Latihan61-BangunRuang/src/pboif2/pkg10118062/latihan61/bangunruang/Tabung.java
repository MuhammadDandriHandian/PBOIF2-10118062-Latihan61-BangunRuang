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
public class Tabung implements Hitung {
    
    private int JariJari;
    private int Tinggi;

    public int getJariJari() {
        return JariJari;
    }

    public void setJariJari(int JariJari) {
        this.JariJari = JariJari;
    }

    public int getTinggi() {
        return Tinggi;
    }

    public void setTinggi(int Tinggi) {
        this.Tinggi = Tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI*JariJari*Tinggi; //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
}
