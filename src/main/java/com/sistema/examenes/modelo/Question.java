package com.sistema.examenes.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long questiontId;
	
	@Column(length = 5000)
	private String contenido;
	
	private String image;
	
	private String opc1;
	
	private String opc2;
	
	private String opc3;
	
	private String opc4;
	
	private String answerString;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Request request;
	
	
	/*Constructores:*/
	
		/*Constructor Vacío.*/

	public Question() {

	}

	
		/*Constructor con argumentos, excepto el Id Autonumérico.*/
	
	public Question(String contenido, String image, String opc1, String opc2, String opc3, String opc4,
			String answerString, Request request) {
		super();
		this.contenido = contenido;
		this.image = image;
		this.opc1 = opc1;
		this.opc2 = opc2;
		this.opc3 = opc3;
		this.opc4 = opc4;
		this.answerString = answerString;
		this.request = request;
	}
	
		/*Constructor con argumentos, excepto el Id Autonumérico y la relación en el atributo request.*/
	
	public Question(String contenido, String image, String opc1, String opc2, String opc3, String opc4,
		String answerString) {
		super();
		this.contenido = contenido;
		this.image = image;
		this.opc1 = opc1;
		this.opc2 = opc2;
		this.opc3 = opc3;
		this.opc4 = opc4;
		this.answerString = answerString;
	}
	
	
	/*Getters and Setters.*/

	public Long getQuestiontId() {
		return questiontId;
	}

	public void setQuestiontId(Long questiontId) {
		this.questiontId = questiontId;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getOpc1() {
		return opc1;
	}

	public void setOpc1(String opc1) {
		this.opc1 = opc1;
	}

	public String getOpc2() {
		return opc2;
	}

	public void setOpc2(String opc2) {
		this.opc2 = opc2;
	}

	public String getOpc3() {
		return opc3;
	}

	public void setOpc3(String opc3) {
		this.opc3 = opc3;
	}

	public String getOpc4() {
		return opc4;
	}

	public void setOpc4(String opc4) {
		this.opc4 = opc4;
	}

	public String getAnswerString() {
		return answerString;
	}

	public void setAnswerString(String answerString) {
		this.answerString = answerString;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}		
		
}
