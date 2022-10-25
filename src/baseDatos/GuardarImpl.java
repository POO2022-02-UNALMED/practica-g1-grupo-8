package baseDatos;

import baseDatos.interfaces.*;
import gestorAplicacion.Hija.*;

import java.io.*;

public class GuardarImpl implements RepositorioGuardar<Usuario> {
	static File archivo =new File("");
    @Override
    public void crear(ListaUsuario objeto) {
    	
        try {
            FileOutputStream fileOutputStream;
            fileOutputStream= new FileOutputStream(new File(archivo.getAbsolutePath()+"/src/baseDatos/temp/listausuario"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objeto);

            
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
