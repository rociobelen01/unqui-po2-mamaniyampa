package ar.edu.unq.po2.tp7.poquer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {
	
	public Carta carta1;
	public Carta carta2;
	public Carta carta3;
	
	@BeforeEach
	public void setUp() {

		carta1 = new Carta(5, "D");
		carta2 = new Carta(5, "C");
		carta3 = new Carta(8, "C");
	}
	
	@Test
	void testCartaEsSuperior() {
		assertTrue(carta3.esSuperior(carta1));
	}
	
	@Test
	void verificarSiTienenMismoPaloTrue() {
	
		assertTrue(carta2.tienenMismoPalo(carta3));
	}
	
	@Test
	void verificarSiTienenMismoPaloFalse() {
		assertFalse(carta1.tienenMismoPalo(carta3));
	}

}
