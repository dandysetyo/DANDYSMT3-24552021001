/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author setyo
 */
import java.util.Scanner; // <-- Baris ini WAJIB ADA!

public class Pembelian_Robux {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=== Pembelian Robux ===");
            
            System.out.print("Masukkan jumlah Robux pembelian 1: ");
            int jumlah1 = input.nextInt();
            
            System.out.print("Masukkan harga per Robux pembelian 1: ");
            double harga1 = input.nextDouble();
            
            Robux r1 = new Robux(jumlah1, harga1);
            
            System.out.print("\nMasukkan jumlah Robux pembelian 2: ");
            int jumlah2 = input.nextInt();
            
            System.out.print("Masukkan harga per Robux pembelian 2: ");
            double harga2 = input.nextDouble();
            
            Robux r2 = new Robux(jumlah2, harga2);
            
            System.out.println("\n--- Data Pembelian Robux 1 ---");
            r1.tampilkanInfo();
            
            System.out.println("\n--- Data Pembelian Robux 2 ---");
            r2.tampilkanInfo();
            
            System.out.print("\nMasukkan persen diskon untuk pembelian 1: ");
            double diskon = input.nextDouble();
            
            r1.berikanDiskon(diskon);
            
            System.out.println("\n--- Data Pembelian Robux 1 setelah diskon ---");
            r1.tampilkanInfo();
            
            System.out.println("\nApakah pembelian 1 lebih murah dari pembelian 2?");
            System.out.println(r1.lebihMurahDari(r2) ? "Ya, lebih murah." : "Tidak, lebih mahal atau sama.");
        }
    }
}

