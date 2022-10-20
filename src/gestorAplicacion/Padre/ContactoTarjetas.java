package gestorAplicacion.Padre;
import java.util.ArrayList;
import gestorAplicacion.Hija.Usuario;
import gestorAplicacion.Hija.TargetaSocial;
import gestorAplicacion.Hija.TargetaNegocio;
public abstract class ContactoTarjetas extends Contactos {
	private ArrayList<TargetaSocial> TarjetasSociales;
	private ArrayList<TargetaNegocio> TarjetasNegocios;
	protected ContactoTarjetas(Integer numeroid,Usuario usuario,String email,String nombrecompleto) {
		super(numeroid, usuario, email, nombrecompleto);
		this.TarjetasNegocios=new ArrayList<TargetaNegocio>();
		this.TarjetasSociales=new ArrayList<TargetaSocial>();
	}
	
	public ArrayList<TargetaNegocio> getTarjetasNegocios() {
		return this.TarjetasNegocios;
	}
	public void setTarjetasNegocios(ArrayList<TargetaNegocio> cambiar) {
		this.TarjetasNegocios=cambiar;
	}
	public ArrayList<TargetaSocial> getTarjetasSociales() {
		return this.TarjetasSociales;
	}
	public void setTarjetasSociales(ArrayList<TargetaSocial> cambiar) {
		this.TarjetasSociales=cambiar;
	}
}
