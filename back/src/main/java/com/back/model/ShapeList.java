package com.back.model;
import java.util.ArrayList;

public class ShapeList {

    private ArrayList<Form> totalShapes = new ArrayList<>();

    public void addShapes (Form form) {
        this.totalShapes.add(form);
    }
    public ArrayList<Form> getNewShapes() {
        return totalShapes;
    }





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
