package com.examtry1.examModuleTry1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examtry1.examModuleTry1.Model.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer>{

}
