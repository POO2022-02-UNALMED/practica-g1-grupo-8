package Logica;

import java.util.Scanner;

public class Logica {
	private Usuario usuario;

	public Logica() {
		this.usuario = new Usuario("Andres", "Andres@a.com", "Andres Alvarez Arcila", "Andidas",
				"No vendo zapatos...", "Solo efectivo");
	}
	
	public void editarPerfil(Scanner sc, Scanner scl) {
		usuario.editarPerfil(sc, scl);
	}
	
	public void crearNuevoContacto(Scanner sc, Scanner sc1) {
		usuario.crearNuevoContacto(sc, sc1);
	}
	
	public void empezarChat(Scanner sc, Scanner scl) {
		usuario.empezarChat(sc, scl);
	}
}
