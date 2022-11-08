package com.basic.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.basic.api.entity.Course;
import com.basic.api.entity.Coursematerial;
import com.basic.api.repository.CourseRepository;
import com.basic.api.repository.CourseMateriaRepository;

@RestController
public class Controler {
	@Autowired // = new CourseRepository()
	CourseRepository courseRep;
	@Autowired // = new CourseRepository()
	CourseMateriaRepository courseMat;

	//carga todos los cursos
	@GetMapping("courses")
	public List<Course> getCourses() {
		List<Course> st1List = courseRep.findAll();
		return st1List;
	}
	
	//carga todos los cursos por id
	@GetMapping("courses/{nId}")
	public Course getCoursesById(@PathVariable long nId) {
		Course c1 = courseRep.findById(nId).get();
		return c1;	
	}

	@GetMapping("coursesmaterial")
	public List<Coursematerial> getCoursesMaterial() {
		List<Coursematerial> cm1List = courseMat.findAll();
		return cm1List;
	}
	
}
