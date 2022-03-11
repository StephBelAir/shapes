package com.back.model;

public class Shape3D {

    /*--==================== Attributs  ====================--*/

    private Form form;
    private double depth;
    private String type; // form.type ??

    /*--==================== Méthodes  ====================--*/

    public double volume() {
        return form.getSurface() * this.depth;
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

    public String getType() {
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }


    /*--==================== Constructor  ====================--*/

    public Shape3D(Form form, double depth, String type) {
        this.form = form;
        this.depth = depth;
        this.type = type;
    }
}
