package com.simple_pattern.controllers;

import com.simple_pattern.models.BaseModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBaseController<T extends BaseModel> {

    ResponseEntity<T> create(T model);
    ResponseEntity<T> update(T model);
    ResponseEntity<T> findById(Integer id);
    ResponseEntity<List<T>> findAll();
    ResponseEntity<?> deleteById(Integer id);
}
