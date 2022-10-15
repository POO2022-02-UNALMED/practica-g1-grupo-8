package Logica;

import java.util.Scanner;

class ContactosPendientes extends Contacto{
	private final String targeta;

	protected ContactosPendientes(String nombre, String email, String nombreCompleto) {
		super(nombre, email, nombreCompleto);
		this.targeta = "No hay mensajes";
	}

	protected String getTargeta() {
		return targeta;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nContactosPendientes [targeta=" + targeta + "]";
	}

	protected static ContactosPendientes crearContactoPendiente(Scanner sc, Scanner scl) {
		System.out.println("Crear Contacto");
		System.out.print("Nombre: ");
		String nombre = scl.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Nombre completo: ");
		String nombreCompleto = scl.nextLine();
		ContactosPendientes contacto = new ContactosPendientes(nombre, email, nombreCompleto);
		System.out.println(contacto.toString());
		return contacto;
	}
}
