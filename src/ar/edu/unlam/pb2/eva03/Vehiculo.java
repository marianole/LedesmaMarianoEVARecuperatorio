package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Vehiculo {

    public Integer codigoIdentificador;
    public String nombre;

    public Vehiculo(Integer codigoIdentificador, String nombre) {
        this.codigoIdentificador = codigoIdentificador;
        this.nombre = nombre;
    }

    public Integer getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(Integer codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return codigoIdentificador.equals(vehiculo.codigoIdentificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoIdentificador);
    }
}
