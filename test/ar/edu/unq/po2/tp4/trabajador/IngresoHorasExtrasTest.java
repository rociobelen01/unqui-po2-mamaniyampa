package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoHorasExtrasTest {
	
	public IngresoHorasExtras enero;
	
	@BeforeEach
	public void SetUp() {
		
		enero = new IngresoHorasExtras("Enero", "Sueldo", 11000, 15);
	}
	
	@Test
	void test() {
		assertEquals(0, enero.montoImponible());
	}

}
