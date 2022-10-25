package gestorAplicacion.Hija;
import gestorAplicacion.Padre.*;

import java.util.ArrayList;


//Los contactos locales son personas con las que ya se inicio una convesacion
class ContactosLocales extends Contacto{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Mensaje> mensajes;

	//Genera los contactos locales con la capacidad de recibir mensajes
	ContactosLocales(String nombre, String email, String nombreCompleto) {
		super(nombre, email, nombreCompleto);
		mensajes = new ArrayList<Mensaje>();
	}

	ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}

	void setMensajes(ArrayList<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	protected String getNombre() {
		return super.getNombre();
	}

	@Override
	protected void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	@Override
	protected String getEmail() {
		return super.getEmail();
	}

	@Override
	protected void setEmail(String email) {
		super.setEmail(email);
	}

	@Override
	protected String getNombreCompleto() {
		return super.getNombreCompleto();
	}

	@Override
	protected void setNombreCompleto(String nombreCompleto) {
		super.setNombreCompleto(nombreCompleto);
	}
	
}
