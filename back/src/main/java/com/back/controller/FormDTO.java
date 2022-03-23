package com.back.controller;

import com.back.model.*;

public class FormDTO {

    public String type;
    public double length;
    public double height;

    public Form createShape () {
        Form f = null;
        switch (type) {
            case "rectangle":
                f = new Rectangle(this.length, this.height);
                break;
            case "circle":
                f = new Circle(this.length);
                break;
            case "triangle":
                f = new Triangle(this.length);
                break;
        }
        return f;
    }

    /*--====================  Shapeliste  ====================--*/


    public static ShapeList fromListDTOtoList(){
           ShapeList shapeList = new ShapeList();
           return shapeList;

    }

}
