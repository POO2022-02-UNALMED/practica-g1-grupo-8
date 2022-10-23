package uiMain;

import java.util.Scanner;
import gestorAplicacion.hija.Usuario;

public class ConexionUsuario {
	public static Usuario usuario = new Usuario("Andres", "Andres@a.com", "Andres Alvarez Arcila",
			"Andidas", "No vendo zapatos...", "Solo efectivo");
	
	//Permite al Usuario crear un contacto de este tipo por consola.
	public void crearNuevoContacto(Scanner sc) {
		System.out.println(usuario.getContactosPendientes());
		System.out.println("Crear Contacto");
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		sc.nextLine();
		System.out.print("Nombre completo: ");
		String nombreCompleto = sc.nextLine();
		usuario.crearNuevoContacto(nombre, email, nombreCompleto);
		
	}

}

