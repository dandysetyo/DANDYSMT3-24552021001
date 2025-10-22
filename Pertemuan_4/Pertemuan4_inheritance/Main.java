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
public class Main {
    public static void main(String[] args) {

        // Membuat objek dari tiap subclass
        Zombie zombie = new Zombie("zombie A", 100, 15);
        Pocong pocong = new Pocong("pocong B", 120, 20);
        Burung burung = new Burung("burung C", 80, 10);

        // Memanggil method dari masing-masing objek
        zombie.attack();
        zombie.walk();

        System.out.println("----------------------");

        pocong.attack();
        pocong.jump();

        System.out.println("----------------------");

        burung.attack();
        burung.fly();
        burung.walk();
        burung.jump();
    }
}
