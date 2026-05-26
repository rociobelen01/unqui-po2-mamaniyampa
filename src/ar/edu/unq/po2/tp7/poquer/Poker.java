package ar.edu.unq.po2.tp7.poquer;

import java.util.List;
import java.util.stream.Collectors;

public class Poker extends Jugada{

	public Poker(List<Carta> cartas) {
		super(cartas);
	}

	@Override
	public int prioridad() {
		return 3;
	}

	@Override
	public Carta cartaPrincipal() {
		return this.cartas.stream()
				.collect(Collectors.groupingBy(Carta::getValor))
				.values()
				.stream()
				.filter(grupo -> grupo.size() == 4)
				.findFirst()
				.map(grupo -> grupo.get(0))
				.orElse(null);
	}

}
