package com.back.controller;

import com.back.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.back.dao.ShapeDao;

import org.springframework.http.ResponseEntity;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@RestController
public class ShapeController {

    @Autowired
    private final ShapeDao shapeDao;

    public ShapeController(ShapeDao shapeDao){
        this.shapeDao = shapeDao;
    }

    /*--====================  Add forms   ====================--*/


    @GetMapping(value = "/Forms/addForTests")
    public List<Form> addForms(){
        shapeDao.save(new Triangle(5));
        shapeDao.save(new Circle(10));
        shapeDao.save(new Rectangle(4, 10));

        return shapeDao.findAll();
    }

    /*--====================  Get   ====================--*/


    @GetMapping(value = "/Forms")
    public List<Form> listeShapes(){
       return shapeDao.findAll();
    }

    //Get by ID
    @GetMapping(value ="/Forms/{id}")
    public Form afficheForm(@PathVariable int id) {
       return shapeDao.findById(id);
    }


    /*--====================  Post   ====================--*/

    @PostMapping("/Forms/add")
    public Form addShape(@RequestBody FormDTO infoEnvoyeParLeUserQuiEstUnFormDTO) {
        Form form = infoEnvoyeParLeUserQuiEstUnFormDTO.createShape();
        return this.shapeDao.save(form);
    }
    

    /*--====================  Delete  ====================--*/


  /*  @DeleteMapping("/Forms/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) throws Exception {
        Form form= shapeDao.findById(id);
        shapeDao.deleteById(id);
        return ResponseEntity.noContent().build(); */
    }

    /*--====================  Update  ====================--*/


  /*   @GetMapping(value = "/")
    public ResponseEntity<ShapeList> totalShapes() throws Exception{
        Iterable<Form> forms = shapeDao.findAll();
            ShapeList shapeList = new ShapeList();
            for (Form form : forms){
                shapeList.addShapes(form);
            }
            return new ResponseEntity<ShapeList>(shapeList, HttpStatus.OK);
    } */



