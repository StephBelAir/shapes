package com.back.dao;

import com.back.model.Form;
import com.back.model.ShapeList;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface ShapeDao {

    List<Form> findAll();
    Form findById(int id);
    Form save(Form form);
    void deleteById(int id) throws Exception; //??

}
