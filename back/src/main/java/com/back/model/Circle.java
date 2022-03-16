package com.back.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Column;



/*--==================== Attributs Classe Circle  ====================--*/
@Entity
@Table(name = "Circle")
public class Circle extends Form {

    @Column(name = "radius")
    private double radius = 0;


    /*--==================== Constructor Circle ====================--*/

    public Circle(){
        this.type = "circle";
    }

    public Circle(double radius){
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
