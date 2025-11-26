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
public class main {
    public static void main(String[] args) {

        // Object produk dasar
        Produk_Override produkDasar = new Produk_Override();
        produkDasar.daftarProduk("Produk Umum", "P000", 50000);
        System.out.println("===== PRODUK DASAR =====");
        produkDasar.tampilkanData();

        System.out.println("------------------------------");

        // Produk Elektronik
        ProdukElektronik_Override produkHP = new ProdukElektronik_Override();
        produkHP.daftarProduk("Smartphone", "ELX01", 3000000);
        produkHP.beriGaransi(250000);
        System.out.println("===== PRODUK ELEKTRONIK =====");
        produkHP.tampilkanData();

        System.out.println("------------------------------");

        // Produk Makanan
        ProdukMakanan_Override produkMakanan = new ProdukMakanan_Override();
        produkMakanan.daftarProduk("cokies jumbo", "FD09", 25000);
        produkMakanan.beriTambahanBerat(150, 50); 
        // 150 gram, Rp 50/gram

        System.out.println("===== PRODUK MAKANAN =====");
        produkMakanan.tampilkanData();
    }
}
