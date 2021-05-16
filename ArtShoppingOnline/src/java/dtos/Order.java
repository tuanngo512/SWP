/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

/**
 *
 * @author ACER
 */
public class Order {
   private Account Acc;
   private String Address;
   private Cart AccCart;

    public Order() {
    }

    public Order(Account Acc, String Address, Cart AccCart) {
        this.Acc = Acc;
        this.Address = Address;
        this.AccCart = AccCart;
    }

    public Account getAcc() {
        return Acc;
    }

    public void setAcc(Account Acc) {
        this.Acc = Acc;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Cart getAccCart() {
        return AccCart;
    }

    public void setAccCart(Cart AccCart) {
        this.AccCart = AccCart;
    }
   
}
