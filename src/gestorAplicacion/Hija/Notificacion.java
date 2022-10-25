package gestorAplicacion.Hija;

import java.io.Serializable;

//Son los mensajes que el usuario se envia a si mismo
public class Notificacion implements Serializable {
	String titulo;
	String cuerpo;
	
	//La Notificacion tiene titulo y cuepo
	public Notificacion(String titulo, String cuerpo) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}
	
	@Override
	public String toString() {
		return "Notificacion [titulo=" + getTitulo() + ", cuerpo=" + getCuerpo() + "]";
	}



	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}


		
}
