/**
 * 
 */
package com.gustavo.tiendamusicalweb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.gustavo.tiendamusicalentities.entities.Persona;
import com.gustavo.tiendamusicalservices.service.LoginService;
import com.gustavo.tiendamusicalweb.utils.CommonUtils;

/**
 * Controlador que se encarga del flujo de la pantalla "login.xhtml".
 * @author Calistos
 *
 */
@ManagedBean
@ViewScoped
public class LoginController {

	/**
	 * Usuario capturado por la persona.
	 */
	private String user;
	/**
	 * Contraseña capturada por la persona.
	 */
	private String password;
	
	/**
	 * Propiedad de la logica de negocio inyectada con JSF y Spring.
	 */
	@ManagedProperty("#{loginServiceImpl}")
	private LoginService loginServiceImpl;
	
	@PostConstruct
	public void init() {
		System.out.println("Inicializando Login.");
	}
	
	/**
	 * Metodo que le permite a la persona ingresar a su pantalla de home.
	 */
	public void entrar() {
		
		Persona personaConsultada = this.loginServiceImpl.consultarUsuarioLogin(this.user, this.password);
		
		if(personaConsultada != null) {
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "Ok!", "Bienvenido al home: :)");
		}else {
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "Denegado", "Usuario o contraseña incorrecta/s.");
		}
	}
	
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
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
	 * @return the loginServiceImpl
	 */
	public LoginService getLoginServiceImpl() {
		return loginServiceImpl;
	}

	/**
	 * @param loginServiceImpl the loginServiceImpl to set
	 */
	public void setLoginServiceImpl(LoginService loginServiceImpl) {
		this.loginServiceImpl = loginServiceImpl;
	}
}
