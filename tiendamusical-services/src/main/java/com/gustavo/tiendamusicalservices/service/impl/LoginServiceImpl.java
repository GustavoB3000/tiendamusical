/**
 * 
 */
package com.gustavo.tiendamusicalservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.tiendamusicaldata.dao.PersonaDAO;
import com.gustavo.tiendamusicalentities.entities.Persona;
import com.gustavo.tiendamusicalservices.service.LoginService;

/**
 * Clase que implementa las funciones para la logica de negocio para la pantalla de login.
 * @author Calistos
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private PersonaDAO personaDAOImpl;
	
	@Override
	public Persona consultarUsuarioLogin(String user, String password) {
		return this.personaDAOImpl.findByUserAndPassword(user, password);
	}

}
