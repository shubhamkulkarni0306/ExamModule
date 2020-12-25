package com.examtry1.examModuleTry1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Entity
@Table(name="instructor")
@JsonAutoDetect
public class Instructor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int instructorId;
	private String instructorName;
	
	
	public Instructor() {
		super();
	}
	public Instructor(String instructorName) {
		super();
		this.instructorName = instructorName;
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

}
