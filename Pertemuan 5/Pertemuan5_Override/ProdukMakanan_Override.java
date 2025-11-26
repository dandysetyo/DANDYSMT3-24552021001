/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5_Override;

/**
 *
 * @author setyo
 */
public class ProdukMakanan_Override extends Produk_Override {

    double beratTambahan;    // dalam gram
    double biayaPerGram;     // biaya tambahan per gram

    void beriTambahanBerat(double berat, double biaya) {
        beratTambahan = berat;     // misal 200 gram
        biayaPerGram = biaya;      // misal Rp 5 per gram
    }

    @Override
    void tampilkanData() {
        System.out.println("Nama Produk       : " + namaProduk);
        System.out.println("Kode Produk       : " + kodeProduk);
        System.out.println("Harga Dasar       : " + hargaDasar);
        System.out.println("Berat Tambahan    : " + beratTambahan + " gram");
        System.out.println("Biaya per Gram    : " + biayaPerGram);
        System.out.println("Total Harga       : " +
                hitungTotal(hargaDasar, beratTambahan * biayaPerGram));
    }
}
