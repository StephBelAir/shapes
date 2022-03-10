package com.back.controller;

import com.back.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.back.dao.ShapeDao;

import java.util.List;

@RestController
public class ShapeController {

    private final ShapeDao shapeDao;

    public ShapeController(ShapeDao shapeDao){
        this.shapeDao = shapeDao;
    }

    @GetMapping(value = "/Form")
    public List<Form> listeShapes(){
       return shapeDao.findAll();
    }

    //Get by ID
    @GetMapping(value ="/Form/{id}")
    public Form afficheForm(@PathVariable int id) {
       return shapeDao.findById(id);
    }
}
