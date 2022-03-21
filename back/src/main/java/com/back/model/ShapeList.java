package com.back.model;
import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;



@Entity
@Table(name = "shapes_list", uniqueConstraints = { @UniqueConstraint(columnNames = { "shapes_list_id" }) })
public class ShapeList{

    /*--==================== Attributs  ====================--*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "shapes_list_id")
    private int shapes_list_id;

    @OneToMany ( cascade = CascadeType.ALL,
            orphanRemoval = true
    )


    private List<Form> totalShapes = new ArrayList<>();



    /*--==================== Getter & Setter  ====================--*/


    public void addShapes (Form form) {
        this.totalShapes.add(form);
    }
    public List<Form> getNewShapes() {
        return totalShapes;
    }

    /*--==================== Constructor ====================--*/

    public ShapeList(List<Form> shape_list){ this.totalShapes = new ArrayList<>(); }


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
