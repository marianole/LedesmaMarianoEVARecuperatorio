package ar.edu.unlam.pb2.eva03;

import interfaces.ITerrestre;

public class Tanque extends Terrestre implements ITerrestre {

    public Tanque(Integer codigoIdentificador, String nombre) {
        super(codigoIdentificador, nombre);
    }

}
