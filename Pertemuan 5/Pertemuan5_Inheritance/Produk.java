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
    public class Produk {

    String nama;
    String kode;
    double hargaDasar;

    void setData(String _nama, String _kode, double _hargaDasar) {
        nama = _nama;
        kode = _kode;
        hargaDasar = _hargaDasar;
    }

    void tampilkanData() {
        System.out.println("Nama Produk : " + nama);
        System.out.println("Kode        : " + kode);
        System.out.println("Harga Dasar : " + hargaDasar);
    }

    double hitungTotal(double a, double b) {
        return a + b;
    }
}
