package com.sistema.examenes.exceptions;

public class UserFoundExceptions extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/*Mensaje por defecto.*/
	public UserFoundExceptions() {
		
		super("El usuario ya existe o se encuentra registrado en el Sistema, favor: ¡intente nuevamente!");
		
	}
	
	/*Mensaje personalizado.*/
	public UserFoundExceptions(String mensaje) {
		
		super(mensaje);
		
	}
	
}
