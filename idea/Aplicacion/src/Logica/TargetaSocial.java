package Logica;

//La Targetas sociales son mensajes informales, tienen el nombre del emisor y receptor.
class TargetaSocial extends Targeta{
	private String nombreA;
	private String nombreB;
	
	//AL  crear un mesaje se tomar los atributos que se definieron en las instacias contacto
	protected TargetaSocial(String titulo, String cuerpo, ContactoUsuario contactoA, Contacto contactoB) {
		super(titulo, cuerpo, contactoA.getEmail(), contactoB.getEmail());
		this.nombreA = contactoA.getNombre();
		this.nombreB = contactoB.getNombre();
	}
	
	//El mensaje puede estar sin cuerpo, ni titulo
	protected TargetaSocial(ContactoUsuario contactoA, Contacto contactoB) {
		super(contactoA.getEmail(), contactoB.getEmail());
		this.nombreA = contactoA.getNombre();
		this.nombreB = contactoB.getNombre();
	}
	

	protected String getNombreA() {
		return nombreA;
	}

	protected void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}

	protected String getNombreB() {
		return nombreB;
	}

	protected void setNombreB(String nombreB) {
		this.nombreB = nombreB;
	}

}
