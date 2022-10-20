package gestorAplicacion.Padre;

import gestorAplicacion.Hija.Usuario;

public class Contactos {
	private Integer NumeroID;
	private Usuario usuario;
	private String email;
	private String nombreCompleto;
	
	public Contactos(Integer numeroid, Usuario usuario, String email, String nombreCompleto) {
		this.NumeroID=numeroid;
		this.usuario=usuario;
		this.email=email;
		this.nombreCompleto=nombreCompleto;
	}
	public Integer getNumeroID() {
		return this.NumeroID;
	}
	public void setNumeroID(Integer s) {
		this.NumeroID=s;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario=usuario;
	} 
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getNombreCompleto() {
		return this.nombreCompleto;
	}
	public void setNombreCompleto(String nombrecompleto) {
		this.nombreCompleto=nombrecompleto;
	}
}
