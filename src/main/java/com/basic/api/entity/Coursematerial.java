package com.basic.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Coursematerial {

	@Id 		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonIgnore // to ignore the logical property used in serialization and deserialization
	@OneToOne //Relacion Una a una, //comentado @JoinColumn(name="course") //Aqui dfinimos quien es la duenya
	private Course course;
	private String url;
	public Coursematerial(Long id, Course course, String url) {
		super();
		this.id = id;
		this.course = course;
		this.url = url;
	}
	
	public Coursematerial() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "CourseMaterial [id=" + id + ", course=" + course + ", url=" + url + "]";
	}
	
	

}
