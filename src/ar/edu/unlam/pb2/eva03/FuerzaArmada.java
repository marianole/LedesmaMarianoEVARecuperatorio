package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import interfaces.IAcuatico;
import interfaces.ITerrestre;
import interfaces.IVolador;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	public FuerzaArmada(){
		convoy= new HashSet<Vehiculo>();
		batallas= new HashMap<String, Batalla>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		convoy.add(vehiculo);
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipoDeBatalla, Double latitud, Double longitud){
		batallas.putIfAbsent(nombre, new Batalla(latitud, longitud, tipoDeBatalla));
	}

	public Batalla getBatalla(String nombreBatalla) {
		return batallas.get(nombreBatalla);
	}

	public Boolean enviarALaBatalla(String nombre, Integer codigoIdentificador) throws VehiculoInexistente {
		if (!(convoy.contains(codigoIdentificador))){
			throw new VehiculoInexistente();
		}
		switch (batallas.get(nombre).getTipo()){
			case AEREA:
				if (convoy instanceof IVolador){
					return true;
				}
				break;
			case NAVAL:
				if (convoy instanceof IAcuatico){
					return true;
				}
				break;
			case TERRESTRE:
				if (convoy instanceof ITerrestre){
					return true;
				}
				break;
		}
		return false;
	}
}
