package com.examtry1.examModuleTry1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@Entity
@Table(name="exam")
@JsonAutoDetect
public class Exam {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int examId;
//	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
//	@JoinColumn(name = "course_id")
//	private Course course;
//	
	private String examName;
	private int totalMarks;
	private int totalDuration;
	private int courseId;
	private int instructorId;
	
	
	

	
	public Exam() {
		super();
	}
	public Exam(String examName, int totalMarks, int totalDuration, int instructorId) {
		super();
		this.examName = examName;
		this.totalMarks = totalMarks;
		this.totalDuration = totalDuration;
		this.instructorId = instructorId;
	}
	public int getExamId() {
		return examId;
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int getTotalDuration() {
		return totalDuration;
	}
	public void setTotalDuration(int totalDuration) {
		this.totalDuration = totalDuration;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
	
	
	
}
