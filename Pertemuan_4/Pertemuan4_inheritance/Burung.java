/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4_inheritance;

/**
 *
 * @author setyo
 */
public class Burung extends Enemy {

    // Konstruktor
    public Burung(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    // Method khusus Burung
    public void fly() {
        System.out.println(name + " terbang tinggi di langit...");
    }

    public void walk() {
        System.out.println(name + " berjalan di tanah...");
    }

    public void jump() {
        System.out.println(name + " melompat kecil di dahan...");
    }
}
