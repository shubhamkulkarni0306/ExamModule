package com.examtry1.examModuleTry1.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examtry1.examModuleTry1.Model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
	

}
