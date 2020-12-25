package com.examtry1.examModuleTry1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examtry1.examModuleTry1.Model.Question;
import com.examtry1.examModuleTry1.Model.Response;
import com.examtry1.examModuleTry1.Repository.ResponseRepository;

@RestController
public class ResponseController {
	
	@Autowired
	ResponseRepository responseRepository;
	
	@GetMapping("/response")
	public List<Response> getAllResponse(){
		return responseRepository.findAll();
		}
	
	@RequestMapping(method = RequestMethod.POST,value ="/response")
	public String addResponse(@RequestBody Response response) {
		responseRepository.save(response);
		
		return "successfully Added the response";
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/response/{response_id}")
	public String deleteQuestion(@PathVariable int response_id) {
		
		Response response= responseRepository.getOne(response_id);
		responseRepository.delete(response);
		return "Deletion successful !!";
	}
	
	
	@PutMapping("/response/{response_id}")
	public String updateQuestion(@RequestBody Response response,@PathVariable int response_id) {
		Response res= responseRepository.getOne(response_id);
				res.setAnswer(response.getAnswer());
		responseRepository.save(res);
		return "we have updated the exam details of question id: "+response.getResponseId()+"successfully!!";
	}

}
