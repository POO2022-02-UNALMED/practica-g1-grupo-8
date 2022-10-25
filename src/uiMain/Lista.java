package uiMain;

import java.util.Scanner;

import baseDatos.CargarImpl;
import baseDatos.GuardarImpl;
import gestorAplicacion.Hija.ListaUsuario;
import gestorAplicacion.Hija.Usuario;

public class Lista {
	static boolean elementos=true;
	public static ListaUsuario inicializar() {
	CargarImpl p=new CargarImpl();
	if (p.cargar()==null) {
		GuardarImpl sf=new GuardarImpl();
		ListaUsuario mm=new ListaUsuario();
		sf.crear(mm);
		CargarImpl f=new CargarImpl();
		elementos=false;
		return (ListaUsuario) f.cargar();
	}
	else {
		elementos=true;
		return (ListaUsuario) p.cargar();
	}
	}
public static boolean  iniciar() {
	return elementos;
}
public static Usuario crearUsuario(Scanner sc) {
	System.out.println("Usuario para negocio o personal");
	System.out.println("negocio= 0");
	System.out.println("personal= 1");
	int desicion = sc.nextInt();
	if(desicion==0) {
	System.out.println("Crear Usuario");
	System.out.println("Nombre: ");
	String nombre = sc.nextLine();
	System.out.println("Email: ");
	String email = sc.nextLine();
	System.out.println("Nombre completo: ");
	String nombreCompleto = sc.nextLine();
	System.out.println("Logo Negocio: ");
	String logoNegocio = sc.nextLine();
	System.out.println("Descripcion de Negocio: ");
	String descripcionNegocio = sc.nextLine();
	System.out.println("Terminos Negocio");
	String terminosnegocio = sc.nextLine();
	return new Usuario(nombre,email,nombreCompleto,logoNegocio,descripcionNegocio,terminosnegocio);}
	else {
		System.out.println("Crear Usuario");
		System.out.println("Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.print("Nombre completo: ");
		String nombreCompleto = sc.nextLine();
		return new Usuario(nombre,email,nombreCompleto);
	}
}
public static Usuario cual(Scanner sc,ListaUsuario f) {
	if(f.getListaUsuario().size()==0) {
		return Lista.crearUsuario(sc);
	}
	
	else {
	System.out.println("Escoge un usuario");
	System.out.println("0 Crear un nuevo usuario");
	f.toString();
	int usuaario=sc.nextInt();
	if (usuaario==0) {
		f.añadirUsuario(Lista.crearUsuario(sc));
		return Lista.cual(sc,f);
	}
	else{
		return f.usuario(usuaario);}}
}
}

