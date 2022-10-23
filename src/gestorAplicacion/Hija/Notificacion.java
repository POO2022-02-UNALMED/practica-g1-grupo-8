package gestorAplicacion.Hija;


import java.io.Serializable;

class Notificacion implements Serializable {
	private Integer id;
	private Usuario usuario;
	private Usuario contacto;
	private String mensaje;

	public Notificacion(Integer id, Usuario usuario, Usuario contacto, String mensaje) {
		this.id = id;
		this.usuario = usuario;
		this.contacto = contacto;
		this.mensaje = mensaje;
	}

}
