package com.simple_pattern.services;

import com.simple_pattern.models.BaseModel;
import com.simple_pattern.repositories.BaseRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class BaseService<T extends BaseModel> implements IBaseService<T> {

    @Autowired
    BaseRepository<T> repository;

    @Override
    public T create(T model) {
        try {
            return repository.save(model);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    };

    @Override
    public T update(T model) {
        try {
            T modelUpdate = repository.findById(model.getId())
                    .orElseThrow(() -> new NotFoundException("Unable to get " + model.getClass().getName() + model.getClass()));
            return repository.save(model);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    };

    @Override
    public T findById(Integer id) {
        try {
            return repository.findById(id)
                    .orElseThrow(() -> new NotFoundException("Unable to get " + id ));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    };

    @Override
    public List<T> findAll() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    };

    @Override
    public boolean deleteById(Integer id) {
        try {
            T modelUpdate = repository.findById(id)
                    .orElseThrow(() -> new NotFoundException("Unable to get " + id));
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    };
}
