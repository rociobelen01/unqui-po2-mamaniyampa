package ar.edu.unq.po2.tp7.poquer;

public class Carta {
	int valor;
	String palo;
	
	public Carta(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public int getValor() {
		return valor;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public boolean esSuperior(Carta carta) {
		return this.valor> carta.valor;
	}
	
	public boolean tienenMismoPalo(Carta carta) {
		return this.getPalo().equals(carta.getPalo());
	}
}
