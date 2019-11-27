package com.simple_pattern.controllers;

import com.simple_pattern.models.BaseModel;
import com.simple_pattern.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public abstract class BaseController<T extends BaseModel> implements IBaseController<T> {

    @Autowired
    BaseService<T> service;

    @Override
    @PostMapping
    public ResponseEntity<T> create(@Valid @RequestBody T model) {
        return ResponseEntity.ok(service.create(model));
    };

    @Override
    @PutMapping
    public ResponseEntity<T> update(@Valid @RequestBody T model) {
        return ResponseEntity.ok(service.update(model));
    };

    @Override
    @GetMapping(value = "/{id}")
    public ResponseEntity<T> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    };

    @Override
    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        return ResponseEntity.ok(service.findAll());
    };

    @Override
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.deleteById(id));
    };

}
