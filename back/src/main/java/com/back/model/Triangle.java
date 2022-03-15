package com.back.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

// Triangles Equilatéraux Uniquement
/*--==================== Attributs Classe Triangle  ====================--*/
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
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
