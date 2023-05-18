
package com.sistema.examenes.servicios.impl;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.examenes.modelo.Question;
import com.sistema.examenes.modelo.Request;
import com.sistema.examenes.repositorios.QuestionRepository;
import com.sistema.examenes.servicios.QuestionService;


@Service
public class QuestionServiceImpl implements QuestionService{

	
	/* Inyección de la dependencia. */
	@Autowired
	private QuestionRepository questionRepository;

	
	@Override
	public Question agregarQuestion(Question question) {
		return questionRepository.save(question);
	}

	
	@Override
	public Question actualizarQuestion(Question question) {
		return questionRepository.save(question);
	}


	@Override
	public Set<Question> obtenerQuestions() {
		return (Set<Question>) questionRepository.findAll();
	}

	
	@Override
	public Question obtenerQuestion(Long questiontId) {	
		return questionRepository.findById(questiontId).get();
	}

	
	@Override
	public Set<Question> obtenerQuestionsDelRequest(Request request) {	
		return questionRepository.findByRequest(request);
	}

	
	@Override
	public void eliminarQuestion(Long questiontId) {	
		Question question = new Question();
		question.setQuestiontId(questiontId);
		questionRepository.delete(question);	
	}
	
}
	