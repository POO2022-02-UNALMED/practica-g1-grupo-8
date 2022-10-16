package gestorAplicacion.Hija;

import java.util.ArrayList;

public class Usuario {
    private Long id;
    private String email;
    private String nombreCompleto;
    private TarjetaPersonal tarjetaPersonal;
    private TarjetaSocial tarjetaSocial;
    private TarjetaNegocio tarjetaNegocio;
    private NotificacionTarjeta notificacionTarjeta;
    private ArrayList<ContactoUsuario> contactos;
    private ArrayList<ContactosLocales> contactosLocales;
    private ArrayList<ContactosPendientes> contactosPendientes;

    public Usuario(Long id,
                   String email,
                   String nombreCompleto,
                   TarjetaPersonal tarjetaPersonal,
                   TarjetaSocial tarjetaSocial,
                   TarjetaNegocio tarjetaNegocio,
                   NotificacionTarjeta notificacionTarjeta,
                   ArrayList<ContactoUsuario> contactos,
                   ArrayList<ContactosLocales> contactosLocales,
                   ArrayList<ContactosPendientes> contactosPendientes
    ){
        this.id = id;
        this.email = email;
        this.nombreCompleto = nombreCompleto;
        this.tarjetaPersonal = tarjetaPersonal;
        this.tarjetaSocial = tarjetaSocial;
        this.tarjetaNegocio = tarjetaNegocio;
        this.notificacionTarjeta = notificacionTarjeta;
        this.contactos = contactos;
        this.contactosLocales = contactosLocales;
        this.contactosPendientes = contactosPendientes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public TarjetaPersonal getTarjetaPersonal() {
        return tarjetaPersonal;
    }

    public void setTarjetaPersonal(TarjetaPersonal tarjetaPersonal) {
        this.tarjetaPersonal = tarjetaPersonal;
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

    public NotificacionTarjeta getNotificacionTarjeta() {
        return notificacionTarjeta;
    }

    public void setNotificacionTarjeta(NotificacionTarjeta notificacionTarjeta) {
        this.notificacionTarjeta = notificacionTarjeta;
    }

    public ArrayList<ContactoUsuario> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<ContactoUsuario> contactos) {
        this.contactos = contactos;
    }

    public ArrayList<ContactosLocales> getContactosLocales() {
        return contactosLocales;
    }

    public void setContactosLocales(ArrayList<ContactosLocales> contactosLocales) {
        this.contactosLocales = contactosLocales;
    }

    public ArrayList<ContactosPendientes> getContactosPendientes() {
        return contactosPendientes;
    }

    public void setContactosPendientes(ArrayList<ContactosPendientes> contactosPendientes) {
        this.contactosPendientes = contactosPendientes;
    }
}
