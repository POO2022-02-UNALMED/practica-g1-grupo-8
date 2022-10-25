package uiMain;

import java.util.Scanner;

import baseDatos.*;
import gestorAplicacion.Hija.*;
//El main del programa
public class Pantalla {

	public static void main(String[] args) {
		//Crea la conexion con usuario y contacto de usuario
		Scanner sc = new Scanner(System.in);
		GuardarImpl guardar=new GuardarImpl();
		CargarImpl cargar=new CargarImpl();
		ListaUsuario f = Lista.inicializar();
		System.out.println("Programa");
		if (Lista.iniciar()==true) {
			Lista.cual(sc, f);
		}
			
		else{
			f=null;
			System.out.println("No tienes un usuario");
			System.out.println("crea uno");
			ListaUsuario f1 =new ListaUsuario();
			Lista.crearUsuario(sc,f1);
			Lista.cual(sc, f1);
		}
		ConexionContactoUsuario ccu = new ConexionContactoUsuario();
		ConexionUsuario cu = new ConexionUsuario();
		int opcion;
		do {
			System.out.println("Opciones:\n\t0. Salir\n\t1. Modificar perfil\n\t2. Agregar Contacto"
					+ "\n\t3. Empezar conversacion\n\t4. Mostrar chats\n\t5. Seguir conversacion"
					+ "\n\t6. Ver notificaciones \n\t7. Crear tarjeta negocio");
			System.out.print("\nOpcion: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			
			switch (opcion) {
				case 0:
					System.out.println("Fin del programa");
					break;
					
				case 1:
					ccu.editarPerfil(sc);
					break;
					
				case 2:
					cu.crearNuevoContacto(sc);
					break;
					
				case 3:
					cu.empezarChat(sc);
					break;
					
				case 4:
					cu.mostrarChats();
					break;
					
				case 5:
					cu.seguirChat(sc);
					break;
					
				case 6:
					ccu.verNotificaciones(sc);
					break;

				case 8: cu.crearTarjetaNegocio(sc);
					break;



				default:
					System.out.println("\tSeleccione un numero entre 0 y 7");
					break;	
			}
			
		}while (opcion != 0);
		sc.close();
	}
	
}
