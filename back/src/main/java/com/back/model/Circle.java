package com.back.model;

/*--==================== Attributs Classe Circle  ====================--*/

public class Circle extends Form {

    private double radius = 0;


    /*--==================== Constructor Circle ====================--*/

    public Circle(double radius){
        this.radius = radius;
    }

    /*--==================== Overriding the toString() method  ====================--*/

    public String toString(){
        return
                "--===================== Cercle ======================--"+Utilities.newLine+
                        "Le rayon est de : "+this.radius+Utilities.newLine+
                        "Le perimètre du cercle est de : "+this.perimetre()+Utilities.newLine+
                        "La surface du cercle est de : "+this.surface()+ " ²";
    }

    /*--==================== Circle getter setter  ====================--*/

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double myradius){
        this.radius = myradius;
    }

    /*--==================== Perimetre getter ====================--*/

    public double perimetre(){
        return 2*Math.PI*this.radius;
    }

    /*--==================== Surface getter ====================--*/

    public double surface(){
        return Math.PI*(this.radius*this.radius);
    }
}
