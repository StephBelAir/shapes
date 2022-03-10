package com.back.model;

public class Shape3D {

    /*--==================== Attributs  ====================--*/

    private Form form;
    private double depth;
    private String name;

    /*--==================== Méthodes  ====================--*/

    public double volume() {
        return form.getSurface() * this.depth;
    }

    @Override
    public String toString(){
        return Utilities.newLine+
                "--===================== Shape 3D ====================--"+Utilities.newLine+
                "Le volume de "+this.getName()+" est de : "+this.volume()+ "³";

    }

    /*--==================== Getter & Setter  ====================--*/

    public Form getForms() {
        return this.form;
    }

    public void setForms(Form form) {
        this.form = form;
    }

    public double getDepth() {
        return this.depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    /*--==================== Constructor  ====================--*/

    public Shape3D(Form form, double depth, String name) {
        this.form = form;
        this.depth = depth;
        this.name = name;
    }
}
