package com.back.model;
import java.util.ArrayList;

/** @ManyToMany(targetEntity = Shape.class, fetch = FetchType.EAGER)
private List<Shape>shape_list; ?? */

public class ShapeList {

    /*--==================== Attributs  ====================--*/


    private ArrayList<Form> totalShapes = new ArrayList<>();



    /*--==================== Getter & Setter  ====================--*/

    public void addShapes (Form form) {
        this.totalShapes.add(form);
    }
    public ArrayList<Form> getNewShapes() {
        return totalShapes;
    }

    /*--==================== Constructor ====================--*/

   // public ShapeList(){ this.totalShapes = "Total"; }




    /*--==================== Méthodes  ====================--*/

    public double TotalSurface() {
        double TotalSurface = 0;
        for (Form form: totalShapes) {
            TotalSurface += form.getSurface();
        }
        return TotalSurface;
    }
    public double TotalPerimetre() {
        double TotalPerimetre = 0;
        for (Form form: totalShapes) {
            TotalPerimetre += form.getPerimetre();
        }
        return TotalPerimetre;
    }
}
