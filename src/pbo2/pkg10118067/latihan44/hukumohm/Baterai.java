/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan44.hukumohm;

/**
 *
 * @author Kiyo
 */
public class Baterai {
    private float kuatArus = 3;
    private float hambatan = 12;
    
    public Baterai() {
    
    }
    
    public Baterai(float kuatArus , float hambatan){
        
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
    
    
}
