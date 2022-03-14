package com.back.dao;

import com.back.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShapeDaoImpl implements ShapeDao{
    public static List<Form> forms = new ArrayList<>();
    public static List<ShapeList> shapesListe = new ArrayList<>();

    static {

        forms.add(new Circle(1, 5));
        forms.add(new Rectangle(2, 5, 10));
        forms.add(new Triangle(3, 5));

    }

    @Override
    public List<Form> findAll() {
        return forms;
    }

    @Override
    public Form findById(int id){
        for (Form form : forms){
            if (form.getId() == id){
                return form;
            }
        }
        return null;
    }

    @Override
    public Form save(Form form){
        forms.add(form);
        return form;
    }

    @Override
    public void deleteById(int id) throws Exception{
        forms.remove(id);
    }

}
