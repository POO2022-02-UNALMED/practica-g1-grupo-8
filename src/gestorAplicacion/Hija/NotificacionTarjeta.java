package gestorAplicacion.Hija;

import java.util.ArrayList;

public class NotificacionTarjeta {
	private ArrayList<TarjetaSocial> tarjetasSocialesLeido;
	private ArrayList<TarjetaNegocio> tarjetasNegociosLeido;
	private ArrayList<TarjetaSocial> tarjetasSocialesNoLeido;
	private ArrayList<TarjetaNegocio> tarjetasNegociosNoLeido;
	
	public NotificacionTarjeta(ArrayList<TarjetaSocial> tarjetasSocialesLeido,
			ArrayList<TarjetaNegocio> tarjetasNegociosLeido,
			ArrayList<TarjetaSocial> tarjetasSocialesNoLeido,
			ArrayList<TarjetaNegocio> tarjetasNegociosNoLeido) {
		
		this.tarjetasSocialesLeido = tarjetasSocialesLeido;
		this.tarjetasNegociosLeido = tarjetasNegociosLeido;
		this.tarjetasSocialesNoLeido = tarjetasSocialesNoLeido;
		this.tarjetasNegociosNoLeido = tarjetasNegociosNoLeido;
	}
	
	public ArrayList<TarjetaSocial> getTarjetasSocialesLeido(){
		return tarjetasSocialesLeido;
	}
	public ArrayList<TarjetaNegocio> getTarjetasNegociosLeido(){
		return tarjetasNegociosLeido;
	}
	public ArrayList<TarjetaSocial> getTarjetasSocialesNoLeido(){
		return tarjetasSocialesNoLeido;
	}
	public ArrayList<TarjetaNegocio> getTarjetasNegociosNoLeido(){
		return tarjetasNegociosNoLeido;
	}
	
	
	public void setTarjetasSocialesLeido(ArrayList<TarjetaSocial> tarjetasSocialesLeido) {
		this.tarjetasSocialesLeido = tarjetasSocialesLeido;
	}
	public void setTarjetasNegociosLeido(ArrayList<TarjetaNegocio> tarjetasNegociosLeido) {
		this.tarjetasNegociosLeido = tarjetasNegociosLeido;
	}
	public void setTarjetasSocialesNoLeido(ArrayList<TarjetaSocial> tarjetasSocialesNoLeido) {
		this.tarjetasSocialesNoLeido = tarjetasSocialesNoLeido;
	}
	public void setTarjetasNegociosNoLeido(ArrayList<TarjetaNegocios> tarjetasNegociosNoLeido) {
		this.tarjetasNegociosNoLeido = tarjetasNegociosNoLeido
	}
}
