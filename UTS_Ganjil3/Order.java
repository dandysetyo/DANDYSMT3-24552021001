/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Ganjil3;

/**
 *
 * @author setyo
 */
public class Order {
    private String robux;
    private int price;

    public Order(String robux, int price) {
        this.robux = robux;
        this.price = price;
    }

    public String getRobux() {
        return robux;
    }

    public int getPrice() {
        return price;
    }
}
