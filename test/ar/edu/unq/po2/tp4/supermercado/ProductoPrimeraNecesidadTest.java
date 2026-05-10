package ar.edu.unq.po2.tp4.supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 100d, false, 0.11);
		arroz = new ProductoPrimeraNecesidad("Arroz", 100d, false, 0.08);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(89.0), leche.getPrecio());
		assertEquals(new Double(92.0), arroz.getPrecio());
	}
}
