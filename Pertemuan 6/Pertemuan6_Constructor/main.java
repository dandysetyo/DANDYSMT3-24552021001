/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6_Polimorfisme_statis;

/**
 *
 * @author setyo
 */
public class main {
    public static void main(String[] args) {

        Master_PBO_Pencarian_Menu menu = new Master_PBO_Pencarian_Menu();

        // Pencarian berdasarkan nama
        menu.search("Nasi Goreng");

        // Pencarian berdasarkan kode
        menu.search(301);

        // Pencarian berdasarkan nama + kategori
        menu.search("Ayam Bakar", "Makanan Berat");
    }
}
