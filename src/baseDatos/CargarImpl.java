package baseDatos;

import baseDatos.interfaces.*;
import gestorAplicacion.Hija.Usuario;
import java.io.*;

public class CargarImpl implements RepositorioCargar {
	@Override
	public Usuario cargar() {
        try {
            FileInputStream fi;
            fi= new FileInputStream("\\baseDatos\\temp\\usuario");
            ObjectInputStream oi = new ObjectInputStream(fi);

            Usuario usuario = (Usuario) oi.readObject();
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
