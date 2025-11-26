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
    public class ProdukElektronik extends Produk {

    double biayaGaransi;

    void beriGaransi(double _biayaGaransi) {
        biayaGaransi = _biayaGaransi;
    }

    double totalHarga() {
        double gajiPokok = 0;
        double hargaAkhir = gajiPokok + biayaGaransi; 
        return hargaAkhir;
    }

    void tampilTambahan() {
        System.out.println("Biaya Garansi : " + biayaGaransi);
        System.out.println("Total Harga   : " + hitungTotal(hargaDasar, biayaGaransi));
    }
}


