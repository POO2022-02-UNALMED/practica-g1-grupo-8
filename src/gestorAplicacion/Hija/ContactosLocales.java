package gestorAplicacion.Hija;

import gestorAplicacion.Padre.Contactos;

public class ContactosLocales extends Contactos {
	private String tarjeta;

	public ContactosLocales(Integer numeroid,Usuario usuario,String email,String nombrecompleto,String tarjeta) {
		super(numeroid,usuario,email,nombrecompleto);
		this.tarjeta=tarjeta;
	}
	
	public String getTarjeta() {
		return this.tarjeta;
	}
	
	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}
}
