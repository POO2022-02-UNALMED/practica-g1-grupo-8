package gestorAplicacion.Hija;

import java.util.ArrayList;

public class NotificacionTarjeta {
	private ArrayList<TarjetaSocial> tarjetasSocialesLeido;
	private ArrayList<TarjetaNegocios> tarjetasNegociosLeido;
	private ArrayList<TarjetaSocial> tarjetasSocialesNoLeido;
	private ArrayList<TarjetaNegocios> tarjetasNegociosNoLeido
	
	public NotificacionTarjeta(ArrayList<TarjetaSocial> tarjetasSociales,
			ArrayList<TarjetaNegocios> tarjetasNegociosLeido,
			ArrayList<TarjetaSocial> tarjetasSocialesNoLeido,
			ArrayList<TarjetaNegocios> tarjetasNegociosNoLeido) {
		
		this.tarjetasSocialesLeido = tarjetasSocialesLeido;
		this.tarjetasNegociosLeido = tarjetasNegociosLeido;
		this.tarjetasSocialesNoLeido = tarjetasSocialesNoLeido;
		this.tarjetasNegociosNoLeido = tarjetasNegociosNoLeido;
	}
	
	public ArrayList<TarjetaSocial> getTarjetasSocialesLeido(){
		return tarjetasSocialesLeido;
	}
	public ArrayList<TarjetaNegocios> getTarjetasNegociosLeido(){
		return tarjetasNegociosLeido;
	}
	public ArrayList<TarjetaSocial> getTarjetasSocialesNoLeido(){
		return tarjetasSocialesNoLeido;
	}
	public ArrayList<TarjetaNegocios> getTarjetasNegociosNoLeido(){
		return tarjetasNegociosNoLeidos;
	}
	
	
	public void setTarjetasSocialesLeido(ArrayList<TarjetaSocial> tarjetasSocialesLeido) {
		this.tarjetasSocialesLeido = tarjetasSocialesLeido;
	}
	public void setTarjetasNegociosLeido(ArrayList<TarjetaNegocios> tarjetasNegociosLeido) {
		this.tarjetasNegociosLeido = tarjetasNegociosLeido;
	}
	public void setTarjetasSocialesNoLeido(ArrayList<TarjetaSocial> tarjetasSocialesNoLeido) {
		this.tarjetasSocialesNoLeido = tarjetasSocialesNoLeido;
	}
	public void setTarjetasNegociosNoLeido(ArrayList<TarjetaNegocios> tarjetasNegociosNoLeido) {
		this.tarjetasNegociosNoLeido = tarjetasNegociosNoLeido
	}
}
