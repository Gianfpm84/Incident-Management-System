package com.sistema.examenes.modelo;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "requests")
public class Request {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long requestId;
	
	private String titulo;
	
	private String description;
	
	private String puntosMaximo;
	
	private String numeroDeRequest;
	
	private boolean activo = false;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;
	
	@OneToMany(mappedBy = "request", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Question> questions = new LinkedHashSet<>();

	
	/*Constructores:*/
	
		/*Constructor Vacío.*/

	public Request() {
	
	}

		/*Constructor con argumentos, excepto el Id Autonumérico.*/
	
	public Request(String titulo, String description, String puntosMaximo, String numeroDeRequest, boolean activo,
			Category category, Set<Question> questions) {
		super();
		this.titulo = titulo;
		this.description = description;
		this.puntosMaximo = puntosMaximo;
		this.numeroDeRequest = numeroDeRequest;
		this.activo = activo;
		this.category = category;
		this.questions = questions;
	}
	
	
		/*Constructor con argumentos, excepto el Id Autonumérico y la relación en el campo questions.*/
	
	public Request(String titulo, String description, String puntosMaximo, String numeroDeRequest, boolean activo,
			Category category) {
		
		super();
		this.titulo = titulo;
		this.description = description;
		this.puntosMaximo = puntosMaximo;
		this.numeroDeRequest = numeroDeRequest;
		this.activo = activo;
		this.category = category;
	}
	
		
	/*Getters and Setters.*/

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPuntosMaximo() {
		return puntosMaximo;
	}

	public void setPuntosMaximo(String puntosMaximo) {
		this.puntosMaximo = puntosMaximo;
	}

	public String getNumeroDeRequest() {
		return numeroDeRequest;
	}

	public void setNumeroDeRequest(String numeroDeRequest) {
		this.numeroDeRequest = numeroDeRequest;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

}
