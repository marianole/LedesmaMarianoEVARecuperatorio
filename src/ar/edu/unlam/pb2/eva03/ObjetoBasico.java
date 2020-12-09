package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class ObjetoBasico {

    public Integer codigoIdentificador;
    public String nombre;

    public ObjetoBasico(Integer codigoIdentificador, String nombre) {
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
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoBasico objetoBasico = (ObjetoBasico) o;
        return codigoIdentificador.equals(objetoBasico.codigoIdentificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoIdentificador);
    }
}
