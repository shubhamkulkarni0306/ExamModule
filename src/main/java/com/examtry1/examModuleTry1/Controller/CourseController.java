package com.examtry1.examModuleTry1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examtry1.examModuleTry1.Model.Course;
import com.examtry1.examModuleTry1.Repository.CourseRepository;

@RestController
public class CourseController {
	
	@Autowired
	CourseRepository courseRepository;
	
	
	@GetMapping("/Courses")
	public List<Course> getAll(){
		return courseRepository.findAll();
		}
	
	@PostMapping("/courses")
	public String addCourse(@RequestBody Course course) {
		courseRepository.save(course);
		return "success!!";
	}

}
