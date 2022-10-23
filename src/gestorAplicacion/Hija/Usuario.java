package gestorAplicacion.Hija;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {
    private Integer id;
    private String nombre;
    private String email;
    private String nombreCompleto;
    private TarjetaSocial tarjetaSocial;
    private TarjetaNegocio tarjetaNegocio;
    private ArrayList<Notificacion> notificaciones;
    private ArrayList<ContactoUsuario> contactoUsuario;
    private ArrayList<ContactosLocales> contactosLocales;
    private ArrayList<ContactoPendientes> contactosPendientes;

    //Genera al usuario
    public Usuario(
            Integer id,
            String nombre,
            String email,
            String nombreCompleto,
            TarjetaSocial tarjetaSocial,
            TarjetaNegocio tarjetaNegocio,
            ArrayList<Notificacion> notificaciones,
            ArrayList<ContactoUsuario> contactoUsuario,
            ArrayList<ContactosLocales> contactosLocales,
            ArrayList<ContactoPendientes> contactosPendientes

    ) {
        this.id =  id;
        this.nombre = nombre;
        this.email = email;
        this.nombreCompleto = nombreCompleto;
        this.tarjetaSocial = tarjetaSocial;
        this.tarjetaNegocio = tarjetaNegocio;
        this.notificaciones = notificaciones;
        this.contactoUsuario = contactoUsuario;
        this.contactosLocales = contactosLocales;
        this.contactosPendientes = contactosPendientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TarjetaSocial getTarjetaSocial() {
        return tarjetaSocial;
    }

    public void setTarjetaSocial(TarjetaSocial tarjetaSocial) {
        this.tarjetaSocial = tarjetaSocial;
    }

    public TarjetaNegocio getTarjetaNegocio() {
        return tarjetaNegocio;
    }

    public void setTarjetaNegocio(TarjetaNegocio tarjetaNegocio) {
        this.tarjetaNegocio = tarjetaNegocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public ArrayList<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(ArrayList<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public ArrayList<ContactoUsuario> getContactoUsuario() {
        return contactoUsuario;
    }

    public void setContactoUsuario(ArrayList<ContactoUsuario> contactoUsuario) {
        this.contactoUsuario = contactoUsuario;
    }

    public ArrayList<ContactosLocales> getContactosLocales() {
        return contactosLocales;
    }

    public void setContactosLocales(ArrayList<ContactosLocales> contactosLocales) {
        this.contactosLocales = contactosLocales;
    }

    public ArrayList<ContactoPendientes> getContactosPendientes() {
        return contactosPendientes;
    }

    public void setContactosPendientes(ArrayList<ContactoPendientes> contactosPendientes) {
        this.contactosPendientes = contactosPendientes;
    }
}
