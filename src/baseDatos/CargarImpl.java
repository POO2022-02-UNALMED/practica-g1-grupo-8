package baseDatos;

import baseDatos.interfaces.*;
import gestorAplicacion.Hija.*;
import java.io.*;

public class CargarImpl implements RepositorioCargar {

	@Override
	public ListaUsuario cargar() {
        try {
            FileInputStream fi = new FileInputStream("temp/listausuario");
            ObjectInputStream oi = new ObjectInputStream(fi);

            ListaUsuario usuario = (ListaUsuario) oi.readObject();
            fi.close();
            oi.close();
            return usuario;

        } catch (IOException e) {
            System.out.println("Archivo no encontrado. Debes crear uno nuevo.");
        } catch (ClassNotFoundException e) {
            System.out.println("Archivo no encontrado. Debes crear uno nuevo.");
        }
       return null; }
}
