package com.back.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Form{
    @Id @GeneratedValue
    protected int id;
    protected String type;


    /*--====================  Constructor   ====================--*/

    public Form(){}
    public Form ( int id){
        this.id = id;
    }

    /*--====================  setter & getter   ====================--*/

    public void setId(int id) {
        this.id = id;
    }
    public void setType(String type) {this.type = type;}

    public int getId(){
        return id;
    }

    public String getType(){
        return type;
    }

    public abstract double getPerimetre();

    public abstract double getSurface();
}