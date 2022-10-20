package gestorAplicacion.Hija;

public class TarjetaSocial extends gestorAplicacion.Padre.Tarjeta {
    private String nombreA;
    private String nombreB;

    public TarjetaSocial(String emailA, String emailB, String titulo, String cuerpo, String nombreA, String nombreB){
        super(emailA, emailB, titulo, cuerpo);
        this.nombreA=nombreA;
        this.nombreB=nombreB;
    }
    public TarjetaSocial(String emailA, String emailB, String nombreA, String nombreB){
        super(emailA,emailB);

    }
}
