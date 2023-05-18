package com.sistema.examenes.modelo;


import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "categories")
public class Category {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	
	private String titulo;
	
	private String description;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Request> request = new LinkedHashSet<>();
	
	
	/*Constructores:*/
	
		/*Constructor Vacío.*/
	
	public Category() {
		
	}

	
		/*Constructor con argumentos, excepto el Id Autonumérico.*/
	
	public Category(String titulo, String description, Set<Request> request) {
		super();
		this.titulo = titulo;
		this.description = description;
		this.request = request;
	}
	
	
		/*Constructor con argumentos, excepto el Id Autonumérico y la relación en el atributo request.*/
	
	public Category(String titulo, String description) {
	super();
	this.titulo = titulo;
	this.description = description;
}


	/*Getters and Setters.*/
	
	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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

	public Set<Request> getRequest() {
		return request;
	}

	public void setRequest(Set<Request> request) {
		this.request = request;
	}

}
