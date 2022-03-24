package com.back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

    @ManyToOne (targetEntity = ShapeList.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
 )

    @JoinColumn( name = "shapes_list_id")
    @JsonBackReference
    protected ShapeList shapeList;





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

    public ShapeList getShapeList() {
        return shapeList;
    }

    public void setShapeList(ShapeList shapeList) {
        this.shapeList = shapeList;
    }

}