/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7_interface;

/**
 *
 * @author setyo
 */
public class Xiaomi implements Phone {
    private int volume;
    private boolean isOn;

    public Xiaomi() {      // <-- WAJIB ADA INI!
        this.volume = 50;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Xiaomi menyala...");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Xiaomi mati.");
    }

    @Override
    public void volumeUp() {
        if (!isOn) {
            System.out.println("HP Xiaomi masih mati!");
            return;
        }
        if (volume < MAX_VOLUME) volume++;
        System.out.println("Volume Xiaomi: " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) {
            System.out.println("HP Xiaomi masih mati!");
            return;
        }
        if (volume > MIN_VOLUME) volume--;
        System.out.println("Volume Xiaomi: " + volume);
    }
}