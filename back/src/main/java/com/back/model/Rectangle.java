package com.back.model;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Column;



/*--==================== Attributs Classe Rectangle  ====================--*/
@Entity
@Table(name = "Rectangle")
public class Rectangle extends Form {

    @Column(name = "width")
    private double width = 0;
    @Column(name = "height")
    private double height = 0;


    /*--==================== Constructor Rectangle ====================--*/

    public Rectangle(){
        this.type = "rectangle";
    }

    public Rectangle(double width, double height){
        this.type = "rectangle";
        this.width = width;
        this.height = height;
    }


    /*--==================== Rectangle getter setter  ====================--*/

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }


    public void setWidth(double mywidth){
        this.width = mywidth;
    }

    public void setHeight(double myheight){
        this.height = myheight;
    }


    /*--==================== Perimetre getter ====================--*/

    public double getPerimetre(){
        return 2*(this.width+this.height);
    }

    /*--==================== Surface getter ====================--*/

    public double getSurface(){
        return this.width*this.height;
    }
}
