/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4_modifier;

/**
 *
 * @author setyo
 */public class mahasiswa_modifier {
    // Atribut dengan access modifier private
    private String nim = "";
    private String nama = "";
    private Double ipk = 0.0;
    private String predikat = "";

    // Constructor
    public mahasiswa_modifier(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("IPK   : " + ipk);
    }

    // Method untuk menentukan predikat berdasarkan IPK
    public String predikat() {
        if (ipk >= 3.5) {
            return "Cumlaude";
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.0) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }

    // Method untuk mengubah nama
    public void updateNama(String namaBaru) {
        this.nama = namaBaru;
    }

    // Method untuk mengecek kelulusan
    public boolean cekKelulusan(Double nilaiMinimal) {
        return ipk >= nilaiMinimal;
    }
}

