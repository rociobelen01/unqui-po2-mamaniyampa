package ar.edu.unq.po2.tp8.composite.juego;

public class Punto {
	int x;
	int y;
	boolean estaMarcado;
	boolean hayEnemigo;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
		this.estaMarcado = false;
		this.hayEnemigo = false;
	}
	
	public boolean getEstaMarcado() {
		return estaMarcado;
	}
	
	public void setEstaMarcado(boolean estaMarcado) {
		this.estaMarcado = estaMarcado;
	}
	
	public void marcarPunto() {
		this.setEstaMarcado(true);
	}
	
	public boolean getHayEnemigo() {
		return hayEnemigo;
	}
	
	public void setHayEnemigo(boolean hayEnemigo) {
		this.hayEnemigo = hayEnemigo;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
