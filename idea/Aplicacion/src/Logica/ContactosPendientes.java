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
	
	protected static ContactosPendientes crearContactoPendiente(Scanner sc, Scanner scl) {
		System.out.println("Crear Contacto");
		System.out.print("Nombre: ");
		String nombre = scl.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Nombre completo: ");
		String nombreCompleto = sc.nextLine();
		return new ContactosPendientes(nombre, email, nombreCompleto);
	}
}
