/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5_Keyword_This;

/**
 *
 * @author setyo
 */public class main {

    public static void main(String[] args) {
        Motor motorSport = new Motor("Yamaha R15", "Biru", 160);
        Motor motorBebek = new Motor("Honda Supra", "Hitam", 90);

        System.out.println("=== DATA MOTOR 01 ===");
        motorSport.tampilkanInfo();

        System.out.println("=== DATA MOTOR 02 ===");
        motorBebek.tampilkanInfo();
    }
}    

