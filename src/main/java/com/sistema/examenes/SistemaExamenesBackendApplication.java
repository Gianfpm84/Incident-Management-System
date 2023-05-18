package com.sistema.examenes;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sistema.examenes.exceptions.UserFoundExceptions;
import com.sistema.examenes.modelo.Rol;
import com.sistema.examenes.modelo.Usuario;
import com.sistema.examenes.modelo.UsuarioRol;
import com.sistema.examenes.servicios.UsuarioService;


@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner {

	
/*
	@Autowired
	private UsuarioService usuarioService;

	

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

*/
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		/*Guardar el usuario.*/

		
	/*
		try {
			
		Usuario usuario = new Usuario();
		
		usuario.setNombre("Gianfranco");
		usuario.setApellido("Parracciani Molina");
		usuario.setUsername("gianfpm");
		
	*/	
		/*usuario.setPassword("abcd1234");*/

    /*
		usuario.setPassword(this.bCryptPasswordEncoder.encode("abcd1234"));
		
		usuario.setEmail("parracciani1@gmail.com");
		usuario.setTelefono("1234567890");
		usuario.setPerfil("foto.png");
	
    */
		
		/*Crear un rol.*/
	
	
	/*
		Rol rol = new Rol();
		
		rol.setRolId(1L);
		rol.setNombre("ADMIN");
		rol.setRolNombre("ADMIN");
		
	*/
		
		/*Relaciones con las clases Usuario y UsuarioRol.*/
		
	/*	
		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
	    usuarioRol.setRol(rol);
	    usuarioRol.setUsuario(usuario);
	    usuarioRoles.add(usuarioRol);
	    
	    Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
	    System.out.println(usuarioGuardado.getUsername());
	    
		} catch (UserFoundExceptions e) {
			e.printStackTrace();
		}		
	*/
	}
}
