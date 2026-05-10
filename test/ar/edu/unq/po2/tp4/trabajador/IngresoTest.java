package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoTest {
	
	public Ingreso ingresoNoviembre;
	public Ingreso ingresoDiciembre;
	
	@BeforeEach
	public void setUp() {
		
		ingresoNoviembre = new Ingreso("Noviembre", "Sueldo",100);
		ingresoDiciembre = new Ingreso("Diciembre", "Sueldo",200);
	}
	
	@Test
	void test() {
		assertEquals("Noviembre", ingresoNoviembre.getMes());
		assertEquals("Sueldo", ingresoNoviembre.getConcepto());
		assertEquals(200, ingresoDiciembre.montoPercibido());
		assertEquals(200, ingresoDiciembre.montoImponible());
	}

}
