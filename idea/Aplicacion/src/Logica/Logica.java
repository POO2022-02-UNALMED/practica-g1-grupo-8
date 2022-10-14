package Logica;

public class Logica {
	private Usuario usuario;

	public Logica() {
		this.usuario = new Usuario("Andres", "Andres@a.com", "Andres Alvarez Arcila", "Andidas",
				"No vendo zapatos...", "Solo efectivo");
	}

	public static void main(String[] args) {
		Logica logica = new Logica();
		System.out.print(logica.usuario);

	}

}
