package gestorAplicacion.Hija;

import gestorAplicacion.Padre.ContactoTarjetas;

public class ContactosPendientes extends ContactoTarjetas {

private String EmailContacto;
	
	public ContactosPendientes(Integer numeroid,Usuario usuario,String nombrecontacto,String emailcontacto) {
		super(numeroid,usuario,nombrecontacto);
		this.EmailContacto=emailcontacto;
	}
	
	public String getEmailContacto() {
		return this.EmailContacto;
	}
	
	public void setEmailContacto(String cambiar) {
		this.EmailContacto=cambiar;
	}
}
