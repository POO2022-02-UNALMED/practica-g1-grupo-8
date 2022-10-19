package gestorAplicacion.Hija;

import gestorAplicacion.Padre.ContactoTarjetas;
public class ContactoUsuario extends ContactoTarjetas {
	
	public ContactoUsuario(Integer numeroid,Usuario usuario,String email,String nombrecompleto) {
		super(numeroid,usuario,email,nombrecompleto);
	}

}
