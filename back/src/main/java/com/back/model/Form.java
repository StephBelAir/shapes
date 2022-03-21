package com.back.model;

import javax.persistence.*;

@Entity
@Table(name = "Form")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Form{
    @Id @GeneratedValue
    @Column(name = "id")
    protected int id;
    @Column(name = "type")
    protected String type;

    @ManyToOne (
            cascade = CascadeType.ALL,
            targetEntity = ShapeList.class,
            fetch = FetchType.LAZY
 )
    @JoinColumn( name = "shapes_list_id")


/**    @JoinTable(name = "form_id_shapes_list_id",
            joinColumns = @JoinColumn( name = "id"),
            inverseJoinColumns = @JoinColumn ( name = "shapes_list_id")
    )*/

    private ShapeList shapeList;

    public ShapeList getShapeList() {
        return shapeList;
    }

    public void setShapeList(ShapeList shapeList) {
        this.shapeList = shapeList;
    }


    /*--====================  Constructor   ====================--*/

    public Form(){}


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