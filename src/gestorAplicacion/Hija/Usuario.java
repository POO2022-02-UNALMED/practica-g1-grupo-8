package gestorAplicacion.Hija;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String email;
    private String nombreCompleto;

    private ArrayList<TargetaSocial> targetasSociales;

    private ArrayList<TargetaNegocio> targetasNegocios;
    private String logoNegocio;
    private String descripcionNegocio;
    private String terminosNegocio;
    private Notificacion notificacion;
    private ContactoUsuario contactoUsuario;
    private ArrayList<ContactosLocales> contactosLocales;
    private ArrayList<ContactoPendientes> contactosPendientes;


    //Genera al usuario
    Usuario(String nombre, String email, String nombreCompleto, String logoNegocio, String descripcionNegocio,
            String terminosNegocio) {
        this.nombre = nombre;
        this.email = email;
        this.nombreCompleto = nombreCompleto;
        this.logoNegocio = logoNegocio;
        this.descripcionNegocio = descripcionNegocio;
        this.terminosNegocio = terminosNegocio;
        //la siguite linea necesita modificacion
        this.notificacion = new Notificacion();
        //Crea su propio contacto
        this.contactoUsuario = new ContactoUsuario(this);
        this.contactosLocales = new ArrayList<ContactosLocales>();
        this.contactosPendientes = new ArrayList<ContactoPendientes>();
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

    public String getLogoNegocio() {
        return logoNegocio;
    }

    public void setLogoNegocio(String logoNegocio) {
        this.logoNegocio = logoNegocio;
    }

    public String getDescripcionNegocio() {
        return descripcionNegocio;
    }

    public void setDescripcionNegocio(String descripcionNegocio) {
        this.descripcionNegocio = descripcionNegocio;
    }

    public String getTerminosNegocio() {
        return terminosNegocio;
    }

    public void setTerminosNegocio(String terminosNegocio) {
        this.terminosNegocio = terminosNegocio;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public ContactoUsuario getContactoUsuario() {
        return contactoUsuario;
    }

    public  void setContactoUsuario(ContactoUsuario contactoUsuario) {
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
