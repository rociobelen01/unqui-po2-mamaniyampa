package ar.edu.unq.po2.tp8.composite.sistemadearchivos;

import java.util.Date;

public class Archivo implements FyleSystem  {

	private String nombre;
	private Date fecha;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
		this.fecha = new Date();
	}
	
	@Override
	public int totalSize() {
		return 1;
	}

	@Override
	public void printStructure() {
		System.out.printf("Archivo.", nombre);
	}

	@Override
	public FyleSystem lastModified() {
		return this;
	}

	@Override
	public FyleSystem oldestElement() {
		return this;
	}

	@Override
	public Date getFecha() {
		return fecha;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

}
