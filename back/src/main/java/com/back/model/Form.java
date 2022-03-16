package com.back.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Form")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Form{
    @Id @GeneratedValue
    @Column(name = "id")
    protected int id;
    @Column(name = "type")
    protected String type;


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