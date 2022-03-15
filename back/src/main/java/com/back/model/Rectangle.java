package com.back.model;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/*--==================== Attributs Classe Rectangle  ====================--*/
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Rectangle extends Form {

    private double width = 0;
    private double height = 0;


    /*--==================== Constructor Rectangle ====================--*/

    public Rectangle(){
        this.type = "rectangle";
    }

    public Rectangle(int id, double width, double height){
        super(id);
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
