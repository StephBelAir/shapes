package com.back.controller;

import com.back.model.Circle;
import com.back.model.Form;
import com.back.model.Rectangle;
import com.back.model.Triangle;

public class FormDTO {

    public String type;
    public double length;
    public double height;

    public Form createShape () {
        Form f = null;
        switch (type) {
            case "rectangle":
                f = new Rectangle(4, this.length, this.height);
                break;
            case "circle":
                f = new Circle(5, this.length);
                break;
            case "triangle":
                f = new Triangle(6, this.length);
                break;
        }
        return f;
    }

}
