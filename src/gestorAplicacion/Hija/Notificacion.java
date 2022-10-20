package gestorAplicacion.Hija;

import java.util.ArrayList;

class Notificacion {
	private ArrayList<TargetaNegocio> targetasNegociosLeidas;
	private ArrayList<TargetaSocial> targetasSocialesLeidas;
	private ArrayList<TargetaNegocio> targetasNegociosNoLeidas;
	private ArrayList<TargetaSocial> targetasSocialesNoLeidas;

	protected Notificacion() {
		this.targetasNegociosLeidas = new ArrayList<TargetaNegocio>();
		this.targetasSocialesLeidas = new ArrayList<TargetaSocial>();
		this.targetasNegociosNoLeidas = new ArrayList<TargetaNegocio>();
		this.targetasSocialesNoLeidas = new ArrayList<TargetaSocial>();
	}

	protected ArrayList<TargetaNegocio> getTargetasNegociosLeidas() {
		return targetasNegociosLeidas;
	}

	protected void setTargetasNegociosLeidas(ArrayList<TargetaNegocio> targetasNegociosLeidas) {
		this.targetasNegociosLeidas = targetasNegociosLeidas;
	}

	protected ArrayList<TargetaSocial> getTargetasSocialesLeidas() {
		return targetasSocialesLeidas;
	}

	protected void setTargetasSocialesLeidas(ArrayList<TargetaSocial> targetasSocialesLeidas) {
		this.targetasSocialesLeidas = targetasSocialesLeidas;
	}

	protected ArrayList<TargetaNegocio> getTargetasNegociosNoLeidas() {
		return targetasNegociosNoLeidas;
	}

	protected void setTargetasNegociosNoLeidas(ArrayList<TargetaNegocio> targetasNegociosNoLeidas) {
		this.targetasNegociosNoLeidas = targetasNegociosNoLeidas;
	}

	protected ArrayList<TargetaSocial> getTargetasSocialesNoLeidas() {
		return targetasSocialesNoLeidas;
	}

	protected void setTargetasSocialesNoLeidas(ArrayList<TargetaSocial> targetasSocialesNoLeidas) {
		this.targetasSocialesNoLeidas = targetasSocialesNoLeidas;
	}

}
