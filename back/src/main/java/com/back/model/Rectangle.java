package com.back.model;


/*--==================== Attributs Classe Rectangle  ====================--*/

public class Rectangle extends Form {

    private double width = 0;
    private double height = 0;
    private String type = "Rectangle";


    /*--==================== Constructor Rectangle ====================--*/

    public Rectangle(int id, String type, double width, double height){
        super();
        this.id = id;
        this.type = type;
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

    public String getType() { return this.type; }


    public void setWidth(double mywidth){
        this.width = mywidth;
    }

    public void setHeight(double myheight){
        this.height = myheight;
    }

    public void setType(String mytype){ this.type = mytype; }


    /*--==================== Perimetre getter ====================--*/

    public double getPerimetre(){
        return 2*(this.width+this.height);
    }

    /*--==================== Surface getter ====================--*/

    public double getSurface(){
        return this.width*this.height;
    }
}
