
package com.sistema.examenes.servicios;


import java.util.Set;
import com.sistema.examenes.modelo.Question;
import com.sistema.examenes.modelo.Request;


public interface QuestionService {
	

	public Question agregarQuestion(Question question);
	
	public Question actualizarQuestion(Question question);
	
	public Set<Question> obtenerQuestions();
	
	public Question obtenerQuestion(Long questiontId);
	
	public Set<Question> obtenerQuestionsDelRequest(Request request);
	
	public void eliminarQuestion(Long questiontId);
	
}
