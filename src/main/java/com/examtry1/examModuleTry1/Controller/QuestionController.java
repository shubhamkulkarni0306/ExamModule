package com.examtry1.examModuleTry1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.examtry1.examModuleTry1.Model.Question;
import com.examtry1.examModuleTry1.Repository.QuestionRepository;

@RestController
public class QuestionController {
	
	@Autowired
	QuestionRepository questionRepository;
	
	
	@GetMapping("/questions")
	public List<Question> getAllQuestions(){
		return questionRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST,value ="/question/{exam_id}")
	public String addQuestion(@RequestBody Question question,@PathVariable int exam_id) {
		question.setExamId(exam_id);
		if(question.isIsmcq()) {
			question.setShortAnswer("NA");
		}else {
			question.setAnswer("Its a descriptive answer");
			question.setOpt1("NA");
			question.setOpt2("NA");
			question.setOpt3("NA");
			question.setOpt4("NA");
		}
		
		
		questionRepository.save(question);
		return "we have added the question details successfully!!";
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/questions/{question_id}")
	public String deleteQuestion(@PathVariable int question_id) {
		
		Question question= questionRepository.getOne(question_id);
		questionRepository.delete(question);
		
		return "Deletion successful !!";
	}
	
	
	@PutMapping("/question/{question_id}")
	public String updateQuestion(@RequestBody Question question,@PathVariable int question_id) {
		
		Question q= questionRepository.getOne(question_id);
		
		if(question.isIsmcq()) {
			q.setAnswer(question.getAnswer());
			q.setOpt1(question.getOpt1());
			q.setOpt2(question.getOpt2());
			q.setOpt3(question.getOpt3());
			q.setOpt4(question.getOpt4());
			
		}else {
			q.setAnswer("Its a descrictive answer");
			q.setOpt1("NA");
			q.setOpt2("NA");
			q.setOpt3("NA");
			q.setOpt4("NA");
		}
		q.setAttachments(question.getAttachments());
		q.setIsmcq(question.isIsmcq());
		q.setMarks(question.getMarks());
		
		q.setQuestionDescription(question.getQuestionDescription());
		q.setShortAnswer(question.getShortAnswer());
	
		
		questionRepository.save(q);
		return "we have updated the question details of question id: "+question.getQuestionId()+"successfully!!";
	}
	
	
}
