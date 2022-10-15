package Intefaz;

import java.util.Scanner;
import Logica.Logica;

public class Main {

	public static void main(String[] args) {
		Logica logica = new Logica();
		int opcion;
		Scanner sc = new Scanner(System.in);
		Scanner scl = new Scanner(System.in);
		do {
			System.out.println("Programa");
			System.out.println("Opcion:\n0 salir\n1 modificarPerfil\n2 agregarContacto\n3 empezarConversacion");
			opcion = sc.nextInt();
			
			switch (opcion) {
				case 0:
					System.out.println("Se cerro el programa");
					break;
					
				case 1:
					logica.editarPerfil(sc, scl);
					break;
					
				case 2:
					logica.crearNuevoContacto(sc, scl);
					break;
					
				case 3:
					logica.empezarChat(sc, scl);
					break;
					
				default:
					System.out.println("Seleccione un numero entre 0 y 3");
					break;	
			}
		}while (opcion != 0);

	}
}
