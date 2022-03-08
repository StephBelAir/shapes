package com.back.model;

// Triangles Equilatéraux Uniquement
/*--==================== Attributs Classe Triangle  ====================--*/

public class Triangle extends Form {

    private double base = 0;

    /*--==================== Constructor Triangle ====================--*/

    public Triangle(double base){
        this.base = base;
    }

    /*--==================== Overriding the toString() method  ====================--*/

    public String toString(){
        return
                "--==================== Triangle =====================--"+Utilities.newLine+
                        "La longueur de la base est de : "+this.base+Utilities.newLine+
                        "Le perimètre du triangle est de : "+this.perimetre()+Utilities.newLine+
                        "La surface du triangle est de : "+this.surface()+ " ²";
    }

    /*--==================== Triangle getter setter  ====================--*/

    public double getBase(){
        return this.base;
    }

    public void setBase(double mybase){
        this.base = mybase;
    }

    /*--==================== Perimetre getter ====================--*/

    public double perimetre(){
        return 3*this.base;
    }

    /*--==================== Surface getter with Heron ====================--*/

    public double surface(){
        double halfPerim = this.perimetre()/2;
        return Math.sqrt(halfPerim*(halfPerim-this.base)*(halfPerim-this.base)*(halfPerim-this.base));

    }
}
