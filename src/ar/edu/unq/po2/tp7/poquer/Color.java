package ar.edu.unq.po2.tp7.poquer;

import java.util.List;

public class Color extends Jugada {

	public Color(List<Carta> cartas) {
		super(cartas);
	}

	@Override
	public int prioridad() {
		return 2;
	}

	@Override
	public Carta cartaPrincipal() {
		return this.cartas.stream()
				.max((c1,c2) -> Integer.compare(c1.getValor(), c2.getValor()))
				.orElse(null);
	}

}
