package gestorAplicacion.Padre;

import gestorAplicacion.Hija.Usuario;

public class Contactos {


	private Usuario usuario;
	private String telefono;
	private String nombreContacto;

	public Contactos(Usuario usuario, String telefono, String nombreContacto) {
		this.telefono = telefono;
		this.nombreContacto = nombreContacto;
		this.usuario=usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario=usuario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
}
