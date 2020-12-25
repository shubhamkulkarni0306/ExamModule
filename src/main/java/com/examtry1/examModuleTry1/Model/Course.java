package com.examtry1.examModuleTry1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Entity
@Table(name="course")
@JsonAutoDetect
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	private String courseName;
	
//	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy = "course")
//	@JoinColumn(name="course_id")
//	@JsonIgnoreProperties(value = {"course", "hibernateLazyInitializer"})
//	private Exam exam;
	
	
	
	public Course() {
		super();
	}
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

}
