package com.example.recycelerview_pojo_sample;

public class Model {
    private String id;
    private String title;
    private String shortdesc;
    private int image;
    private double rating;

    private double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getShortdesc() {
        return shortdesc;
    }
    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public Model(String id, String title, String shortdesc, int image, double rating, double price) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.image = image;
        this.rating = rating;
        this.price = price;
    }
    // creat for Getter and Setter methods
    // for each parameter
}
