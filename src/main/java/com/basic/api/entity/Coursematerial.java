package com.basic.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Coursematerial {

	@Id 		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//La cascada oblida a que el otro dato se inserta a la vez
	//es decir si el curso no existe pues lo inserta en ese momento
	
	@OneToOne //Relacion Una a una,
	@JoinColumn(name="course_id") //Aqui dfinimos quien es la duenya
	private Course course;
	@Column(name="url")
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
