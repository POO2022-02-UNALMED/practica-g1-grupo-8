package gestorAplicacion.Hija;

import gestorAplicacion.Padre.Contacto;

public class ContactosLocales extends Contacto {
	private String email;
	private String nombreCompleto;

	public ContactosLocales(Integer numeroId, Usuario usuario, String email,String nombreCompleto) {
		super(numeroId,usuario);
		this.email=email;
		this.nombreCompleto= nombreCompleto;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNombreCompleto() {
		return this.nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
}
