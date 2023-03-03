/**
 * 
 */
package com.gustavo.tiendamusicalentities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que representa entidades de personas que manejan el aplicativo.
 * @author Calistos
 *
 */
@Entity
@Table(name = "persona")
public class Persona extends Common{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPersona")
	private Long idPersona;
	
	@Column(name = "numeroIdentificacion", length = 12, nullable = false)
	private String numeroIdentificacion;

	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;
	
	@Column(name = "primerApellido", length = 100, nullable = false)
	private String primerApellido;
	
	@Column(name = "segundoApellido", length = 45, nullable = false)
	private String segundoApellido;
	
	@Column(name = "imagen", length = 100)
	private String imagen;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idTipoIdentificacion")
	private TipoIdentificacion idTipoIdentificacion;
	
	@Column(name = "usuario", length = 45, nullable = false)
	private String usuario;
	
	@Column(name = "password", length = 45, nullable = false)
	private String password;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idRol")
	private Rol idRol;

	/**
	 * @return the idPersona
	 */
	public Long getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * @return the numeroIdentificacion
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * @param numeroIdentificacion the numeroIdentificacion to set
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
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

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the idTipoIdentificacion
	 */
	public TipoIdentificacion getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	/**
	 * @param idTipoIdentificacion the idTipoIdentificacion to set
	*/
	public void setIdTipoIdentificacion(TipoIdentificacion idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the idRol
	 */
	public Rol getIdRol() {
		return idRol;
	}

	/**
	 * @param idRol the idRol to set
	*/ 
	public void setIdRol(Rol idRol) {
		this.idRol = idRol;
	} 
}
