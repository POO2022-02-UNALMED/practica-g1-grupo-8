package gestorAplicacion.Hija;

import gestorAplicacion.Padre.ContactoTarjetas;
public class ContactoUsuario extends ContactoTarjetas {
	
	public ContactoUsuario(Integer numeroId, Usuario usuario,String numeroTelefonoContacto) {
		super(numeroId,usuario);
	}

}
