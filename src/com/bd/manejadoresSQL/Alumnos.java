package com.bd.manejadoresSQL;

public class Alumnos {
	
	private int idAlumno;
	private String nombre;
	private int idCiudad;
	
	public Alumnos() {}
	
	public Alumnos(int idAlumno, String nombre, int idCiudad) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.idCiudad = idCiudad;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}
	
	@Override
	public String toString() {
		return "Alumno [idAlumnor=" + idAlumno + ", nombre=" + nombre + ", idCiudad=" + idCiudad + "]";
	}

}
