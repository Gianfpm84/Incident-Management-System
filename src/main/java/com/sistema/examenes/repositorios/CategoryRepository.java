package com.sistema.examenes.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import com.sistema.examenes.modelo.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
