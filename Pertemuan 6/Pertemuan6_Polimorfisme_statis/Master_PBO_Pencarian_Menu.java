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
public class Master_PBO_Pencarian_Menu {
    private String namaMenu;

    // ===================================
    // 1. Pencarian berdasarkan nama menu
    // ===================================
    void search(String nama) {
        System.out.println("Mencari menu dengan nama: " + nama);

        switch (nama) {
            case "Nasi Goreng":
                namaMenu = "Nasi Goreng";
                break;
            case "Ayam Bakar":
                namaMenu = "Ayam Bakar";
                break;
            case "Sate Ayam":
                namaMenu = "Sate Ayam";
                break;
            case "Mie Goreng":
                namaMenu = "Mie Goreng";
                break;
            case "Es Teh Manis":
                namaMenu = "Es Teh Manis";
                break;
            default:
                namaMenu = null;
                System.out.println(">> Menu tidak ditemukan dalam database.");
                return;
        }

        System.out.println(">> Menu ditemukan: " + namaMenu);
    }

    // ===================================
    // 2. Pencarian berdasarkan kode menu
    // ===================================
    void search(int kodeMenu) {
        System.out.println("Mencari menu dengan KODE: " + kodeMenu);

        switch (kodeMenu) {
            case 301:
                namaMenu = "Nasi Goreng";
                break;
            case 302:
                namaMenu = "Ayam Bakar";
                break;
            case 303:
                namaMenu = "Sate Ayam";
                break;
            case 304:
                namaMenu = "Mie Goreng";
                break;
            case 305:
                namaMenu = "Es Teh Manis";
                break;
            default:
                namaMenu = null;
                System.out.println(">> Kode menu tidak ditemukan.");
                return;
        }

        System.out.println(">> Menu ditemukan: " + namaMenu);
    }

    // ===========================================
    // 3. Pencarian berdasarkan nama + kategori
    // ===========================================
    void search(String nama, String kategori) {
        System.out.println("Mencari menu: " + nama + " (Kategori: " + kategori + ")");

        // Anggap data menu tersedia
        namaMenu = nama;
        System.out.println(">> Menu ditemukan: " + namaMenu + " [Kategori: " + kategori + "]");
    }
}

