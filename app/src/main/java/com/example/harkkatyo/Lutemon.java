package com.example.harkkatyo;

import java.io.Serializable;

public class Lutemon implements Serializable {
    protected String name;
    protected String lutemonColor;


    public Lutemon(String name, String lutemonColor) {
        this.name = name;
        this.lutemonColor = lutemonColor;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return lutemonColor;
    }

}
