package gestorAplicacion.Hija;

import gestorAplicacion.Padre.Contactoboolean;

public class ContactoUsuario extends Contactoboolean {
	private String NumeroTelefonoContacto;
	
	public ContactoUsuario(Integer numeroid,Usuario usuario,String nombrecontacto,String numerotelefono) {
		super(numeroid,usuario,nombrecontacto);
		this.NumeroTelefonoContacto=numerotelefono;
	}
	
	public String getNumeroTelefonoContacto() {
		return this.NumeroTelefonoContacto;
	}
	
	public void setNumeroTelefonoContacto(String cambiar) {
		this.NumeroTelefonoContacto=cambiar;
	}

}
