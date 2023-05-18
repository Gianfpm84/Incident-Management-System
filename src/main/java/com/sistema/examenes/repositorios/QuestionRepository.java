package com.sistema.examenes.repositorios;


import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sistema.examenes.modelo.Question;
import com.sistema.examenes.modelo.Request;


public interface QuestionRepository extends JpaRepository<Question, Long>{
	
	
	Set<Question> findByRequest(Request request);

}
