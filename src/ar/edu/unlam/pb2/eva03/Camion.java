package ar.edu.unlam.pb2.eva03;

import interfaces.ITerrestre;

public class Camion extends Terrestre implements ITerrestre {

    public Camion(Integer codigoIdentificador, String nombre) {
        super(codigoIdentificador, nombre);
    }
}
