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
            case "Rectangle":
                f = new Rectangle(1, this.length, this.height);
                break;
            case "Circle":
                f = new Circle(1, this.length);
                break;
            case "Triangle":
                f = new Triangle(1, this.length);
                break;
        }
        return f;
    }
}
