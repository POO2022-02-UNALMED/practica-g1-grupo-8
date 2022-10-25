package gestorAplicacion.Padre;
import java.io.Serializable;

import gestorAplicacion.Hija.*;

//Todos los contactos tienen nombre, email y nombre completo
public abstract class Contacto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String email;
	private String nombreCompleto;
	private Usuario usuario;

	//Cada contacto debe tener nombre, email y nombre completo 
	public Contacto(String nombre, String email, String nombreCompleto) {
		this.nombre = nombre;
		this.email = email;
		this.nombreCompleto = nombreCompleto;
	}
	
	//Muetra describe el contacto
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", email=" + email + ", nombreCompleto=" + nombreCompleto + "]";
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getNombreCompleto() {
		return nombreCompleto;
	}

	protected void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public void enlazarUsuario(Usuario usuario) {
		this.setUsuario(usuario);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
