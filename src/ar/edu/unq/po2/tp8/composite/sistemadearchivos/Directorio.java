package ar.edu.unq.po2.tp8.composite.sistemadearchivos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Directorio implements FyleSystem {

	private String nombre;
	private Date fecha;
	List<FyleSystem> lista;	
	
	public Directorio(String nombre) {
		this.nombre = nombre;
		this.fecha = new Date();
		this.lista = new ArrayList<>();
	}
	
	public void agregarFile(FyleSystem file) {
		lista.add(file);
	}
	
	@Override
	public int totalSize() {
		int size = 0;
		for(FyleSystem f: lista) {
			size += f.totalSize();
		}
		return size;
	}

	@Override
	public void printStructure() {
		System.out.printf("Directorio.", this.getNombre());
		for(FyleSystem f: lista) {
			System.out.printf(" "); f.printStructure() ; 
		}
	}

	@Override
	public FyleSystem lastModified() {
		FyleSystem candidato = this;
		for(FyleSystem f: lista) {
			FyleSystem masNuevoDeF = f.lastModified();
			
			if(masNuevoDeF.getFecha().after(candidato.getFecha())) {
				candidato = masNuevoDeF;
			}
		}
		return candidato;
	}

	@Override
	public FyleSystem oldestElement() {
		FyleSystem candidato = this;
		for(FyleSystem f: lista) {
			FyleSystem masAntiguoDeF = f.oldestElement();
			
			if(masAntiguoDeF.getFecha().before(candidato.getFecha())) {
				candidato = masAntiguoDeF;
			}
		}
		return candidato;
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
