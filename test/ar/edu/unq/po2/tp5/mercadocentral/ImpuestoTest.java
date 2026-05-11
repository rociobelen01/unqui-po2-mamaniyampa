package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImpuestoTest {
	
	private Impuesto municipal;
	private Impuesto inmobiliario;
	private AgenciaRecaudadora afip;
	
	@BeforeEach
	public void setUp() {
		afip = new AgenciaRecaudadora();
		
		municipal = new Impuesto(1200, afip);
		inmobiliario = new Impuesto(1800, afip);
	}
	
	@Test
	void testImpuesto() {
		assertEquals(1200, municipal.montoAPagar());
		assertEquals(1800, inmobiliario.montoAPagar());
	}
	
	@Test
	void testAgencia() {
		municipal.procesarRegistro();
		inmobiliario.procesarRegistro();
		assertEquals(2, afip.getCantRegistros());
	}

}
