package com.basic.api.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.basic.api.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{
    public List<Course> findAll();

}
