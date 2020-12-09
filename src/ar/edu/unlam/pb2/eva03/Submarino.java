package ar.edu.unlam.pb2.eva03;

import interfaces.IAcuatico;

public class Submarino extends Acuatico implements IAcuatico {

    public Submarino(Integer codigoIdentificador, String nombre) {
        super(codigoIdentificador, nombre);
    }
}
