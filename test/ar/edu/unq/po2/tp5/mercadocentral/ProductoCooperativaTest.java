package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoCooperativaTest {
	
	public ProductoCooperativa fideos;
	public ProductoCooperativa harina;
	
	@BeforeEach
	public void SetUp() {
		fideos = new ProductoCooperativa("Fideos", 1000, 36);
		harina = new ProductoCooperativa("Harina", 800, 36);
	}
	
	@Test
	void test() {
		assertEquals(900, fideos.getPrecio());
	}

}
