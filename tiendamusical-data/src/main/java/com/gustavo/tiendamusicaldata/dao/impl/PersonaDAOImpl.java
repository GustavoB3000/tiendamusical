/**
 * 
 */
package com.gustavo.tiendamusicaldata.dao.impl;

import com.gustavo.tiendamusicaldata.common.CommonDAO;
import com.gustavo.tiendamusicaldata.dao.PersonaDAO;
import com.gustavo.tiendamusicalentities.entities.Persona;

/**
 * Clase que implementa el CRUD generico y las funciones de la interface PersonaDAO.
 * @author Calistos
 *
 */
public class PersonaDAOImpl extends CommonDAO<Persona, PersonaDAO> {

	/**
	 * Metodo que permite consultar una persona por su usuario y contraseña.
	 * @param user {@link String} Usuario capturado por la persona.
	 * @param password {@link String} Contraseña capturado por la persona.
	 * @return {@link Persona} Persona encontrada.
	 */
	public Persona findUserAndPassword(String user, String password) {
		return this.repository.findByUserAndPassword(user, password);
	}
}
