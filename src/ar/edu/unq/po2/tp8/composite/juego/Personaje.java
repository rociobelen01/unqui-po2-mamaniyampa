package ar.edu.unq.po2.tp8.composite.juego;

public abstract class Personaje {
	
	private Punto posicion;
	
	public abstract void caminar(Punto destino);
	
	public Punto getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
}