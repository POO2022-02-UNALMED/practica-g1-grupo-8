package gestorAplicacion.Padre;

import gestorAplicacion.Hija.Usuario;

public abstract class Tarjeta {
	private Integer numeroId;
	private Usuario usuario;
	private String sitioWeb; // este atributo es urlcompañia y sitioweb
	private String acerdaDe; // este atributo representa el acerca de mi y acerca de empresa
	
	public Tarjeta(Integer numeroId, Usuario usuario, String sitioWeb, String acerdaDe) {
		this.numeroId = numeroId;
		this.usuario = usuario;
		this.sitioWeb = sitioWeb;
		this.acerdaDe = acerdaDe;
	}
	
	public Integer getNumeroID() {
		return this.numeroId;
	}
	public void setNumeroID(Integer numeroId) {
		this.numeroId=numeroId;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getSitioWeb() {
		return sitioWeb;
	}
	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}
	
	public String getAcercaDe() {
		return acerdaDe;
	}
	public void setAcercaDe(String acercaDe) {
		this.acerdaDe=acercaDe;
	}
}
