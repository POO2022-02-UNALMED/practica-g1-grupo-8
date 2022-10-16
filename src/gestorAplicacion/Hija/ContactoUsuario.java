package gestorAplicacion.Hija;

import gestorAplicacion.Padre.ContactoBoolean;
public class ContactoUsuario extends ContactoBoolean {
	private String numeroTelefonoContacto;
	
	public ContactoUsuario(Integer numeroId, Usuario usuario,String nombreContacto,String numeroTelefonoContacto) {
		super(numeroId,usuario,nombreContacto);
		this.numeroTelefonoContacto=numeroTelefonoContacto;
	}
	
	public String getNumeroTelefonoContacto() {
		return this.numeroTelefonoContacto;
	}
	
	public void setNumeroTelefonoContacto(String cambiar) {
		this.numeroTelefonoContacto=cambiar;
	}

}
