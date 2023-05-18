
package com.sistema.examenes.controladores;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.examenes.modelo.Question;
import com.sistema.examenes.modelo.Request;
import com.sistema.examenes.servicios.QuestionService;
import com.sistema.examenes.servicios.RequestService;




@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class QuestionController {

	
		/*Inyección de Dependencias*/
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private RequestService requestService;
	
	
		/*Agregar una question.*/
	@PostMapping("/")
	public ResponseEntity<Question> agregarQuestion(@RequestBody Question question){
		
		Question questionSave = questionService.agregarQuestion(question);
		return ResponseEntity.ok(questionSave);	 
	}
	
	
		/*Actualizar una question.*/
	@PutMapping("/actualizar")
	public ResponseEntity<Question> actualizarQuestion(@RequestBody Question question){
		
		Question questionAct = questionService.actualizarQuestion(question);
		return ResponseEntity.ok(questionAct);	 
	}
	
	
		/*Consultar todas las questions de un request.*/
	@GetMapping("/request/{requestId}")
	public ResponseEntity<?> obtenerQuestionsDelRequest(@PathVariable ("requestId")  Long requestId) {
		
		Request request = requestService.obtenerRequest(requestId);
		Set<Question> questions = request.getQuestions();
		
		
		List requests = new ArrayList(questions);
		
		    if(requests.size() > Integer.parseInt(request.getNumeroDeRequest())) {	    	
		    requests = requests.subList(0, Integer.parseInt(request.getNumeroDeRequest() + 1));
		    
		    }
		    
		Collections.shuffle(requests);
		return ResponseEntity.ok(request);
	}
	
	
		/*Consultar la question por el Id.*/
	@GetMapping("/{questiontId}")
	public ResponseEntity<?> obtenerQuestionsById(@PathVariable ("requestId")  Long requestId) {
		
		return ResponseEntity.ok(questionService.obtenerQuestion(requestId));
	}
	
	
		/*Eliminar la question por el Id.*/
	@DeleteMapping("/{questiontId}")
	public void eliminarCategory(@PathVariable ("questiontId")  Long questiontId) {
			
		questionService.eliminarQuestion(questiontId);
	}
	
}
