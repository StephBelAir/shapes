package com.back.controller;


import com.back.dao.ShapeDao;
import com.back.dao.ShapesListDAO;
import com.back.model.Form;
import com.back.model.ShapeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Forms/List")
@CrossOrigin(origins = "*")
public class ShapesListController {
    @Autowired
    private ShapesListDAO shapesListDAO;

    @Autowired
    private ShapeDao shapeDao;
    private List<Form>shape_list = new ArrayList<>();
    private ShapeList shapeList = new ShapeList(shape_list);

    public ShapesListController(ShapeDao shapeDao, ShapesListDAO shapesListDAO){
        super();
        this.shapesListDAO = shapesListDAO;
        this.shapeDao = shapeDao;
    }
/**
    @ResponseBody
    @GetMapping(value = "/Forms/List")
    public List<Form> shape_list() {
        return shape_list.findAll();
    } */



}