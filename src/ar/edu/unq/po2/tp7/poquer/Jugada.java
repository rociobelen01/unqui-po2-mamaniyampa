package ar.edu.unq.po2.tp7.poquer;

import java.util.List;

public abstract class Jugada {
	
	List<Carta> cartas;
	
	public Jugada(List<Carta> cartas) {
		this.cartas= cartas;
	}
	
	public abstract int prioridad();
	
	public abstract Carta cartaPrincipal(); 
	
	public boolean leGanaA(Jugada jugada) {
		if (this.prioridad() == jugada.prioridad()) {
			return this.cartaPrincipal().esSuperior(jugada.cartaPrincipal());
		} else {
			return this.prioridad() > jugada.prioridad();
		}
	}
	
}
