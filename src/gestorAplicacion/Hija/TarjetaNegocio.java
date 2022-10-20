package gestorAplicacion.Hija;

public class TarjetaNegocio extends gestorAplicacion.Padre.Tarjeta{
    private String logo;
    private String descripcion;
    private String terminos;
    private String nombreCompletoA;
    private String nombreCompletoB;

    public TarjetaNegocio(String emailA, String emailB, String titulo, String cuerpo, String logo, String descripcion, String terminos, String nombreCompletoA, String getNombreCompletoB){
        super(emailA, emailB, titulo, cuerpo);
        this.logo=logo;
        this.descripcion=descripcion;
        this.terminos=terminos;
        this.nombreCompletoA=nombreCompletoA;
        this.nombreCompletoB=getNombreCompletoB;
    }

    public String getNombreCompletoA() {
        return nombreCompletoA;
    }

    public void setNombreCompletoA(String nombreCompletoA) {
        this.nombreCompletoA = nombreCompletoA;
    }

    public String getNombreCompletoB() {
        return nombreCompletoB;
    }

    public void setNombreCompletoB(String nombreCompletoB) {
        this.nombreCompletoB = nombreCompletoB;
    }

    public String getTerminos() {
        return terminos;
    }

    public void setTerminos(String terminos) {
        this.terminos = terminos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
