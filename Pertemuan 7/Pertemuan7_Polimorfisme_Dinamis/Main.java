/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7_Polimorfisme_Dinamis;

/**
 *
 * @author setyo
 */
public class Main {
    public static void main(String[] args) {

        Pengiriman kirim;

        kirim = new JNE();
        kirim.kirimPaket(2.5, "Jakarta");

        kirim = new JNT();
        kirim.kirimPaket(3.0, "Bandung");

        kirim = new GoSend();
        kirim.kirimPaket(1.2, "Depok");
    }
}