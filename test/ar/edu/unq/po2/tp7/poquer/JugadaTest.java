package ar.edu.unq.po2.tp7.poquer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaTest {

	Jugada poker;
	Jugada trio;
	Jugada color;
	Carta as,rey,diez;
	
	@BeforeEach
	public void setUp() {
		as = mock(Carta.class);
		rey = mock(Carta.class);
		diez = mock(Carta.class);
		
		when(as.getValor()).thenReturn(14);
		when(as.esSuperior(rey)).thenReturn(true);
		when(rey.getValor()).thenReturn(13);
		when(diez.getValor()).thenReturn(10);
		
		poker = new Poker(Arrays.asList(as, as, as, as, diez));
		color = new Color(Arrays.asList(diez, diez, diez, diez, diez));
		trio = new Trio(Arrays.asList(rey, rey, rey, as, diez));
	}
	
	@Test
	public void testPokerLeGanaAColor() {
		boolean resultado = poker.leGanaA(color);
		
		assertTrue(resultado, "Poker deberia ganarle a Color");
	}
	
	@Test
	void testColorLeGanaATrio() {
		boolean resultado = color.leGanaA(trio);
		
		assertTrue(resultado, "Color deberia ganarle a Trio");
	}
	
	@Test
	void testTrioDeAsesLeGanaATrioDeReyes() {
		Jugada trio1= new Trio(Arrays.asList(as,as,as,rey,rey));
		
		boolean resultado = trio1.leGanaA(trio);
		
		assertTrue(resultado, "Trio de ases deberia ganarle a trio de reyes");
	}

}
