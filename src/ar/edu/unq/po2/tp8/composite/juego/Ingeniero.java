package ar.edu.unq.po2.tp8.composite.juego;

public class Ingeniero extends Personaje {
		
	private int lajas;
	
	public Ingeniero(int latas) {
		this.lajas = latas;
	}
	
	@Override
	public void caminar(Punto destino) {
		if (this.tieneLajas() && !destino.getEstaMarcado()) {
			this.dejarLaja();
			destino.marcarPunto();
		}
		this.setPosicion(destino);
	}
	
	public void dejarLaja() {
		this.setLajas(this.getLajas() - 1);
	}
	
	public boolean tieneLajas() {
		return this.getLajas() >0;
	}
	
	
	public int getLajas() {
		return lajas;
	}
	
	public void setLajas(int lajas) {
		this.lajas = lajas;
	}

}
