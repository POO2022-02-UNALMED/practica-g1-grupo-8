package gestorAplicacion.Hija;

public class TarjetaNegocioUsuario {
    private String nombreNegocio;
    private String descripcionNegocio;
    private String telefonoNegocio;
    private String direccionNegocio;

    public TarjetaNegocioUsuario(String nombreNegocio, String descripcionNegocio, String telefonoNegocio, String direccionNegocio){
        this.nombreNegocio = nombreNegocio;
        this.descripcionNegocio = descripcionNegocio;
        this.telefonoNegocio = telefonoNegocio;
        this.direccionNegocio = direccionNegocio;
    }

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public String getDescripcionNegocio() {
        return descripcionNegocio;
    }

    public void setDescripcionNegocio(String descripcionNegocio) {
        this.descripcionNegocio = descripcionNegocio;
    }

    public String getTelefonoNegocio() {
        return telefonoNegocio;
    }

    public void setTelefonoNegocio(String telefonoNegocio) {
        this.telefonoNegocio = telefonoNegocio;
    }

    public String getDireccionNegocio() {
        return direccionNegocio;
    }

    public void setDireccionNegocio(String direccionNegocio) {
        this.direccionNegocio = direccionNegocio;
    }
}
