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
public class GoSend extends Pengiriman {
    @Override
    void kirimPaket(double berat, String tujuan) {
        double biaya = berat * 12000;
        System.out.println("\n=== GoSend ===");
        System.out.println("Kirim ke: " + tujuan);
        System.out.println("Biaya kirim: Rp " + biaya);
        System.out.println("Estimasi: 1 hari");
    }
}

