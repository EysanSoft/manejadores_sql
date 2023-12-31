package com.bd.manejadoresSQL;

public class Ciudades {
	
	private int idCiudad;
	private String nombre;
	
	public Ciudades() {}

	public Ciudades(int idCiudad, String nombre) {
		super();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Ciudad [idCiudad =" + idCiudad  + ", nombre=" + nombre + "]";
	}

}
