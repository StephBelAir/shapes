package com.back.model;

/*--==================== Attributs Classe Rectangle  ====================--*/

public class Rectangle extends Form {

    private double width = 0;
    private double height = 0;

    /*--==================== Constructor Rectangle ====================--*/

    public Rectangle(int id,double width, double height){
        this.setId(id);
        this.width = width;
        this.height = height;
    }

    /*--==================== Overriding the toString() method  ====================--*/
    @Override
    public String toString(){
        return Utilities.newLine+
                "--==================== Rectangle ====================--"+Utilities.newLine+
                "La longueur est de : "+this.width+Utilities.newLine+
                "La largeur est de : "+this.height+Utilities.newLine+
                "Le perimètre du rectangle est de : "+this.perimetre()+Utilities.newLine+
                "La surface du rectangle est de : "+this.surface()+ " ²";
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
    @Override
    public double perimetre(){
        return 2*(this.width+this.height);
    }

    /*--==================== Surface getter ====================--*/
    @Override
    public double surface(){
        return this.width*this.height;
    }
}
