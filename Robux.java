/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc1
 */ public class Robux {
    public int jumlah;
    public double hargaPerRobux;

    public Robux(int jumlah, double hargaPerRobux) {
        this.jumlah = jumlah;
        this.hargaPerRobux = hargaPerRobux;
    }

    public void tampilkanInfo() {
        System.out.println("Jumlah Robux: " + jumlah);
        System.out.println("Harga per Robux: Rp " + hargaPerRobux);
        System.out.println("Total Harga: Rp " + (jumlah * hargaPerRobux));
    }
}

class Main {
    public static void main(String[] args) {
        Robux r1 = new Robux(100, 150);
        Robux r2 = new Robux(500, 130);

        System.out.println("Data Pembelian Robux 1:");
        r1.tampilkanInfo();

        System.out.println("\nData Pembelian Robux 2:");
        r2.tampilkanInfo();
    }
}


