package ar.edu.unq.po2.tp8.composite.juego;

public class Caballero extends Personaje {
	
	private Mapa mapa;

    public Caballero(Mapa mapa) {
        this.mapa = mapa;
    }
	
	@Override
	public void caminar(Punto destino) {
        int xIntermedio = (this.getPosicion().getX() + destino.getX()) / 2;
        int yIntermedio = (this.getPosicion().getY() + destino.getY()) / 2;
        
        Punto puntoDeVigilancia = mapa.getPuntoEn(xIntermedio, yIntermedio);

        if (puntoDeVigilancia != null && !puntoDeVigilancia.getHayEnemigo()) {
            this.setPosicion(destino);
        } else if (puntoDeVigilancia != null) {
            this.setPosicion(puntoDeVigilancia);
        }
    }
}
