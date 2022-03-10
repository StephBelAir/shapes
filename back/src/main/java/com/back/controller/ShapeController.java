package com.back.controller;

import com.back.model.Circle;
import com.back.model.Form;
import com.back.model.Rectangle;
import com.back.model.Triangle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {

    @GetMapping(value = "/Form")
    public String listeShapes(){
       return "Liste de Formes";
    }

    //Get by ID
   @GetMapping(value ="/Form/{id}")
    public Form afficheForm(@PathVariable int id) {

        Form form = new Circle(id,5);
        
       return form;
    }
}
