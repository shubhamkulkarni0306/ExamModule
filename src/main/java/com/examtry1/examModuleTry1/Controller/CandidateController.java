package com.examtry1.examModuleTry1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examtry1.examModuleTry1.Model.Candidate;
import com.examtry1.examModuleTry1.Repository.CandidateRepository;

@RestController
public class CandidateController {
	
	@Autowired
	CandidateRepository candidateRepository;
	
	
	@GetMapping("/candidate")
	public List<Candidate> getCandidate(){
		return candidateRepository.findAll();
	}
	

}
