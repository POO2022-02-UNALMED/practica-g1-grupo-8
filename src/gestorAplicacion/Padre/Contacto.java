package gestorAplicacion.Padre;

import gestorAplicacion.Hija.Usuario;

public class Contacto {
	private Integer NumeroID;
	private Usuario usuario;
	
	public Contacto(Integer numeroid,Usuario usuario) {
		this.NumeroID=numeroid;
		this.usuario=usuario;
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
}
