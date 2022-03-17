package com.back.controller;

import com.back.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.back.dao.ShapeDao;

import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
public class ShapeController {

    @Autowired
    private final ShapeDao shapeDao;

    public ShapeController(ShapeDao shapeDao) {
        this.shapeDao = shapeDao;
    }

    /*--====================  Add forms   ====================--*/


    @GetMapping(value = "/Forms/addForTests")
    public List<Form> addForms() {
        shapeDao.save(new Triangle(5));
        shapeDao.save(new Circle(10));
        shapeDao.save(new Rectangle(4, 10));

        return shapeDao.findAll();
    }

    /*--====================  Get   ====================--*/


    @GetMapping(value = "/Forms")
    public List<Form> listeShapes() {
        return shapeDao.findAll();
    }

    //Get by ID
    @GetMapping(value = "/Forms/{id}")
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

          @DeleteMapping("/Forms/{id}")
         @ResponseBody
         public ResponseEntity<Void> deleteShape(@PathVariable int id) throws Exception{
             shapeDao.deleteById(id);
             return ResponseEntity.noContent().build();
         }

}


