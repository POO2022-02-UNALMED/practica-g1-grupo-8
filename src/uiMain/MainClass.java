package uiMain;

import baseDatos.RepositorioImpl;
import baseDatos.interfaces.Repositorio;
import gestorAplicacion.Hija.TarjetaNegocio;
import gestorAplicacion.Hija.TarjetaSocial;
import gestorAplicacion.Hija.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;

public class MainClass {

    public static void main(String[] args) {
        Repositorio<Usuario> repositorio = new RepositorioImpl();
        Usuario usuario =
                new Usuario(
                        1,
                        "nombre",
                        "email",
                        "nCompleto",
                        new TarjetaSocial(),
                        new TarjetaNegocio(),
                        new ArrayList<>(),
                        new ArrayList<>(),
                        new ArrayList<>(),
                        new ArrayList<>());

        repositorio.crear(usuario);


    }
}
