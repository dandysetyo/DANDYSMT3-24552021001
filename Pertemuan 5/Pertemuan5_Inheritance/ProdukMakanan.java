/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5_Inheritance;

/**
 *
 * @author setyo
 */
public class ProdukMakanan extends Produk {

    double berat;        // contoh: 0.5 kg
    double hargaPerGram; // contoh: 200 rupiah per gram

    void setTambahan(double _berat, double _hargaPerGram) {
        berat = _berat;
        hargaPerGram = _hargaPerGram;
    }

    void tampilTambahan() {
        System.out.println("Berat (gram)      : " + berat);
        System.out.println("Harga per gram    : " + hargaPerGram);
        System.out.println("Total Harga       : " + hitungTotal(hargaDasar, berat * hargaPerGram));
    }
}
