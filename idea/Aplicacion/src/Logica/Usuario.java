package Logica;

import java.util.ArrayList;

class Usuario {
	private String nombre;
	private String email;
	private String nombreCompleto;
	private String logoNegocio;
	private String descripcionNegocio;
	private String terminosNegocio;
	private Notificacion notificacion;
	private ContactoUsuario contactoUsuario;
	private ArrayList<ContactosLocales> contactosLocales;
	private ArrayList<ContactosPendientes> contactosPendientes;

	protected Usuario(String nombre, String email, String nombreCompleto, String logoNegocio, String descripcionNegocio,
			String terminosNegocio) {
		this.nombre = nombre;
		this.email = email;
		this.nombreCompleto = nombreCompleto;
		this.logoNegocio = logoNegocio;
		this.descripcionNegocio = descripcionNegocio;
		this.terminosNegocio = terminosNegocio;
		this.notificacion = new Notificacion();
		this.contactoUsuario = new ContactoUsuario(this);
		this.contactosLocales = new ArrayList<ContactosLocales>();
		this.contactosPendientes = new ArrayList<ContactosPendientes>();
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

	protected String getLogoNegocio() {
		return logoNegocio;
	}

	protected void setLogoNegocio(String logoNegocio) {
		this.logoNegocio = logoNegocio;
	}

	protected String getDescripcionNegocio() {
		return descripcionNegocio;
	}

	protected void setDescripcionNegocio(String descripcionNegocio) {
		this.descripcionNegocio = descripcionNegocio;
	}

	protected String getTerminosNegocio() {
		return terminosNegocio;
	}

	protected void setTerminosNegocio(String terminosNegocio) {
		this.terminosNegocio = terminosNegocio;
	}

	protected Notificacion getNotificacion() {
		return notificacion;
	}

	protected void setNotificacion(Notificacion notificacion) {
		this.notificacion = notificacion;
	}

	protected ContactoUsuario getContactoUsuario() {
		return contactoUsuario;
	}

	protected void setContactoUsuario(ContactoUsuario contactoUsuario) {
		this.contactoUsuario = contactoUsuario;
	}

	protected ArrayList<ContactosLocales> getContactosLocales() {
		return contactosLocales;
	}

	protected void setContactosLocales(ArrayList<ContactosLocales> contactosLocales) {
		this.contactosLocales = contactosLocales;
	}

	protected ArrayList<ContactosPendientes> getContactosPendientes() {
		return contactosPendientes;
	}

	protected void setContactosPendientes(ArrayList<ContactosPendientes> contactosPendientes) {
		this.contactosPendientes = contactosPendientes;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", email=" + email + ", nombreCompleto=" + nombreCompleto
				+ ", logoNegocio=" + logoNegocio + ", descripcionNegocio=" + descripcionNegocio + ", terminosNegocio="
				+ terminosNegocio + ", notificacion=" + notificacion + ", contactoUsuario=" + contactoUsuario
				+ ", contactosLocales=" + contactosLocales + ", contactosPendientes=" + contactosPendientes + "]";
	}
	
}
