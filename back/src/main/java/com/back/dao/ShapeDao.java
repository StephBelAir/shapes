package com.back.dao;

import com.back.model.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public interface ShapeDao extends JpaRepository<Form, Integer> {

    List<Form> findAll();
    Form findById(int id);
    Form save(Form form);
    void deleteById(int id) throws Exception; //??

}
