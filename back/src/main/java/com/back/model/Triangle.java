package com.back.model;

// Triangles Equilatéraux Uniquement
/*--==================== Attributs Classe Triangle  ====================--*/

public class Triangle extends Form {

    private double base = 0;
    private String type = "Triangle";


    /*--==================== Constructor Triangle ====================--*/

    public Triangle(int id, String type ,double base){
        super();
        this.id= id;
        this.type = type;
        this.base = base;
    }



    /*--==================== Triangle getter setter  ====================--*/

    public double getBase(){
        return this.base;
    }

    public void setBase(double mybase){
        this.base = mybase;
    }


    public String getType() { return this.type; }

    public void setType(String mytype){ this.type = mytype; }


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
