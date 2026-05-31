package ar.edu.unq.po2.tp8.composite.cultivo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PorcionMixtaTest {
	
	PorcionProductiva porcionMixta;
	PorcionProductiva p1, p2, p3, p4;
	
	@BeforeEach
	public void setUp() {
		
		p1 = mock(PorcionProductiva.class);
		p2 = mock(PorcionProductiva.class);
		p3 = mock(PorcionProductiva.class);
		p4 = mock(PorcionMixta.class);
		
		//STUBBING
		// Simulamos que dos regiones tienen soja
		when(p1.getGanaciaAnualSoja()).thenReturn(500.0);
		when(p2.getGanaciaAnualSoja()).thenReturn(500.0);
		when(p3.getGanaciaAnualSoja()).thenReturn(0.0);
		when(p4.getGanaciaAnualSoja()).thenReturn(0.0);
		
		porcionMixta = new PorcionMixta(p1, p2, p3, p4);
	}
	
	@Test
	void testGetGananciaAnualSoja_CalculaProporcionCorrecta() {
		//EXERCISE
		double resultado = porcionMixta.getGanaciaAnualSoja();
		
		//VERIFY
		assertEquals(250.0, resultado);
		
		verify(p1).getGanaciaAnualSoja();
		verify(p2).getGanaciaAnualSoja();
	}
}
