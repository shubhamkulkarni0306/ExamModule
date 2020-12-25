package com.examtry1.examModuleTry1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Entity
@Table(name="response")
@JsonAutoDetect
public class Response {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int responseId;
	private int candidateId;
	private int examId;
	private int questionId;
	private String answer;
	
	
	
	
	public Response() {
		super();
	}
	public Response(int candidateId, int examId, int questionId, String answer) {
		super();
		this.candidateId = candidateId;
		this.examId = examId;
		this.questionId = questionId;
		this.answer = answer;
	}
	public int getResponseId() {
		return responseId;
	}
	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
