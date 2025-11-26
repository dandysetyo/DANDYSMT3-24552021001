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
public class main {

    public static void main(String[] args) {

        ProdukMakanan makanan = new ProdukMakanan();
        ProdukElektronik elektronik = new ProdukElektronik();

        System.out.println("-------------------------------");
        System.out.println("         PRODUK MAKANAN        ");
        System.out.println("-------------------------------");

        makanan.setData("Roti Tawar", "FD01", 10000);
        makanan.setTambahan(200, 50); // 200 gram, Rp50/gram
        makanan.tampilkanData();
        makanan.tampilTambahan();

        System.out.println("______________________________");

        makanan.setData("Cokelat Batang", "FD02", 15000);
        makanan.setTambahan(100, 80);
        makanan.tampilkanData();
        makanan.tampilTambahan();

        System.out.println("______________________________\n");


        System.out.println("-------------------------------");
        System.out.println("      PRODUK ELEKTRONIK        ");
        System.out.println("-------------------------------");

        elektronik.setData("Headset", "EL01", 50000);
        elektronik.beriGaransi(8000);
        elektronik.tampilkanData();
        elektronik.tampilTambahan();

        System.out.println("______________________________");

        elektronik.setData("Keyboard Mechanical", "EL02", 150000);
        elektronik.beriGaransi(12000);
        elektronik.tampilkanData();
        elektronik.tampilTambahan();

        System.out.println("______________________________");
    }
}