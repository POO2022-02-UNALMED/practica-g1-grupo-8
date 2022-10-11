package gestorAplicacion.Padre;

public abstract class Tarjeta {
	private Integer NumeroID;
	private Usuario usuario;
	private String sitioweb; // este atriburo es urlcompañia y sitioweb
	private String AcercaDe; // este atributo representa el acerca de mi y acerca de empresa
	
	public Integer getNumeroID() {
		return this.NumeroID;
	}
	public void setNumeroID(Integer s) {
		this.NumeroID=s;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario=usuario;
	}
	public String getSitioWeb() {
		return sitioweb;
	}
	public void setSitioWeb(String acerca) {
		this.sitioweb=acerca;
	}
	
	public String getAcercaDe() {
		return AcercaDe;
	}
	public void setAcercaDe(String acerca) {
		this.AcercaDe=acerca;
	}
}
