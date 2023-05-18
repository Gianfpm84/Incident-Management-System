
package com.sistema.examenes.servicios.impl;


import java.util.LinkedHashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.examenes.modelo.Category;
import com.sistema.examenes.repositorios.CategoryRepository;
import com.sistema.examenes.servicios.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{

	
	/* Inyección de la dependencia. */
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@Override
	public Category agregarCategory(Category category) {
		
		return categoryRepository.save(category);
	}

	
	@Override
	public Category actalizarCategory(Category category) {
		
		return categoryRepository.save(category);
	}

	
	@Override
	public Set<Category> obtenerCategorys() {
		
		return new LinkedHashSet<>(categoryRepository.findAll());
	}

	
	@Override
	public Category obtenerCategory(Long categoryId) {
		
		return categoryRepository.findById(categoryId).get();
	}

	
	@Override
	public void eliminarCatgory(Long categoryId) {
		
		Category category = new Category();
		category.setCategoryId(categoryId);
		categoryRepository.delete(category);
	}

}
