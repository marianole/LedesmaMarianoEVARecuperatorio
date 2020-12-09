package ar.edu.unlam.pb2.eva03;

public class Terrestre extends ObjetoBasico {

    public Double velocidad;

    public Terrestre(Integer codigoIdentificador, String nombre) {
        super(codigoIdentificador, nombre);
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }
}
