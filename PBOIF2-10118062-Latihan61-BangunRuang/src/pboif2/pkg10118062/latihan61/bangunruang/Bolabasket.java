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
public class Bolabasket implements Hitung {

    private double JariJari;

    public double getJariJari() {
        return JariJari;
    }

    public void setJariJari(double JariJari) {
        this.JariJari = JariJari;
    }

    @Override
    public double hitungVolume() {
        return 4*Math.PI*(JariJari*JariJari*JariJari)/3; //To change body of generated methods, choose Tools | Templates.
    }
        
   
    }
    
    
    
    

