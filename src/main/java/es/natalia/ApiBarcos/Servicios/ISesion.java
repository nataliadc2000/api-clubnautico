package es.natalia.ApiBarcos.Servicios;

import es.natalia.ApiBarcos.JWT.AuthResponse;
import es.natalia.ApiBarcos.Modelos.Socio;

public interface ISesion {

	
	/**
	 * Interfaz del metodo con el que nos logeamos
	 * @param ussername
	 * @param password
	 * @return
	 */
	public AuthResponse login(String ussername,String password);
	/**
	 * Interfaz del metodo para registrarse desde iniciar sesioon(rol por defecto = basico)
	 * @param nuevoSocio
	 * @return
	 */
	public AuthResponse register(Socio nuevoSocio);
	/**
	 * Interfaz del metodo para que el admin pueda resgistrar(eligimos rol)
	 * @param nuevoSocio
	 * @return
	 */
	public AuthResponse registerAdmin(Socio nuevoSocio);
}
