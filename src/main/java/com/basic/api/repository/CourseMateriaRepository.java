package com.basic.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.basic.api.entity.Coursematerial;

public interface CourseMateriaRepository extends CrudRepository<Coursematerial, Long>{
    public List<Coursematerial> findAll();

}
