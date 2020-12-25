package com.examtry1.examModuleTry1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Entity
@Table(name="questions")
@JsonAutoDetect
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "question_id")
	private int questionId;
	@Column(name = "exam_id")
	private int examId;
	@Column(name = "quest_desc")
	private String questionDescription;
	@Column(name = "is_mcq")
	private boolean ismcq;
	
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	@Column(name = "short_answer")
	private String shortAnswer;
	private String answer;
	private String attachments;
	private int marks;
	
	
	
	
	public Question() {
		super();
	}
	
	public Question(String questionDescription, boolean ismcq, String opt1, String opt2, String opt3, String opt4,
			String shortAnswer,String answer, String attachments, int marks) {
		super();
		this.questionDescription = questionDescription;
		this.ismcq = ismcq;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.shortAnswer = shortAnswer;
		this.answer=answer;
		this.attachments = attachments;
		this.marks = marks;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getQuestionDescription() {
		return questionDescription;
	}
	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}
	public boolean isIsmcq() {
		return ismcq;
	}
	public void setIsmcq(boolean ismcq) {
		this.ismcq = ismcq;
	}
	public String getOpt1() {
		return opt1;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}
	public String getOpt4() {
		return opt4;
	}
	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}
	public String getShortAnswer() {
		return shortAnswer;
	}
	public void setShortAnswer(String shortAnswer) {
		this.shortAnswer = shortAnswer;
	}
	public String getAttachments() {
		return attachments;
	}
	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
