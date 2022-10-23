package gestorAplicacion.Hija;

import gestorAplicacion.Padre.Contactos;



/**
 * Clase contenedora de la informacion de un contacto almacenado en un dispositivo
 */
public class ContactosLocales extends Contactos {
	public ContactosLocales(Usuario usuario, String telefono, String nombreContacto) {
		super(usuario, telefono, nombreContacto);
	}
}
