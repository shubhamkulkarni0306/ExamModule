package com.examtry1.examModuleTry1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Entity
@Table(name="candidate")
@JsonAutoDetect
public class Candidate {
	@Id
	private int candidateId;
	private String candidateName;
	
	
	public Candidate() {
		super();
	}
	public Candidate(String candidateName) {
		super();
		this.candidateName = candidateName;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	
	
}
