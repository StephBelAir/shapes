package web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {

    @GetMapping("/Shape")
    public String listeShapes(){
        return "Liste de Formes";
    }

    //Get by ID
   // @GetMapping(value = "/Produits/{id}")
    //public Shape afficherUneShape(@PathVariable int id) {
      //  Shape shape = new Shape(id, new String("Rectangle"), 10);
       // return shape;
    //}
}
