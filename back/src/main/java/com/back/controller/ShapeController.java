package com.back.controller;

import com.back.model.*;
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


   @PostMapping(value = "/Forms")
    public ResponseEntity<Form> ajouterForme(@RequestBody FormDTO infoEnvoyeParLeUserQuiEstUnFormDTO){
        Form formAdded = infoEnvoyeParLeUserQuiEstUnFormDTO.createShape();
       shapeDao.save(formAdded);
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


    @DeleteMapping("/Forms/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) throws Exception {
        Form form= shapeDao.findById(id);
        shapeDao.deleteById(id);
        return ResponseEntity.noContent().build();
    }

  /*   @GetMapping(value = "/")
    public ResponseEntity<ShapeList> totalShapes() throws Exception{
        Iterable<Form> forms = shapeDao.findAll();
            ShapeList shapeList = new ShapeList();
            for (Form form : forms){
                shapeList.addShapes(form);
            }
            return new ResponseEntity<ShapeList>(shapeList, HttpStatus.OK);
    } */

}

