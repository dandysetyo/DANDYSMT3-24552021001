/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author setyo
 */
public class Mahasiswaa {
    String nim = "";
    String nama = "";
    Double ipk = 0.0;
    String predikat = "";

    // Konstruktor
    public Mahasiswaa(String nim, String nama, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    // Method untuk menampilkan data Mahasiswa
    void tampilkanData() {
        System.out.println(nim);
        System.out.println(nama);
        System.out.println(ipk);
    }

    // Method untuk menentukan predikat
        String predikat() {
        if (ipk >= 3.5) {
            predikat = "Cumlaude";
        } else if (ipk >= 3.25) {
            predikat = "Sangat Memuaskan";
        }
        return predikat;}
    // Prosedur untuk update nama dengan parameter
    void updateNama(String namaBaru) {
        this.nama = namaBaru;
        System.out.println("Nama berhasil diubah menjadi: " + this.nama);
    }

    // Fungsi untuk cek kelulusan berdasarkan nilai minimal
    boolean cekKelulusan(Double nilaiMinimal) {
        return this.ipk >= nilaiMinimal;
    }
}