package com.basic.api.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String lastname;
	private String firstname;
	private LocalDate birthdate;
	private boolean wantsnewletter;
	
	public Student() {
		this.lastname = "";
		this.firstname = "";
		this.birthdate = null;
		this.wantsnewletter = false;
	}
	
	public Student(String lastName, String firstName, LocalDate birthdate, boolean wantsNewletter) {
		this.lastname = lastName;
		this.firstname = firstName;
		this.birthdate = birthdate;
		this.wantsnewletter = wantsNewletter;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public boolean isWantsNewletter() {
		return wantsnewletter;
	}
	public void setWantsNewletter(boolean wantsNewletter) {
		this.wantsnewletter = wantsNewletter;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", lastName=" + lastname + ", firstName=" + firstname + ", birthdate=" + birthdate
				+ ", wantsNewletter=" + wantsnewletter + "]";
	}
	
	
	
}
