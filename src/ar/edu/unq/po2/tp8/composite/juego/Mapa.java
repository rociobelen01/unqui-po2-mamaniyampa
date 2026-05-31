package ar.edu.unq.po2.tp8.composite.juego;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private List<Punto> puntos = new ArrayList<Punto>();

    public void agregarPunto(Punto punto) {
        this.puntos.add(punto); //
    }

    public Punto getPuntoEn(int x, int y) {
        for (Punto p : puntos) {
            if (p.getX() == x && p.getY() == y) {
                return p;
            }
        }
        return null;
    }
}