package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Batalla {

	private String nombre;
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;

	public Batalla(Double latitud, Double longitud, TipoDeBatalla tipo) {
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		vehiculosEnLaBatalla= new HashSet<Vehiculo>();
	}

	public Batalla(String nombre, Double latitud, Double longitud) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		vehiculosEnLaBatalla= new HashSet<Vehiculo>();
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}
}
