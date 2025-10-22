/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4_modifier;

/**
 *
 * @author setyo
 */public class Utama_modifier {
    public static void main(String[] args) {
        mahasiswa_modifier m1 = new mahasiswa_modifier("2455201001", "Nugroho Dandy", 3.71);

        // Menampilkan data mahasiswa
        System.out.println("Data awal mahasiswa:");
        m1.tampilkanData();

        // Menampilkan predikat mahasiswa
        System.out.println("Predikat: " + m1.predikat());

        // Mengubah nama mahasiswa
        m1.updateNama("Dandy Nugroho");

        // Menampilkan data setelah update nama
        System.out.println("Data setelah update nama:");
        m1.tampilkanData();

        // Mengecek kelulusan dengan nilai minimal 3.0
        Double nilaiMinimal = 3.0;
        boolean lulus = m1.cekKelulusan(nilaiMinimal);

        if (lulus) {
            System.out.println("Mahasiswa lulus dengan IPK minimal " + nilaiMinimal);
        } else {
            System.out.println("Mahasiswa tidak lulus dengan IPK minimal " + nilaiMinimal);
        }
    }
}



