package com.gustavo.tiendamusicalservices.service;

import com.gustavo.tiendamusicalentities.entities.Persona;

/**
 * Interface que realiza la logica de negocio para el inicio de sesion de la persona.
 * @author Calistos
 *
 */
public interface LoginService {

	/**
	 * Metodo que permtie consultar un usuario que trata de ingresar a sesion en la tienda.
	 * @param user {@link String} Usuario capturado por la persona.
	 * @param password {@link String} Contraseña capturado por la persona.
	 * @return {@link Persona} El usuario encontrado en la base de datos.
	 */
	Persona consultarUsuarioLogin(String user, String password);
}
