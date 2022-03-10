package com.back.model;

public abstract class Form{
    protected int id;
    protected double perimetre;
    protected double surface;

    /*--====================  Constructor   ====================--*/


    public Form(){}
    public Form ( int id, double perimetre, double surface){
        this.id = id;
        this.perimetre = perimetre;
        this.surface = surface;
    }

    /*--====================  setter & getter   ====================--*/

    public void setId(int id) {
        this.id = id;
    }
    public void setPerimetre(double perimetre) { this.perimetre = perimetre; }
    public void setSurface(double surface) { this.surface = surface; }

    public int getId(){
        return id;
    }

    public double getPerimetre(){
        return perimetre;
    }

    public double getSurface(){
        return surface;
    }
}