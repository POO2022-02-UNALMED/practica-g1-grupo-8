package uiMain;

import java.util.Scanner;
import gestorAplicacion.hija.Usuario;

public class ConexionContactoUsuario {
	public static Usuario usuario = ConexionUsuario.usuario;
	
		//TODO falta serializar
		//Cambia los atributos del usuario, menos notificaciones y contactos
		void editarPerfil(Scanner sc) {
		int opcion;
		String respuesta;
		do {
			System.out.println(usuario.getContactoUsuario());
			System.out.println("Cambiar:\n0 Cancela\n1 nombre\n2 email\n3 nombreCompleto\n4 logoNegocio\n5 descripcionNegocio"
					+ "\n6 terminosNegocio");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
				case 0:
					System.out.println("Termino modificacion de Perfil");
					break;
					
				case 1:
					System.out.print("Nuevo nombre: ");
					respuesta = sc.nextLine();
					break;
					
				case 2:
					System.out.print("Nuevo Email: ");
					respuesta = sc.next();
					sc.nextLine();
					break;
						
				case 3:
					respuesta = sc.nextLine();
					break;
							
				case 4:
					System.out.print("Nuevo logo de negocio: ");
					respuesta = sc.nextLine();
					break;
						
				case 5:
					System.out.print("Nueva descripcion de negocio: ");
					respuesta = sc.nextLine();
					break;
						
				case 6:
					System.out.print("Nuevo terminos de negocio: ");
					respuesta = sc.nextLine();
					break;
						
				default:
					System.out.println("Seleccione un numero entre 0 y 6");
					break;	
			}
		}while (opcion != 0);
		//falta serializar
			
	}
}
