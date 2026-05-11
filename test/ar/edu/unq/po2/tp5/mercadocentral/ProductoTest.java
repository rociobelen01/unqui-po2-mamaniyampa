package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
	
	public Producto arroz;
	public Producto leche;

	@BeforeEach
	public void SetUp() {
		arroz = new Producto("Arroz", 1000, 23);
		leche = new Producto("Leche", 1200, 29);		
	}
	
	@Test
	void testProducto() {
		assertEquals(1000, arroz.getPrecio());
		leche.decrementarStock();
		assertEquals(28, leche.getStock());
	}

}
