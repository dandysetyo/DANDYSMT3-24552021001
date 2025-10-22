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
public class Pocong extends Enemy {

    // Konstruktor
    public Pocong(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    // Method khusus Pocong
    public void jump() {
        System.out.println(name + " melompat-lompat seperti pocong...");
    }
}
