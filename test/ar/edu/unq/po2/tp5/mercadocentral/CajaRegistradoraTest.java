package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaRegistradoraTest {
	
	private CajaRegistradora caja;
	private AgenciaRecaudadora afip;
	
	private Producto arroz;
	private ProductoCooperativa fideos;
	
	private Servicio luz;
	private Impuesto inmobiliario;
	
	
	@BeforeEach
	public void setUp() {
		
		afip = new AgenciaRecaudadora();
		
		arroz = new Producto("Arroz", 100.0, 20);
		fideos = new ProductoCooperativa("Fideos", 100.0, 10);
		
		luz = new Servicio(10.0, 50,"Noviembre",afip);
		inmobiliario = new Impuesto(400.0, afip);
		
		caja = new CajaRegistradora(2313);
		
		caja.registrarItem(arroz);
		caja.registrarItem(fideos);
		caja.registrarItem(luz);
		caja.registrarItem(inmobiliario);
	}
	
	@Test
	void testMontoTotalAPagar() {
		double montoEsperado = 1090.0;
		assertEquals(montoEsperado, caja.montoAPagar()); 
	}
	
	@Test
	void testEfectosColateralesDeProductos() {
		assertEquals(19, arroz.getStock(), "El stock no se decrementó correctamente");
		assertEquals(9, fideos.getStock(), "El stock del producto cooperativa no se decrementó");
	}
	
	@Test
	void testEfectosColateralesDeFacturas() {
		assertEquals(2, afip.getCantRegistros(), "La agencia no registró los pagos de facturas");
	}
	


}
