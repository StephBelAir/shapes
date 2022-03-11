package com.back.model;

public abstract class Form{
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