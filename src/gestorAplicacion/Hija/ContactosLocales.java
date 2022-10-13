package gestorAplicacion.Hija;

import gestorAplicacion.Padre.Contacto;

public class ContactosLocales extends Contacto {
	private String Email;
	private String NombreCompleto;

	public ContactosLocales(Integer numeroid,Usuario usuario,String email,String nombrecompleto) {
		super(numeroid,usuario);
		this.Email=email;
		this.NombreCompleto=nombrecompleto;
	}
	
	public String getEmail() {
		return this.Email;
	}
	
	public void setEmail(String cambiar) {
		this.Email=cambiar;
	}
	
	public String getNombreCompleto() {
		return this.NombreCompleto;
	}
	
	public void setNombreCompleto(String cambiar) {
		this.NombreCompleto=cambiar;
	}
	
}
