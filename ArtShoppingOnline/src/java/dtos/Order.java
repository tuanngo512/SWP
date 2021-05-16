/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.sql.Date;

/**
 *
 * @author ACER
 */
public class Order {
   private Account Acc;
   private String Address;
   private Cart AccCart;
   private Date order_time;
   private Date shipping_time;

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

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public Date getShipping_time() {
        return shipping_time;
    }

    public void setShipping_time(Date shipping_time) {
        this.shipping_time = shipping_time;
    }
    
    
   
}
