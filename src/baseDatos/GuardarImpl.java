package baseDatos;

import baseDatos.interfaces.*;
import gestorAplicacion.Hija.Usuario;

import java.io.*;

public class GuardarImpl implements RepositorioGuardar<Usuario> {

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

    
}
