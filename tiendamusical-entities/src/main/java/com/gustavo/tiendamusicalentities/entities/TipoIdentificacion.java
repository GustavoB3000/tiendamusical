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
 * Clase que contiene entidades de tipos de identificacion de una persona o usuario.
 * @author Calistos
 *
 */
@Entity
@Table(name = "tipoidentificacion")
public class TipoIdentificacion extends Common{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoIdentificacion")
	private Long idTipoIdentificacion;
	
	@Column(name = "nombre", length = 45, nullable = false)
	private String nombre;

	/**
	 * @return the idTipoIdentificacion
	 */
	public Long getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	/**
	 * @param idTipoIdentificacion the idTipoIdentificacion to set
	 */
	public void setIdTipoIdentificacion(Long idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
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
