package com.examtry1.examModuleTry1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examtry1.examModuleTry1.Model.Instructor;
import com.examtry1.examModuleTry1.Repository.InstructorRepository;

@RestController
public class InstructorController {
	
	@Autowired
	InstructorRepository instructorRepository;
	
	@GetMapping("/instructors")
	public List<Instructor> getAll(){
		
		return instructorRepository.findAll();
		}
	
	@PostMapping("/instructor")
	public String addInstructor(@RequestBody Instructor instructor) {
		instructorRepository.save(instructor);
		return "Success";
	}
	
	

}
