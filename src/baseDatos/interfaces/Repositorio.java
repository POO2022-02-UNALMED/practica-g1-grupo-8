package baseDatos.interfaces;

public interface Repositorio<T> {
    void crear(T objeto);
    void cargar();
}
