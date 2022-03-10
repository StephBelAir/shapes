package com.back.model;

/*--==================== Attributs Classe Circle  ====================--*/

public class Circle extends Form {

    private double radius = 0;


    /*--==================== Constructor Circle ====================--*/

    public Circle(int id, double radius){
        super();
        this.id= id;
        this.radius = radius;
    }

    /*--==================== Overriding the toString() method  ====================--*/

    public String toString(){
        return
                "Form{"+
                        ", id=" + id+
                        ", type=" + "Circle"+
                        ", longueur="+this.radius+
                        ", perimètre="+this.perimetre+
                        ", surface="+this.surface+
                        '}';

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
