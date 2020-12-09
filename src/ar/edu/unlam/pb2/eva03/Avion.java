package ar.edu.unlam.pb2.eva03;

import interfaces.IVolador;

public class Avion extends Volador implements IVolador {


    public Avion(Integer codigoIdentificador, String nombre) {
        super(codigoIdentificador, nombre);
    }


}
