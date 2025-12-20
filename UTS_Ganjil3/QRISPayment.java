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
public class QRISPayment implements Payment {

    @Override
    public void pay(Order order, User user) {
        System.out.println("Pembayaran QRIS");
        System.out.println("Nama  : " + user.getUsername());
        System.out.println("Total : Rp " + order.getPrice());
    }
    
}
