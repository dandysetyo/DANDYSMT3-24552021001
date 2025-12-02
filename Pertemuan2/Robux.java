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
public class Robux {
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
    
    public static void main(String[] args) {
        Robux r1 = new Robux(100, 150);
        Robux r2 = new Robux(500, 130);

        System.out.println("Data Pembelian Robux 1:");
        r1.tampilkanInfo();

        System.out.println("\nData Pembelian Robux 2:");
        r2.tampilkanInfo();
    }

    void berikanDiskon(double diskon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean lebihMurahDari(Robux r2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
