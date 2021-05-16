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
public class Account {
    private String Username,Password,Name,DOB,Email,Balance;
    private ArrayList<Picture> FavoritePics;
    public Account() {
    }

    public Account(String Username, String Password, String Name, String DOB, String Email, String Balance, ArrayList<Picture> FavoritePics) {
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.DOB = DOB;
        this.Email = Email;
        this.Balance = Balance;
        this.FavoritePics = FavoritePics;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    public ArrayList<Picture> getFavoritePics() {
        return FavoritePics;
    }

    public void setFavoritePics(ArrayList<Picture> FavoritePics) {
        this.FavoritePics = FavoritePics;
    }
    
}
