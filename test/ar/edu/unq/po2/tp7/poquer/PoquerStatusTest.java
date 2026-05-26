package ar.edu.unq.po2.tp7.poquer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoquerStatusTest {
		
	PokerStatus pokerStatus;
	Carta carta1, carta2, carta3, carta4, carta5;
	Carta carta1D = mock(Carta.class);
	//@Mock private Carta carta1D;
	
	@BeforeEach
	public void setUp() {
		
		pokerStatus = new PokerStatus();
		
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	}
	
	@Test
	void testVerificacionPoquer() {
		// STUB
		// No usamos el constructor de Carta, solo definimos respuestas:
		when(carta1.getValor()).thenReturn(14);
		when(carta2.getValor()).thenReturn(14);
		when(carta3.getValor()).thenReturn(14);
		when(carta4.getValor()).thenReturn(14);
		when(carta5.getValor()).thenReturn(2);
		
		// EXERCISE
		Jugada resultado = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
		
		// VERIFY
		assertTrue(resultado instanceof Poker);
	}
	
	@Test
	void testVerificacionColor() {
		when(carta1.getPalo()).thenReturn("D");
		when(carta2.getPalo()).thenReturn("D");
		when(carta3.getPalo()).thenReturn("D");
		when(carta4.getPalo()).thenReturn("D");
		when(carta5.getPalo()).thenReturn("D");
	
		Jugada resultado = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
		
		assertTrue(resultado instanceof Color);
	}
	
	@Test
	void testVerificacionTrio() {
		  // STUB de Valores (Correcto)
	    when(carta1.getValor()).thenReturn(1);
	    when(carta2.getValor()).thenReturn(1);
	    when(carta3.getValor()).thenReturn(1);
	    when(carta4.getValor()).thenReturn(10);
	    when(carta5.getValor()).thenReturn(10);

	    // STUB de Palos (Necesario para evitar el falso positivo de "Color")
	    when(carta1.getPalo()).thenReturn("P");
	    when(carta2.getPalo()).thenReturn("C"); // Diferente al anterior
	    when(carta3.getPalo()).thenReturn("D");
	    when(carta4.getPalo()).thenReturn("T");
	    when(carta5.getPalo()).thenReturn("P");
	
	    Jugada resultado = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
		
	    assertTrue(resultado instanceof Trio);
		verify(carta1).getValor(); 
	}
	
}
