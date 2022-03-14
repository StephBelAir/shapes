package com.back.model;
import java.util.ArrayList;

public class Shape3DList {
    /*--==================== Attributs  ====================--*/


    private ArrayList<Shape3D> totalShapes3D;


    /*--==================== Méthodes  ====================--*/

    public double totalShapes3D(){
        double allVolumes = 0;
        for (Shape3D shape3d: this.totalShapes3D){
            allVolumes += shape3d.volume();
        }
        return allVolumes;
    }


    /*--==================== Getter & Setter  ====================--*/


    public Shape3DList() {
        this.totalShapes3D = new ArrayList<>();
    }

    public void addShapes3D (Shape3D shape3d ) {
        this.totalShapes3D.add(shape3d);
    }

    public ArrayList<Shape3D> getShapes3D(){
        return totalShapes3D;
    }
}
