package baseDatos;

import baseDatos.interfaces.*;
import gestorAplicacion.Hija.Usuario;
import java.io.*;

public class CargarImpl implements RepositorioCargar {
	@Override
	public void cargar() {
        try {
            FileInputStream fi = new FileInputStream("usuario");
            ObjectInputStream oi = new ObjectInputStream(fi);

            Usuario usuario = (Usuario) oi.readObject();
            //devolver el valor

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }}
}
