package com.back.model;

/*--==================== Attributs Classe Circle  ====================--*/

public class Circle extends Form {

    private double radius = 0;


    /*--==================== Constructor Circle ====================--*/

    public Circle(){
        this.type = "circle";
    }

    public Circle(int id, double radius){
        super(id);
        this.type = "circle";
        this.radius = radius;
    }

    /*--==================== Circle getter setter  ====================--*/

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double myradius){
        this.radius = myradius;
    }


    /*--==================== Perimetre getter ====================--*/

    public double getPerimetre(){
        return 2*Math.PI*this.radius;
    }

    /*--==================== Surface getter ====================--*/

    public double getSurface(){
        return Math.PI*(this.radius*this.radius);
    }
}
