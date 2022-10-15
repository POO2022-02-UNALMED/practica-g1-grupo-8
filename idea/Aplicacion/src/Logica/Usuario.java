package Logica;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	protected void cambiarValores(Scanner sc) {
		int opcion;
		
		do {
			System.out.println(this);
			System.out.println("Cambiar:\n0 Cancela\n1 nombre\n2 email\n3 nombreCompleto\n4 logoNegocio\n5 descripcionNegocio"
					+ "\n6 terminosNegocio");
			opcion = sc.nextInt();
			
			switch (opcion) {
				case 0:
					System.out.println("Termino modificacion de Perfil");
					break;
					
				case 1:
					System.out.println("Nombre actual: " + getNombre());
					System.out.print("Nuevo nombre: ");
					setNombre(sc.next());
					break;
					
				case 2:
					System.out.println("Email actual: " + getEmail());
					System.out.print("Nuevo Email: ");
					setEmail(sc.next());
					break;
					
				case 3:
					System.out.println("Nombre completo actual: " + getNombreCompleto());
					System.out.print("Nuevo nombre completo: ");
					setNombreCompleto(sc.nextLine());
					break;
					
				case 4:
					System.out.println("Logo de negocio actual: " + getLogoNegocio());
					System.out.print("Nuevo logo de negocio: ");
					setLogoNegocio(sc.next());
					break;
					
				case 5:
					System.out.println("Descripcion de negocio actual: " + getDescripcionNegocio());
					System.out.print("Nueva descripcion de negocio: ");
					setDescripcionNegocio(sc.next());
					break;
					
				case 6:
					System.out.println("Terminos de negocio actual: " + getTerminosNegocio());
					System.out.print("Nuevo terminos de negocio: ");
					setTerminosNegocio(sc.next());
					break;
					
				default:
					System.out.println("Seleccione un numero entre 0 y 6");
					break;
					
			}
			
		}while (opcion != 0);

	}
	
}
