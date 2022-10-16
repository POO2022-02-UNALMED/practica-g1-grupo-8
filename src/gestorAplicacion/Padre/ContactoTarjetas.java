package gestorAplicacion.Padre;
import java.util.ArrayList;
public abstract class ContactoTarjetas extends Contacto {
	private ArrayList<TarjetaSocial> TarjetasSociales;
	private ArrayList<TarjetaNegocios> TarjetasNegocios;
	public ContactoTarjetas(Integer numeroid,Usuario usuario) {
		super(numeroid,usuario);
		this.TarjetasNegocios=new ArrayList<Tarjetanegocios>();
		this.TarjetasSociales=new ArrayList<TarjetaSocial>();
	}
	
	public ArrayList<TarjetaNegocios> getTarjetasNegocios() {
		return this.TarjetasNegocios;
	}
	public void setTarjetasNegocios(ArrayList<TarjetaNegocios> cambiar) {
		this.TarjetasNegocios=cambiar;
	}
	public ArrayList<TarjetaSocial> getTarjetasSociales() {
		return this.TarjetasSociales;
	}
	public void setTarjetasSociales(ArrayList<TarjetaSocial> cambiar) {
		this.TarjetasSociales=cambiar;
	}
}
