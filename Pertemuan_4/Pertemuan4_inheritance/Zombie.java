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
public class Zombie extends Enemy {

    // Konstruktor
    public Zombie(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    // Method khusus Zombie
    public void walk() {
        System.out.println(name + " berjalan perlahan seperti zombie...");
    }
}

