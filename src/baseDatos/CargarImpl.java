package baseDatos;

import baseDatos.interfaces.*;
import gestorAplicacion.Hija.*;
import java.io.*;

public class CargarImpl implements RepositorioCargar {
	@Override
	public ListaUsuario cargar() {
        try {
            FileInputStream fi;
            fi= new FileInputStream("src\\baseDatos\\temp\\listausuario");
            ObjectInputStream oi = new ObjectInputStream(fi);

            ListaUsuario usuario = (ListaUsuario) oi.readObject();
            //devolver el valor
            fi.close();
            oi.close();
            return usuario;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		return null;}
}
