package com.simple_pattern.services;

import com.simple_pattern.models.BaseModel;

import java.util.List;

public interface IBaseService<T extends BaseModel> {

    T create(T model);
    T update(T model);
    T findById(Integer id);
    List<T> findAll();
    boolean deleteById(Integer id);
}
