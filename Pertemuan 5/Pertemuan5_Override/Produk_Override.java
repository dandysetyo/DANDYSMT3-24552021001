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
public class Produk_Override {

    String namaProduk;
    String kodeProduk;
    double hargaDasar;

    void daftarProduk(String _namaProduk, String _kodeProduk, double _hargaDasar) {
        namaProduk = _namaProduk;
        kodeProduk = _kodeProduk;
        hargaDasar = _hargaDasar;
    }

    void tampilkanData() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Harga Dasar : " + hargaDasar);
    }

    double hitungTotal(double data1, double data2) {
        return data1 + data2;
    }
}

