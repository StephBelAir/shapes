package com.back.controller;


import com.back.dao.ShapeDao;
import com.back.dao.ShapesListDAO;
import com.back.model.Form;
import com.back.model.ShapeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Forms/List")

public class ShapesListController {


    @Autowired
    private ShapesListDAO shapesListDAO;

    @Autowired
    private ShapeDao shapeDao;
    private List<Form>shape_list =new ArrayList<>();
    private ShapeList shapeList = new ShapeList(shape_list);

    public ShapesListController(ShapeDao shapeDao, ShapesListDAO shapesListDAO){
        super();
        this.shapesListDAO = shapesListDAO;
        this.shapeDao = shapeDao;
    }

    /*--==================== Get  ====================--*/
    //All

    @GetMapping
    @ResponseBody
    public List<ShapeList> getShapeList(){
        return shapesListDAO.findAll();
    }

    // 1 list by id
    @GetMapping("/{listId}")
    @ResponseBody
    public ShapeList getListById(@PathVariable int listId){
        return shapesListDAO.findById(listId);
    }


    /*--==================== Add  ====================--*/
    //1 List
    @PostMapping("addList")
    public ShapeList addShapesList(){
        ShapeList shape_list = FormDTO.fromListDTOtoList();
        return this.shapesListDAO.save(shape_list);
    }

    // All shapes to 1 list
    @PostMapping("/{listId}")
    @ResponseBody
    public void addAllShapesToList(@PathVariable int listId){
        shape_list = shapeDao.findAll();
        shapeList = getListById(listId);
        for (Form form: shape_list){
            shapeList.addShapeIntoList(form);
        }
        shapesListDAO.save(shapeList);
    }

    // 1 shape in 1 shapelist
    @PostMapping("/{listId}/{shapeId}")
    @ResponseBody
    public void addShapeToList(@PathVariable int listId, @PathVariable int shapeId){
        Form form = shapeDao.findById(shapeId);
        shapeList = getListById(listId);
        shapeList.addShapeIntoList(form);
        shapesListDAO.save(shapeList);
    }

    /*--==================== Delete  ====================--*/
    //1 List by Id
    @DeleteMapping("/{listId}")
    @ResponseBody
    public ResponseEntity<Void> deleteShape(@PathVariable int listId) throws Exception{
        shapesListDAO.deleteById(listId);
        return ResponseEntity.noContent().build();
    }

    //All Lists
    @DeleteMapping
    @ResponseBody
    public ResponseEntity<Void>deleteAllShape()throws Exception{
        shapesListDAO.deleteAll();
        return ResponseEntity.noContent().build();
    }

    //1 shape in 1 List
    @DeleteMapping("/{listId}/{shapeId}")
    @ResponseBody
    public void deleteOneShapeToSheet(@PathVariable int listId, @PathVariable int shapeId){
        Form form = shapeDao.findById(shapeId);
        shapeList = getListById(listId);
        shapeList.deleteShapeFromList(form);
        shapesListDAO.save(shapeList);
    }


}