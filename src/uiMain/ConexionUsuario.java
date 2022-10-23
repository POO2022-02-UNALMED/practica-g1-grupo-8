package uiMain;

import java.util.Scanner;
import gestorAplicacion.hija.Usuario;
import gestorAplicacion.padre.Mensaje;

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
	
	//TODO falta serializar
		//Permite seleccionar un contacto para iniciar una conversacion.
	public void empezarChat(Scanner sc) {
		int opcion;
		do {
			System.out.println("Elige un contacto");
			System.out.println("0 cancelar");
			//Imprime todos los contactos locales con un indce al principio
			for (int i = 0; i < usuario.getContactosPendientes().size(); i++) {
				System.out.println((i+1) + " " + usuario.getContactoPendiente(i).toString());
			}
			opcion = sc.nextInt();
			sc.nextLine();
			
			//Revisa si se selecciono un contacto y se realiza en cambio.
			if ((opcion > 0) && (opcion <= usuario.getContactosPendientes().size())) {
				usuario.volverContactoLocal(opcion - 1);
				//TODO
				crearMensaje(sc);
				
			} else if (opcion != 0) {
				System.out.println("Seleccione un numero entre 0 y " + usuario.getContactosPendientes().size());
				
			} else {
				System.out.println("Termino empezar chat");
				
			}
			
		} while (opcion != 0);
		
	}
	
	//TODO falta serializar
	//Crea un mensaje social o local, segun la decision del usuario
	public void crearMensaje(Scanner sc) {
		int opcion;
		String titulo;
		String cuerpo;
		System.out.print("Titulo: ");
		titulo = sc.nextLine();
		System.out.print("Cuerpo: ");
		cuerpo = sc.nextLine();
		System.out.println("Elige el tipo de mensaje:\n0 negocios\n1 Social");
		opcion = sc.nextInt();
		sc.nextLine();
		do {
			switch (opcion) {
				case 0:
					//crea y añade un mesaje de negocios al contacto recien creado
					usuario.anadirMensajeNegocio(titulo, cuerpo);
					break;
					
				case 1:
					//crea y añade un mesaje social al contacto recien creado
					usuario.anadirMensajeSocial(titulo, cuerpo);
					break;
					
				default:
					System.out.println("Seleccione un numero entre 0 o 1");
					break;
			}
		} while (opcion != 0 && opcion != 1);
		
	}
	
	public void mostrarChats() {
		System.out.println(usuario.mostrarChats());
	}
}

