package Logica;

class ContactosPendientes extends Contacto{
	private final String targeta;

	protected ContactosPendientes(String nombre, String email, String nombreCompleto) {
		super(nombre, email, nombreCompleto);
		this.targeta = "No hay mensajes";
	}

	protected String getTargeta() {
		return targeta;
	}

}
