package com.sistema.examenes.servicios;


import java.util.Set;

import com.sistema.examenes.modelo.Category;


public interface CategoryService {

	
	public Category agregarCategory(Category category);
	
	public Category actalizarCategory(Category category);
	
	public Set<Category> obtenerCategorys();
	
	public Category obtenerCategory(Long categoryId);

	public void eliminarCatgory(Long categoryId);
	
}
