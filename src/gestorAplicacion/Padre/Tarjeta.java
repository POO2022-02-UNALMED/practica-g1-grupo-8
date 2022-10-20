package gestorAplicacion.Padre;

import java.time.LocalDateTime;

public abstract class Tarjeta {
	private final LocalDateTime fecha;
	private String titulo;
	private String cuerpo;
	private String emailA;
	private String emailB;

	protected Tarjeta (String emailA, String emailB) {
		this.fecha = LocalDateTime.now();
		this.titulo = "Sin titulo";
		this.cuerpo = "Sin cuerpo";
		this.emailA = emailA;
		this.emailB = emailB;
	}

	protected Tarjeta(String titulo, String cuerpo, String emailA, String emailB) {
		this.fecha = LocalDateTime.now();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.emailA = emailA;
		this.emailB = emailB;
	}

	public String getEmailA() {
		return emailA;
	}

	public void setEmailA(String emailA) {
		this.emailA = emailA;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEmailB() {
		return emailB;
	}

	public void setEmailB(String emailB) {
		this.emailB = emailB;
	}

}