package com.back.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Column;



// Triangles Equilatéraux Uniquement
/*--==================== Attributs Classe Triangle  ====================--*/
@Entity
@Table(name = "Triangle")
public class Triangle extends Form {

    @Column(name = "base")
    private double base = 0;


    /*--==================== Constructor Triangle ====================--*/

    public Triangle() {
        this.type = "triangle";
    }

    public Triangle(double base){
        super();
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
