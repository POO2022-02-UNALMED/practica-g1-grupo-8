package gestorAplicacion.Padre;
import java.util.ArrayList;
import gestorAplicacion.Hija.Usuario;
import gestorAplicacion.Hija.TarjetaSocial;
import gestorAplicacion.Hija.TarjetaNegocio;
public abstract class ContactoTarjetas extends Contacto {
	private ArrayList<TarjetaSocial> TarjetasSociales;
	private ArrayList<TarjetaNegocio> TarjetasNegocios;
	public ContactoTarjetas(Integer numeroid,Usuario usuario,String email,String nombrecompleto) {
		super(numeroid,usuario,email,nombrecompleto);
		this.TarjetasNegocios=new ArrayList<TarjetaNegocio>();
		this.TarjetasSociales=new ArrayList<TarjetaSocial>();
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
