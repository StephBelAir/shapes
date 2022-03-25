package com.back.model;


import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;



@Entity
public class ShapeList{

    /*--==================== Attributs  ====================--*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    @OneToMany(cascade = {CascadeType.REMOVE})
    private List<Form> shapes = new ArrayList<>();

    /*--==================== Getter & Setter  ====================--*/


    public void addShape(Form form) {
        this.shapes.add(form);
    }




    /*--==================== Constructor ====================--*/


    public ShapeList () {}


    /*--==================== Méthodes  ====================--*/

    public double getTotalSurface() {
        double TotalSurface = 0;
        for (Form form: shapes) {
            TotalSurface += form.getSurface();
        }
        return TotalSurface;
    }

    public double getTotalPerimetre() {
        double TotalPerimetre = 0;
        for (Form form: shapes) {
            TotalPerimetre += form.getPerimetre();
        }
        return TotalPerimetre;
    }
    public void deleteShapeFromList(Form form){
        shapes.remove(form);
    }

    public void addShapeIntoList(Form form){ shapes.add(form);}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Form> getShapes() {
        return shapes;
    }

    public void setShapes(List<Form> shape_list) {
        this.shapes = shape_list;
    }
}
