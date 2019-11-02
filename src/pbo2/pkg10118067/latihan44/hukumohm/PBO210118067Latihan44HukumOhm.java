/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan44.hukumohm;

/**
 *
 * @author
 * Nama     : Agus Awaludin
 * Kelas    : PBO2
 * NIM      : 10118067
 * Latihan ini berisi tentang bagaimana menghitung hasil tegangan menggunakan
 * hukum ohmda dalam sebuah program
 */
public class PBO210118067Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai baterai = new Baterai();
        
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar \n"
                + "akan berbanding lurus dengan beda potensial \npada ujung-ujung"
                + "kawat penghantar tersebut \nasalkan suhu kawat dijaga konstan. \n");
        
        System.out.println("Kuat Arus : " +baterai.getKuatArus() + " ampere");
        System.out.println("Hambatan : " +baterai.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : " +baterai.hitungTegangan() + " volt");
        
        
    }
        
}
