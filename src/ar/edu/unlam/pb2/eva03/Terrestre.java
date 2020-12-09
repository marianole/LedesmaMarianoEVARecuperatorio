package ar.edu.unlam.pb2.eva03;

public class Terrestre extends Vehiculo {

    public Double velocidad;

    public Terrestre(Integer codigoIdentificador, String nombre) {
        super(codigoIdentificador, nombre);
        velocidad=0.0;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }
}
