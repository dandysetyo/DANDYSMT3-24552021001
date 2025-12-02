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
public class JNE extends Pengiriman {
    @Override
    void kirimPaket(double berat, String alamat) {
        System.out.println("Pengiriman via JNE");
        System.out.println("Berat paket: " + berat + " kg");
        System.out.println("Alamat tujuan: " + alamat);
        double cost = berat * 10000;
        System.out.println("Biaya kirim: Rp " + cost);
        System.out.println("Estimasi sampai: 2-3 hari.");
        System.out.println("----------------------------------");
    }
}