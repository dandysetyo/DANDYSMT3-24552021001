/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semester_3;

/**
 *
 * @author setyo
 */
import java.util.Scanner;

import java.util.Scanner;

public class Pertemuan_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Penilaian Mahasiswa ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Clear buffer

        String[] nama = new String[jumlah];
        String[] nim = new String[jumlah];     // Tambahan: array untuk NIM
        int[] nilai = new int[jumlah];

        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            nama[i] = input.nextLine();

            System.out.print("NIM: ");          // Input NIM
            nim[i] = input.nextLine();

            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();
            input.nextLine(); // Clear buffer
        }

        // Output hasil penilaian
        System.out.println("\n=== Hasil Penilaian Mahasiswa ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama: " + nama[i]);
            System.out.print(" | NIM: " + nim[i]);         // Tampilkan NIM
            System.out.print(" | Nilai: " + nilai[i]);

            // Menentukan grade dan status kelulusan
            if (nilai[i] >= 80) {
                System.out.println(" (Grade A) - Lulus");
            } else if (nilai[i] >= 70) {
                System.out.println(" (Grade B) - Lulus");
            } else if (nilai[i] >= 60) {
                System.out.println(" (Grade C) - Lulus");
            } else if (nilai[i] >= 50) {
                System.out.println(" (Grade D) - Tidak Lulus");
            } else {
                System.out.println(" (Grade E) - Tidak Lulus");
            }
        }

        input.close();
    }
}