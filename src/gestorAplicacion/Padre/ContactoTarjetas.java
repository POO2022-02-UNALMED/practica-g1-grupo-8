package gestorAplicacion.Padre;
import java.util.ArrayList;

import gestorAplicacion.Hija.TarjetaSocial;
import gestorAplicacion.Hija.Usuario;
import gestorAplicacion.Hija.TarjetaNegocio;
public abstract class ContactoTarjetas extends Contactos {
	private ArrayList<TarjetaSocial> TarjetasSociales;
	private ArrayList<TarjetaNegocio> TarjetasNegocios;
	protected ContactoTarjetas(Usuario usuario, String telefono, String nombreContacto) {
		super(usuario, telefono, nombreContacto);
		this.TarjetasNegocios= new ArrayList<>();
		this.TarjetasSociales= new ArrayList<>();
	}
	
	public ArrayList<TarjetaNegocio> getTarjetasNegocios() {
		return this.TarjetasNegocios;
	}
	public void setTarjetasNegocios(ArrayList<TarjetaNegocio> cambiar) {
		this.TarjetasNegocios=cambiar;
	}
	public ArrayList<TarjetaSocial> getTarjetasSociales() {
		return this.TarjetasSociales;
	}
	public void setTarjetasSociales(ArrayList<TarjetaSocial> cambiar) {
		this.TarjetasSociales=cambiar;
	}
}
