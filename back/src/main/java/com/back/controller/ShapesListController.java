package com.back.controller;

import com.back.controller.FormDTO;
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
    private List<Form> shapes = new ArrayList<>();


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
    @PostMapping("/addList")
    public ShapeList addShapesList(){
        ShapeList shape_list = FormDTO.fromListDTOtoList();
        return this.shapesListDAO.save(shape_list);
    }

    //1 Shape in 1 List

    @PostMapping("/{listId}/add")
    @ResponseBody
    public void addShapeToList(@RequestBody FormDTO infoEnvoyeParLeUserQuiEstUnFormDTO, @PathVariable int listId){
        Form form = infoEnvoyeParLeUserQuiEstUnFormDTO.createShape();

        ShapeList shapeList = shapesListDAO.findById(listId);
        if(shapeList ==null)
            return;
        form = shapeDao.save(form);
        shapeList.addShape(form);
        shapesListDAO.save(shapeList);
    }

    //1 ShapeList in 1 List ?? work ?? not with Postman

    @PostMapping("/{listId}/addList")
    @ResponseBody
    public void addShapeToList(@RequestBody List<FormDTO> infoEnvoyeParLeUserQuiEstUnFormDTO, @PathVariable int listId){
        ShapeList shapeList = shapesListDAO.findById(listId);
        if(shapeList ==null)
            return;
        for (FormDTO dto : infoEnvoyeParLeUserQuiEstUnFormDTO) {
            Form form = dto.createShape();
            form = shapeDao.save(form);
            shapeList.addShape(form);
        }

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
        ShapeList shapeList = getListById(listId);
        shapeList.deleteShapeFromList(form);
        shapesListDAO.save(shapeList);
    }


}