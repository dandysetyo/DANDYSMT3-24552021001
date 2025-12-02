/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7_Polimorfisme_Dinamis;

/**
 *
 * @author setyo
 */
public class JNT extends Pengiriman {
    @Override
    void kirimPaket(double berat, String alamat) {
        System.out.println("Pengiriman via J&T");
        System.out.println("Berat paket: " + berat + " kg");
        System.out.println("Alamat tujuan: " + alamat);
        double cost = berat * 9500; // tarif per kg sedikit berbeda
        System.out.println("Biaya kirim: Rp " + cost);
        System.out.println("Estimasi sampai: 1-2 hari kerja.");
        System.out.println("----------------------------------");
    }
}
