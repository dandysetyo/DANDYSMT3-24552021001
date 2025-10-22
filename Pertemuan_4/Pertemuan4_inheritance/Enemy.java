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
public class Enemy {
    // Atribut
    public String name;
    public int hp;
    public int attackPoint;

    // Konstruktor
    public Enemy(String name, int hp, int attackPoint) {
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
    }

    // Method attack
    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPoint);
    }
}
