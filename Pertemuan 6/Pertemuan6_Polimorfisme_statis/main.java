/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6_Constructor;

/**
 *
 * @author setyo
 */
public class main {
    public static void main(String[] args) {
        
        daftarkan_sim sim1 = new daftarkan_sim("Amba Sybau", "SIM A", "A12345678", 2022);
        daftarkan_sim sim2 = new daftarkan_sim("Dandi Pratama", "SIM C", "C12", 2023);

        System.out.println("=== DATA SIM 01 ===");
        sim1.check_status();

        System.out.println("=== DATA SIM 02 ===");
        sim2.check_status();
    }
}

