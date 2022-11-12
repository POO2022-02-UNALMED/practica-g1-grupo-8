package uiMain;

import java.util.Scanner;

import baseDatos.CargarImpl;
import baseDatos.GuardarImpl;
import baseDatos.interfaces.RepositorioGuardar;
import gestorAplicacion.Hija.ListaUsuario;
import gestorAplicacion.Hija.Usuario;

public class Lista {


	private static boolean elementos = true;



	public static ListaUsuario inicializar() {
	CargarImpl p=new CargarImpl();
	//ListaUsuario l=p.cargar();
	/*if (l.getListaUsuario().size()==0) {
		GuardarImpl sf=new GuardarImpl();
		ListaUsuario mm=new ListaUsuario();
		//sf.crear(mm);
		CargarImpl f=new CargarImpl();
		elementos=false;
		//return (ListaUsuario) f.cargar();
	}
	else {
		elementos=true;
		//return (ListaUsuario) p.cargar();
	}*/
	return null;
	}
	public static boolean iniciar() {
	return elementos;
}

	/**
	 * Se crear un usuario y se almacena localmente
	 * @param sc Recibe como referencia el scanner
	 * @param listaUsuario Recibe como referencia el objecto lista usuario para se modificado
	 */
	public static void crearUsuario(Scanner sc, ListaUsuario listaUsuario) {
		RepositorioGuardar repositorioGuardar =new GuardarImpl();
		System.out.println("Usuario para negocio o personal");
		System.out.println("Negocio= 0");
		System.out.println("Personal= 1");
		System.out.println("Opcion: ");
		int desicion = Integer.parseInt(sc.nextLine());

		String nombre;
		String email;
		String nombreCompleto;
		String logoNegocio= "";
		String descripcionNegocio= "";
		String terminosNegocio= "";

		if (desicion == 0) {
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Email: ");
			email = sc.nextLine();
			System.out.println("Nombre completo: ");
			nombreCompleto = sc.nextLine();
			System.out.println("Logo Negocio: ");
			logoNegocio = sc.nextLine();
			System.out.println("Descripcion de Negocio: ");
			descripcionNegocio = sc.nextLine();
			System.out.println("Terminos Negocio");
			terminosNegocio = sc.nextLine();
		} else {
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Email: ");
			email = sc.nextLine();
			System.out.println("Nombre completo: ");
			nombreCompleto = sc.nextLine();
		}
		Usuario usuario =new Usuario(nombre,email,nombreCompleto, logoNegocio, descripcionNegocio, terminosNegocio);
		listaUsuario.añadirUsuario(usuario);
		repositorioGuardar.crear(listaUsuario);
		System.out.println("Usuario creado y almacenado.");

}
	public static Usuario cual(ListaUsuario f) {
	Scanner sc = new Scanner(System.in);

	if(f.getListaUsuario().size()==0) {
		//Lista.crearUsuario(f);
		CargarImpl p=new CargarImpl();
		//ListaUsuario f1=p.cargar();
		//return Lista.cual(f1);
	}
	
	else {
	System.out.println("Escoge un usuario");
	System.out.println("0 Crear un nuevo usuario");
	f.toString();
	int usuaario= sc.nextInt();
	if (usuaario==0) {
		//Lista.crearUsuario(f);
		//return Lista.cual(f);
	}
	else{
		///return f.usuario(usuaario);
	}}
	return null;
	}
}

