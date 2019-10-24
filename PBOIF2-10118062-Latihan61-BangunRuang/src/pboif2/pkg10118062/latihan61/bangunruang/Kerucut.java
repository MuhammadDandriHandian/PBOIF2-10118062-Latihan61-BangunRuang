/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan61.bangunruang;

/**
 *
 * @author ASUS
 */
public class Kerucut implements Hitung {
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
       return Math.PI*1/3*JariJari*JariJari*Tinggi; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
