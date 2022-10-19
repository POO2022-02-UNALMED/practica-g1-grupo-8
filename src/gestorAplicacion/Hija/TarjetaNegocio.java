package gestorAplicacion.Hija;

public class TarjetaNegocio extends gestorAplicacion.Padre.Tarjeta{
    private String logo;
    private String descripcion;
    private String terminos;
    private String nombreCompletoA;
    private String getNombreCompletoB;

    public TarjetaNegocio(String emailA, String emailB, String titulo, String cuerpo, String logo, String descripcion, String terminos, String nombreCompletoA, String getNombreCompletoB){
        super(emailA, emailB, titulo, cuerpo);

    }
}
