package ar.edu.unlam.pb2.eva03;

import interfaces.ITerrestre;
import interfaces.IVolador;

public class HidroAvion extends Vehiculo implements ITerrestre, IVolador {

    public Double altura;
    public Double profundidad;

    public HidroAvion(Integer codigoIdentificador, String nombre) {
        super(codigoIdentificador, nombre);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }
}
