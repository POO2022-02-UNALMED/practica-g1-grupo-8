package baseDatos;

import baseDatos.interfaces.*;
import gestorAplicacion.Hija.*;
import java.io.*;

public class CargarImpl implements RepositorioCargar {
	static File archivo =new File("");
	@Override
	public ListaUsuario cargar() {
        try {
            FileInputStream fi;
            fi= new FileInputStream(archivo.getAbsolutePath()+"/src/baseDatos/temp/listausuario");
            ObjectInputStream oi = new ObjectInputStream(fi);

            ListaUsuario usuario = (ListaUsuario) oi.readObject();
            //devolver el valor
            fi.close();
            oi.close();
            System.out.println("cargado");
            return usuario;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("dd");
		return null;}
}
