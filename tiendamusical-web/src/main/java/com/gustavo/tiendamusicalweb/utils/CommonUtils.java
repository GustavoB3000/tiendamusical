/**
 * 
 */
package com.gustavo.tiendamusicalweb.utils;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 * Clase generada  para crear funciones globales/comunes entre clases del proyecto.
 * @author Calistos
 */
public class CommonUtils {

	/**
	 * Metodo que permite mostrar un mensaje al usuario.
	 * @param severity {@link Severity} Objeto que indica el tipo de mensaje a mostrar.
	 * @param summary {@link String} Titulo del mensaje.
	 * @param detail {@link String} Detalle del mensaje.
	 */
	public static void mostrarMensaje(Severity severity, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
	}
}
