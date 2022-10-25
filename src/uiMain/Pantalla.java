package uiMain;

import java.util.Scanner;

import baseDatos.*;
import baseDatos.interfaces.RepositorioCargar;
import baseDatos.interfaces.RepositorioGuardar;
import gestorAplicacion.Hija.*;
//El main del programa
public class Pantalla {



	public static void main(String[] args) {



		//Inicializa el scanner
		Scanner sc = new Scanner(System.in);
		//cargar base de datos
		RepositorioCargar repositorioCargar = new CargarImpl();
		ListaUsuario usuarios = repositorioCargar.cargar();
		//repositorio guardar
		RepositorioGuardar repositorioGuardar =new GuardarImpl();


		if(usuarios != null && !usuarios.getListaUsuario().isEmpty()){
			System.out.println("Total usuarios: " + usuarios.getListaUsuario().size());
		} else {
			usuarios = new ListaUsuario();
			Lista.crearUsuario(sc, usuarios);
		}

		ConexionContactoUsuario ccu = new ConexionContactoUsuario(usuarios.usuario(0).getContactoUsuario());
		ConexionUsuario cu = new ConexionUsuario(usuarios.usuario(0));
		int opcion;
		do {
			System.out.println("Opciones:\n\t0. Salir\n\t1. Modificar perfil\n\t2. Agregar Contacto"
					+ "\n\t3. Empezar conversacion\n\t4. Mostrar chats\n\t5. Seguir conversacion"
					+ "\n\t6. Ver notificaciones \n\t7. Crear tarjeta negocio \n\t8. Mostrar tarjeta de negocio");
			System.out.print("\nOpcion: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			
			switch (opcion) {
				case 0:
					System.out.println("Fin del programa");
					repositorioGuardar.crear(usuarios);
					break;
					
				case 1:
					ccu.editarPerfil(sc);
					repositorioGuardar.crear(usuarios);
					break;
					
				case 2:
					cu.crearNuevoContacto(sc);
					repositorioGuardar.crear(usuarios);
					break;
					
				case 3:
					cu.empezarChat(sc);
					repositorioGuardar.crear(usuarios);
					break;
					
				case 4:
					cu.mostrarChats();
					repositorioGuardar.crear(usuarios);
					break;
					
				case 5:
					cu.seguirChat(sc);
					repositorioGuardar.crear(usuarios);
					break;
					
				case 6:
					ccu.verNotificaciones(sc);
					repositorioGuardar.crear(usuarios);
					break;

				case 7: cu.crearTarjetaNegocio(sc);
					repositorioGuardar.crear(usuarios);
					break;
				case 8: cu.imprimirTarjetaNegocio();
				case 9: cu.crearNotificacion(sc, usuarios);
					repositorioGuardar.crear(usuarios);
				case 10: cu.listarMensajesDeUsuarios(usuarios);


				default:
					System.out.println("\tSeleccione un numero entre 0 y 8");
					break;	
			}
			
		}while (opcion != 0);
		sc.close();

	}
	
}
