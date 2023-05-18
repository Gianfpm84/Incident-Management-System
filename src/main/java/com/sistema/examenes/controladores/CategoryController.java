
package com.sistema.examenes.controladores;


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

import com.sistema.examenes.modelo.Category;
import com.sistema.examenes.servicios.CategoryService;


@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

	
	/*Inyección de Dependencias*/
	@Autowired
	private CategoryService categoryService;
	
	
	@GetMapping("/{categoryId}")
	public Category obtenerCategory(@PathVariable ("categoryId")  Long categoryId) {
			
		return categoryService.obtenerCategory(categoryId);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<?> obtenerCategorys() {
			
		return ResponseEntity.ok(categoryService.obtenerCategorys());
	}
	
	
	@PostMapping("/")
	public ResponseEntity<Category> guardarCatgory(@RequestBody Category category){
		
		 Category categorySave = categoryService.agregarCategory(category);	 
		 return ResponseEntity.ok(categorySave);
	}
	 
	
	@PutMapping("/actualizar")
	public Category actualizarCategory(@RequestBody Category category){
		
		 return categoryService.actalizarCategory(category);
	}
	
	
	@DeleteMapping("/{categoryId}")
	public void eliminarCategory(@PathVariable ("categoryId")  Long categoryId) {
			
		categoryService.eliminarCatgory(categoryId);		
	}
	
}
