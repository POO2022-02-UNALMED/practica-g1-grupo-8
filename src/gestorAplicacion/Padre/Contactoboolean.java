package gestorAplicacion.Padre;

public abstract class Contactoboolean extends Contacto {
	private boolean TarjetaPersonalCompartida;
	private boolean TarjetaSocialCompartida;
	private boolean TarjetaNegociosCompartida;
	private String NombreContacto;
	public Contactoboolean(Integer numeroid,Usuario usuario,String nombrecontacto) {
		super(numeroid,usuario);
		this.NombreContacto=nombrecontacto;
	}
	
	public boolean getTarjetaPersonalCompartida() {
		return this.TarjetaPersonalCompartida;
	}
	public void setTarjetaPersonalCompartida(boolean cambiar) {
		this.TarjetaPersonalCompartida=cambiar;
	}
	public boolean getTarjetaNegociosCompartida() {
		return this.TarjetaNegociosCompartida;
	}
	public void setTarjetaNegociosCompartida(boolean cambiar) {
		this.TarjetaNegociosCompartida=cambiar;
	}
	public boolean getTarjetaSocialCompartida() {
		return this.TarjetaSocialCompartida;
	}
	public void setTarjetaSocialCompartida(boolean cambiar) {
		this.TarjetaSocialCompartida=cambiar;
	}
	public String getNombreContacto() {
		return this.NombreContacto;
	}
	public void setNombreContacto(String cambiar) {
		this.NombreContacto=cambiar;
	}
}
