package com.back.model;

// Triangles Equilatéraux Uniquement
/*--==================== Attributs Classe Triangle  ====================--*/

public class Triangle extends Form {

    private double base = 0;


    /*--==================== Constructor Triangle ====================--*/

    public Triangle() {
        this.type = "triangle";
    }

    public Triangle(int id, double base){
        super();
        this.id= id;
        this.type = "triangle";
        this.base = base;
    }



    /*--==================== Triangle getter setter  ====================--*/

    public double getBase(){
        return this.base;
    }

    public void setBase(double mybase){
        this.base = mybase;
    }


    /*--==================== Perimetre getter ====================--*/

    public double getPerimetre(){
        return 3*this.base;
    }

    /*--==================== Surface getter with Heron ====================--*/

    public double getSurface(){
        double halfPerim = this.getPerimetre()/2;
        return Math.sqrt(halfPerim*(halfPerim-this.base)*(halfPerim-this.base)*(halfPerim-this.base));
    }
}
