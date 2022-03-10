package com.back.model;


/*--==================== Attributs Classe Rectangle  ====================--*/

public class Rectangle extends Form {

    private double width = 0;
    private double height = 0;

    /*--==================== Constructor Rectangle ====================--*/

    public Rectangle(int id, double width, double height){
        super();
        this.id = id;
//        this.surface = setSurface();
//        this.perimetre = setPerimetre();
        this.width = width;
        this.height = height;
    }

    /*--==================== Overriding the toString() method  ====================--*/
    @Override
    public String toString(){
        return  "Form{"+
                ", id=" + id+
                ", type=" + "Rectangle"+
                ", longueur="+this.width+
                ", largeur="+this.height+
                ", perimètre="+this.perimetre+
                ", surface="+this.surface+
                '}';
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
//    @Override
    public double getPerimetre(){
        return 2*(this.width+this.height);
    }

    /*--==================== Surface getter ====================--*/
//    @Override
    public double getSurface(){
        return this.width*this.height;
    }
}
