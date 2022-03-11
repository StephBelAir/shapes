package com.back.controller;

import com.back.dao.CreateShape;
import com.back.model.*;
import org.springframework.web.bind.annotation.*;
import com.back.dao.ShapeDao;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@RestController
public class ShapeController {

    private final ShapeDao shapeDao;

    public ShapeController(ShapeDao shapeDao){
        this.shapeDao = shapeDao;
    }

    @GetMapping(value = "/Forms")
    public List<Form> listeShapes(){
       return shapeDao.findAll();
    }

    //Get by ID
    @GetMapping(value ="/Forms/{id}")
    public Form afficheForm(@PathVariable int id) {
       return shapeDao.findById(id);
    }

 /*   @PostMapping(value = "/Forms")
    public void ajouterForm(@RequestBody Form form) {
        shapeDao.save(form);
    } */

   @PostMapping(value = "/Forms")
    public ResponseEntity<Form> ajouterForme(@RequestBody Form form){
        Form formAdded = shapeDao.save(form);
        if (Objects.isNull(formAdded)){
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(formAdded.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}
