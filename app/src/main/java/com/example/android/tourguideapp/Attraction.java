package com.example.android.tourguideapp;

import java.io.Serializable;

//Attraction objects have name, location, opening and closing time,contact, about, and an image
public class Attraction implements Serializable {
    private int image;
    private String name;
    private String location;
    private String opening;
    private String closing;
    private String contact;
    private String about;

    public Attraction(int image, String name, String location, String opening, String closing, String contact, String about) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.opening = opening;
        this.closing = closing;
        this.contact = contact;
        this.about = about;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }


    public String getOpening() {
        return opening;
    }


    public String getClosing() {
        return closing;
    }


    public String getContact() {
        return contact;
    }


    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
