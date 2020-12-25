package com.examtry1.examModuleTry1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examtry1.examModuleTry1.Model.Exam;
import com.examtry1.examModuleTry1.Repository.ExamRepository;

@RestController
public class ExamController {
	
	@Autowired
	ExamRepository examRepository;
	
	@GetMapping("/Exam")
	public List<Exam> getAllExam(){
		return examRepository.findAll();
	}
	
	@PostMapping("/Exam/{course_id}")
	public String addExam(@RequestBody Exam exam,@PathVariable int course_id) {
		exam.setCourseId(course_id);
	
		examRepository.save(exam);
		return "we have added the exam details successfully!!";
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/exam/{exam_id}")
	public String deleteExam(@PathVariable int exam_id) {
		
		Exam e= examRepository.getOne(exam_id);
		examRepository.delete(e);
		
		return "Deletion successful !!";
	}
	
	
	@PutMapping("/Exam/{exam_id}")
	public String updateExam(@RequestBody Exam exam,@PathVariable int exam_id) {
		Exam e= examRepository.getOne(exam_id);
		e.setExamName(exam.getExamName());
		e.setTotalDuration(exam.getTotalDuration());
		e.setTotalMarks(exam.getTotalMarks());
		
		examRepository.save(e);
		return "we have updated the exam details of "+exam.getExamName()+" successfully!!";
	}
}
