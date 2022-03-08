package com.back.model;

public abstract class Form{

    public abstract double perimetre();
    public abstract double surface();
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}