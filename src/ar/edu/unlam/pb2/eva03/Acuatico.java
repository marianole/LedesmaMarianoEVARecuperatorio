package ar.edu.unlam.pb2.eva03;

public class Acuatico extends ObjetoBasico{

    public Double profundidad;

    public Acuatico(Integer codigoIdentificador, String nombre) {
        super(codigoIdentificador, nombre);
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }
}
