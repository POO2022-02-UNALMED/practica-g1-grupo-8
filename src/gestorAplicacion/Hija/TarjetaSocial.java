package gestorAplicacion.Hija;

import gestorAplicacion.Padre.Tarjeta;

import java.io.Serializable;

public class TarjetaSocial extends Tarjeta implements Serializable {
    private String nombreA;
    private String nombreB;


    public TarjetaSocial() {
        super();
    }

    public TarjetaSocial(String emailA, String emailB, String titulo, String cuerpo, String nombreA, String nombreB){
        super(emailA, emailB, titulo, cuerpo);
        this.nombreA=nombreA;
        this.nombreB=nombreB;
    }
    public TarjetaSocial(String emailA, String emailB, String nombreA, String nombreB){
        super(emailA,emailB);
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getNombreB() {
        return nombreB;
    }

    public void setNombreB(String nombreB) {
        this.nombreB = nombreB;
    }
}
