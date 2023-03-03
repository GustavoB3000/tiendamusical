/**
 * 
 */
package com.gustavo.tiendamusicaldata.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gustavo.tiendamusicalentities.entities.Persona;

/**
 * Interface que realiza el CRUD con SPRING JPA para la tabla de persona.
 * @author Calistos
 */

public interface PersonaDAO extends PagingAndSortingRepository<Persona, Long>{

	/**
	 * Metodo que permite consultar el usuario que trata de ingresar a sesion.
	 * @param user {@link String} Usuario captyrado por la persona.
	 * @param password {@link String} Contraseña capturado por la persona.
	 * @return {@link Persona} Objeto con la persona encontrada.
	 */
	@Query("SELECT p FROM Persona p WHERE p.usuario = ?1 AND p.password = ?2")
	Persona findByUserAndPassword(String user, String password);
	
	/*
	 * Tener en cuenta que "FROM Persona", esa "Persona" es la entidad (clase), no la tabla de la DB.
	@Query("SELECT p FROM Persona p WHERE p.usuario = :user AND p.password = :password")
	Persona findByUserAndPassword(@Param("user") String user,@Param("password") String password);
	 * */
}
