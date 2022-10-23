package gestorAplicacion.hija;

import java.util.ArrayList;
import gestorAplicacion.padre.Mensaje;

//Descrive al usuario del programa
public class Usuario {
	private ContactoUsuario contactoUsuario;
	private ArrayList<ContactosLocales> contactosLocales;
	private ArrayList<ContactosPendientes> contactosPendientes;

	//Genera al Usuario y crea su ContactoUsuario
	public Usuario(String nombre, String email, String nombreCompleto, String logoNegocio, String descripcionNegocio,
			String terminosNegocio) {
		this.contactoUsuario = new ContactoUsuario(nombre, email, nombreCompleto, logoNegocio, descripcionNegocio,
				terminosNegocio);
		this.contactosLocales = new ArrayList<ContactosLocales>();
		this.contactosPendientes = new ArrayList<ContactosPendientes>();
	}

	//FIXME
	@Override
	public String toString() {
		return "Usuario [contactoUsuario=" + contactoUsuario + ", contactosLocales=" + contactosLocales
				+ ", contactosPendientes=" + contactosPendientes + "]";
	}

	//TODO falta serializar
	//Añade un nuevo contacto al array de contactos pendites
	public void crearNuevoContacto(String nombre, String email, String nombreCompleto) {
		//Llama al metodo de clase crear contacto de pendientes que devuelve un contacto 
		contactosPendientes.add(new ContactosPendientes(nombre, email, nombreCompleto));
	}
	
	//TODO falta serializar
	//Permite seleccionar un chat para seguir una conversacion
	/*public void seguirChat(Scanner sc) {
		int opcion;
		ContactosLocales contactoL;
		do {
			System.out.println("Elige un contacto");
			System.out.println("0 cancelar");
			//Imprime todos los contactos locales con un indce al principio
			for (int i = 0; i < contactosLocales.size(); i++) {
				System.out.println((i+1) + " " + contactosLocales.get(i).toString());
			}
			opcion = sc.nextInt();
			sc.nextLine();
			
			//Revisa si se selecciono un contacto y se realiza en cambio.
			if ((opcion > 0) && (opcion <= contactosLocales.size())) {
				contactoL = contactosLocales.get(opcion - 1);
				System.out.println("email: " + contactoL.getEmail());
				System.out.println("Mensajes");
				for (Mensaje m: contactoL.getMensajes()) {
					System.out.println(m);
				}
					
				contactoL.getMensajes().add(crearMensaje(sc, contactoL.getNombre(),
						contactoL.getNombreCompleto()));
				
			} else if (opcion != 0) {
				System.out.println("Seleccione un numero entre 0 y " + contactosLocales.size());
				
			} else {
				System.out.println("Termino seguir chat");
				
			}
			
		} while (opcion != 0);
		
	}*/
	
	//Depende del metodo empezarChat para optener el indice del contacto
	//vuele un contacto pendiente en local
	public void volverContactoLocal(int indice) {
		ContactosPendientes contactoP = contactosPendientes.remove(indice);
		ContactosLocales contactoL = new ContactosLocales(contactoP.getNombre(), contactoP.getEmail(),
				contactoP.getNombreCompleto());
		contactosLocales.add(contactoL);
	}
	
	//le agrega un mensaje de negocios al contacto local recien creado
	public void anadirMensajeNegocio(String titulo, String cuerpo) {
		int l = contactosLocales.size() - 1;
		contactosLocales.get(l).getMensajes().add(
			new MensajeNegocio(titulo, cuerpo, contactoUsuario.getLogoNegocio(),
					contactoUsuario.getDescripcionNegocio(), contactoUsuario.getTerminosNegocio(),
					contactoUsuario.getNombreCompleto(), contactosLocales.get(l).getNombreCompleto())
		);
	}
	
	//le agrega un mensaje social al contacto local recien creado
	public void anadirMensajeSocial(String titulo, String cuerpo) {
		int l = contactosLocales.size() - 1;
		contactosLocales.get(l).getMensajes().add(
				new MensajeSocial(titulo, cuerpo, contactoUsuario.getNombre(), contactosLocales.get(l).getNombre())
		);
	}
	
	//Muestra los chat con cada contacto local
	//Cada chat se divide en targetas sociales y de negocios
	public String mostrarChats() {
		String texto = "";
		for(ContactosLocales c: contactosLocales) {
			texto += "email: " + c.getEmail() + "\n";
			texto += "Mensajes: " + "\n";
			for (Mensaje m: c.getMensajes()) {
				texto += m + "\n";
			}
			
		}
		
		return texto;
		
	}
	
	public Object getContactoPendiente(int i) {
		return contactosPendientes.get(i);
	}

	public ContactoUsuario getContactoUsuario() {
		return contactoUsuario;
	}

	public void setContactoUsuario(ContactoUsuario contactoUsuario) {
		this.contactoUsuario = contactoUsuario;
	}

	public ArrayList<ContactosLocales> getContactosLocales() {
		return contactosLocales;
	}

	public void setContactosLocales(ArrayList<ContactosLocales> contactosLocales) {
		this.contactosLocales = contactosLocales;
	}

	public ArrayList<ContactosPendientes> getContactosPendientes() {
		return contactosPendientes;
	}

	public void setContactosPendientes(ArrayList<ContactosPendientes> contactosPendientes) {
		this.contactosPendientes = contactosPendientes;
	}
		
}
