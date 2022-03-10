package com.back.dao;

import com.back.model.Form;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface ShapeDao {

    List<Form> findAll();
    Form findById(int id);
    Form save(Form form);

}
