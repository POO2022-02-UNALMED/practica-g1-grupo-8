package baseDatos;

import baseDatos.interfaces.Repositorio;
import gestorAplicacion.Hija.Usuario;

import java.io.*;

public class RepositorioImpl implements Repositorio<Usuario> {

    @Override
    public void crear(Usuario objeto) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("usuario");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objeto);

            fileOutputStream.close();
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
        }
    }
}
