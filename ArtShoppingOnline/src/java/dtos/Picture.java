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
public class Picture {
    private String Name,IdArt,Author,Img,Discription,Size,Year;
    private Boolean Status;
    private int like;
    private double Price;
    public Picture() {
    }

    public Picture(String Name, String IdArt, String Author, String Img, String Discription, String Size, String Year, Boolean Status, double Price, int like) {
        this.Name = Name;
        this.IdArt = IdArt;
        this.Author = Author;
        this.Img = Img;
        this.Discription = Discription;
        this.Size = Size;
        this.Year = Year;
        this.Status = Status;
        this.Price = Price;
        this.like = like;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getIdArt() {
        return IdArt;
    }

    public void setIdArt(String IdArt) {
        this.IdArt = IdArt;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
    
}
