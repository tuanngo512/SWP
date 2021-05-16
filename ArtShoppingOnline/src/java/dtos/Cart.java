/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Cart {
   private ArrayList<Picture> ListArt;
   private String Url;
   private int Total;

    public Cart() {
    }

    public Cart(ArrayList<Picture> ListArt, String Url, int Total) {
        this.ListArt = ListArt;
        this.Url = Url;
        this.Total = Total;
    }

    public ArrayList<Picture> getListArt() {
        return ListArt;
    }

    public void setListArt(ArrayList<Picture> ListArt) {
        this.ListArt = ListArt;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
   
}
