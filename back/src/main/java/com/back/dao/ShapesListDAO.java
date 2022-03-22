package com.back.dao;

import com.back.model.ShapeList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShapesListDAO extends JpaRepository<ShapeList, Integer> {
    ShapeList findById(int id);
}
