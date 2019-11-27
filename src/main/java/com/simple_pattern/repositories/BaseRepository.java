package com.simple_pattern.repositories;

import com.simple_pattern.models.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository<T extends BaseModel> extends JpaRepository<T, Integer> {
}
