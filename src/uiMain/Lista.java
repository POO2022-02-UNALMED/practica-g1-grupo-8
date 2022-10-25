package uiMain;

import baseDatos.CargarImpl;
import baseDatos.GuardarImpl;
import gestorAplicacion.Hija.ListaUsuario;

public class Lista {
	public static ListaUsuario inicializar() {
	CargarImpl p=new CargarImpl();
	if ((ListaUsuario) p.cargar()==null) {
		GuardarImpl sf=new GuardarImpl();
		ListaUsuario mm=new ListaUsuario();
		sf.crear(mm);
		CargarImpl f=new CargarImpl();
		return (ListaUsuario) f.cargar();
	}
	else {
		return (ListaUsuario) p.cargar();
	}
	}
	
}
