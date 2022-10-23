package gestorAplicacion.Hija;

import gestorAplicacion.Padre.Contactos;

import java.util.ArrayList;

//Contacto del Usuario, contiene los mensajes enviados a si mismo
class ContactoUsuario extends Contactos {
	private Usuario contacto;

	//Al momento de ser el creado contacto de Usuario toma los atributos del Usuario
	protected ContactoUsuario(Usuario usuario, String telefono, String nombreContacto, Usuario contacto) {
		super(usuario, telefono, nombreContacto);
		this.contacto = contacto;
	}

	public Usuario getContacto() {
		return contacto;
	}

	public void setContacto(Usuario contacto) {
		this.contacto = contacto;
	}


}
