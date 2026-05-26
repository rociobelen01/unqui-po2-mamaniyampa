package ar.edu.unq.po2.tp7.poquer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PokerStatus {
	
	
	
	public Jugada verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		List<Carta> cartas = Arrays.asList(c1,c2,c3,c4,c5);
		
		List<Integer> valores = this.getValores(cartas);
		List<String> palos = this.getPalos(cartas);	
		
		Jugada resultado = null;
		
		if (hayFrecuencia(valores, 4)) {
			resultado = new Poker(cartas);
		} else if (hayFrecuencia(palos, 5)) {
			resultado = new Color(cartas);;
		} else if (hayFrecuencia(valores, 3)) {
			resultado = new Trio(cartas);;
		}
		return resultado;
	}
	
		
	public List<Integer> getValores(List<Carta> cartas) {
		return cartas.stream()
				.map(c -> c.getValor())
				.collect(Collectors.toList());
	}
	
	public List<String> getPalos(List<Carta> cartas) {
		return cartas.stream()
				.map(c -> c.getPalo())
				.collect(Collectors.toList());
	}
	
	public boolean hayFrecuencia(List<?> elementos, int numero) {
		return elementos.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)))
				.values()
				.contains(numero);
	}
}
