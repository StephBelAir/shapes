package com.back.model;
import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;



@Entity
@Table(name = "shapes_list") // , uniqueConstraints = { @UniqueConstraint(columnNames = { "shapes_list" }) }
public class ShapeList{

    /*--==================== Attributs  ====================--*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "shapes_list_id")
    protected int shapes_list_id;

    @OneToMany ( cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    private List<Form> shape_list = new ArrayList<>();







    /*--==================== Getter & Setter  ====================--*/


    public void addShapesList (Form form) {
        this.shape_list.add(form);
    }
    public List<Form> getNewShapes() {
        return shape_list;
    }

    /*--==================== Constructor ====================--*/

    public ShapeList(){}

    public ShapeList(List<Form> shape_list) {
    }


    /*--==================== Méthodes  ====================--*/

    public double getTotalSurface() {
        double TotalSurface = 0;
        for (Form form: shape_list) {
            TotalSurface += form.getSurface();
        }
        return TotalSurface;
    }

    public double getTotalPerimetre() {
        double TotalPerimetre = 0;
        for (Form form: shape_list) {
            TotalPerimetre += form.getPerimetre();
        }
        return TotalPerimetre;
    }
}
