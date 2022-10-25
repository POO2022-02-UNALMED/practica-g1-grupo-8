package gestorAplicacion.Hija;

import gestorAplicacion.Padre.*;

//Son mensajes informales
class MensajeSocial extends Mensaje{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreA;
	private String nombreB;
	
	//Crea mensaje con tilulo y cuerpo
	MensajeSocial(String titulo, String cuerpo, String nombreA, String nombreB) {
		super(titulo, cuerpo);
		this.nombreA = nombreA;
		this.nombreB = nombreB;
	}
	
	@Override
	public String toString() {
		return "MensajeSocial [titulo=" + this.getTitulo() + ", cuerpo=" + this.getCuerpo() 
		+ ", nombreA=" + getNombreA() + ", nombreB=" + getNombreB() + "]";
	}

	String getNombreA() {
		return nombreA;
	}

	String getNombreB() {
		return nombreB;
	}

}
