package baseDatos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import gestorAplicacion.Hija.Usuario;

public class CargarImpl {
	@Override
        try {
            FileInputStream fi = new FileInputStream("usuario");
            ObjectInputStream oi = new ObjectInputStream(fi);

            Usuario usuario = (Usuario) oi.readObject();
            //devolver el valor

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
}
