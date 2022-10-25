package baseDatos;

import baseDatos.interfaces.*;
import gestorAplicacion.Hija.*;

import java.io.*;

public class GuardarImpl implements RepositorioGuardar<Usuario> {

    @Override
    public void crear(ListaUsuario objeto) {
        try {
            FileOutputStream fileOutputStream;
            fileOutputStream= new FileOutputStream("\\baseDatos\\temp\\listausuario");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objeto);

            fileOutputStream.close();
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
