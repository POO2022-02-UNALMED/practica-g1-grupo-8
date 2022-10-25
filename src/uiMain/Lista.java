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
public static void crearUsuario(Scanner sc,ListaUsuario f) {
	GuardarImpl sf=new GuardarImpl();
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
	f.añadirUsuario(new Usuario(nombre,email,nombreCompleto,logoNegocio,descripcionNegocio,terminosnegocio));
	sf.crear(f);}
	else {
		System.out.println("Crear Usuario");
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Nombre completo: ");
		String nombreCompleto = sc.nextLine();
		f.añadirUsuario(new Usuario(nombre,email,nombreCompleto));
		sf.crear(f);
	}
}
public static Usuario cual(Scanner sc,ListaUsuario f) {
	if(f.getListaUsuario().size()==0) {
		Lista.crearUsuario(sc, f);
		CargarImpl p=new CargarImpl();
		ListaUsuario f1=p.cargar();
		return Lista.cual(sc,f1);
	}
	
	else {
	System.out.println("Escoge un usuario");
	System.out.println("0 Crear un nuevo usuario");
	f.toString();
	int usuaario=sc.nextInt();
	if (usuaario==0) {
		Lista.crearUsuario(sc,f);
		return Lista.cual(sc,f);
	}
	else{
		return f.usuario(usuaario);}}
}
}

