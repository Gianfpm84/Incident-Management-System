package com.sistema.examenes.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import com.sistema.examenes.modelo.Request;


public interface RequestRepository extends JpaRepository<Request, Long>{
	
}
