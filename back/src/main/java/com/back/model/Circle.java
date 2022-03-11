package com.back.model;

/*--==================== Attributs Classe Circle  ====================--*/

public class Circle extends Form {

    private double radius = 0;
    private String type = "Circle";



    /*--==================== Constructor Circle ====================--*/

    public Circle(int id, String type ,double radius){
        super();
        this.id= id;
        this.type = this.type;
        this.radius = radius;
    }

    /*--==================== Circle getter setter  ====================--*/

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double myradius){
        this.radius = myradius;
    }


    public String getType() { return this.type; }

    public void setType(String mytype){ this.type = mytype; }


    /*--==================== Perimetre getter ====================--*/

    public double getPerimetre(){
        return 2*Math.PI*this.radius;
    }

    /*--==================== Surface getter ====================--*/

    public double getSurface(){
        return Math.PI*(this.radius*this.radius);
    }
}
