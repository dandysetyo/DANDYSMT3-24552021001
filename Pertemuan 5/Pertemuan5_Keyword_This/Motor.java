/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5_Keyword_This;

/**
 *
 * @author setyo
 */
public class Motor {
    private final String merk;
    private final String warna;
    private final int kecepatan;

    public Motor(String merk, String warna, int kecepatan) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = kecepatan; 
    }

    public void tampilkanInfo() {
        System.out.println("Merk Motor      : " + merk);
        System.out.println("Warna Motor     : " + warna);
        System.out.println("Kecepatan       : " + kecepatan + " km/jam");
        System.out.println("-------------------------------");
    }
}

