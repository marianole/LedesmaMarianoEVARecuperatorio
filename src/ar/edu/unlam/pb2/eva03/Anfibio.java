package ar.edu.unlam.pb2.eva03;

import interfaces.IAcuatico;
import interfaces.ITerrestre;

public class Anfibio extends Vehiculo implements IAcuatico, ITerrestre {

    public Double velocidad;
    public Double profundidad;

    public Anfibio(Integer codigoIdentificador, String nombre) {
        super(codigoIdentificador, nombre);
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }
}
