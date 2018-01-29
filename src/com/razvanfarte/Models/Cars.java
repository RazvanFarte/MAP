package com.razvanfarte.Models;

import java.awt.*;

public class Cars {

    private String name;
    private Color color;

    private void initialiseFields(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Cars() {
        this.initialiseFields("Uninitialized", new Color(0,0,0));
    }

    public Cars(String name, Color color) {
        this.initialiseFields(name, color);
    }

    public String getName(){
        return this.name;
    }

    public Color getPrice() {
        return this.color;
    }
}
