package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioTest {
	
	private Servicio agua;
	private Servicio gas;
	private AgenciaRecaudadora afip;
	
	@BeforeEach
	public void setUp() {
		afip = new AgenciaRecaudadora();
		
		agua = new Servicio(100.0,10,"Junio",afip);
		gas= new Servicio(50.0, 5,"Junio",afip);
	}
	
	@Test
	void testServicio() {
		assertEquals(1000.0, agua.montoAPagar());
		assertEquals(250.0, gas.montoAPagar());
	}
	
	@Test
	void testAgencia() {
		agua.procesarRegistro();
		gas.procesarRegistro();
		assertEquals(2, afip.getCantRegistros());
	}
}
