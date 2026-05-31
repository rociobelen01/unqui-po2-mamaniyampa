package ar.edu.unq.po2.tp8.composite.juego;

import java.util.ArrayList;
import java.util.List;

public class Ejercito extends Personaje {
	
	private List<Personaje> personajes;
	
	public Ejercito() {
		this.personajes = new ArrayList<>();
	}

	@Override
	public void caminar(Punto destino) {
		for(Personaje p: personajes) {
			p.caminar(destino);
		}	
	}
	
	public void agregarPersonaje(Personaje personaje) {
		personajes.add(personaje);
	}
}
