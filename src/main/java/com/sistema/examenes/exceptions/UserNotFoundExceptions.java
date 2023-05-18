package com.sistema.examenes.exceptions;

public class UserNotFoundExceptions extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/*Mensaje por defecto.*/
	public UserNotFoundExceptions() {
		
		super("El usuario con ese username no existe en la Base de Datos, favor: ¡intente nuevamente!");
		
	}
	
	/*Mensaje personalizado.*/
	public UserNotFoundExceptions(String mensaje) {
		
		super(mensaje);
		
	}

}
