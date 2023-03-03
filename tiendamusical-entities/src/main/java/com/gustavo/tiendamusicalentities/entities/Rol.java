/**
 * 
 */
package com.gustavo.tiendamusicalentities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que contiene entidades de perfiles de usuarios.
 * @author Calistos
 *
 */
@Entity
@Table(name = "rol")
public class Rol extends Common{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRol")
	private Long idRol;
	
	@Column(name = "nombre", length = 45, nullable = false)
	private String nombre;

	/**
	 * @return the idRol
	 */
	public Long getIdRol() {
		return idRol;
	}

	/**
	 * @param idRol the idRol to set
	 */
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
