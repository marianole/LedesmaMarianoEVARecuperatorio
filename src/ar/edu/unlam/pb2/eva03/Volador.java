package ar.edu.unlam.pb2.eva03;

public class Volador extends Vehiculo {

    public Double altura;

    public Volador(Integer codigoIdentificador, String nombre) {
        super(codigoIdentificador, nombre);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
