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
public class ProdukElektronik_Override extends Produk_Override {

    double biayaGaransi;

    void beriGaransi(double _biayaGaransi) {
        biayaGaransi = _biayaGaransi;
    }

    double totalHarga() {
        return hargaDasar + biayaGaransi;
    }

    @Override
    void tampilkanData() {
        System.out.println("Nama Produk  : " + namaProduk);
        System.out.println("Kode Produk  : " + kodeProduk);
        System.out.println("Harga Dasar  : " + hargaDasar);
        System.out.println("Biaya Garansi: " + biayaGaransi);
        System.out.println("Total Harga  : " + hitungTotal(hargaDasar, biayaGaransi));
    }
}
