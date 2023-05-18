package com.sistema.examenes.modelo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    private Long rolId;
    
    private String nombre;
    
    private String rolNombre;
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "rol")
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();

    
    /*Constructores:*/
	
		/*Constructor Vacío.*/
    
    public Rol(){

    }
    
    	/*Constructor con argumentos.*/

    public Rol(String nombre, String rolNombre) {
		super();
		this.nombre = nombre;
		this.rolNombre = rolNombre;
	}

    
    /*Getters and Setters.*/
	
    public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Rol(Long rolId, String rolNombre) {
        this.rolId = rolId;
        this.rolNombre = rolNombre;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public Set<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(Set<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    }
}
