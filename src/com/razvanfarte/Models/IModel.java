package com.razvanfarte.Models;

public class IModel {

    private String name;
    private float price;

    public IModel(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }
}
