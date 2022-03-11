package com.back.dao;

import com.back.model.Form;
import com.back.model.Rectangle;
import com.back.model.Circle;
import com.back.model.Triangle;

import java.util.List;


public class CreateShape {
    private List<Form>forms;
    public CreateShape (List<Form> forms){
        this.forms = forms;
    }

    public int id;
    public String type;
    public double width;
    public double height;
    public double radius;
    public double base;


    public CreateShape (String form) {
          switch (type) {
            case "Rectangle":
                Form rectangle = new Rectangle(this.id, this.type, this.width, this.height);
                forms.add(rectangle);
                break;
            case "Circle":
                Form circle = new Circle(this.id, this.type, this.radius);
                forms.add(circle);
                break;
            case "Triangle":
                Form triangle = new Triangle(this.id, this.type, this.base);
                forms.add(triangle);
                break;
        }
    }
}