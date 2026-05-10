package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {
	
	public Trabajador maria;
	public Ingreso ingresoMaria1;
	public Ingreso ingresoMaria2;
	public IngresoHorasExtras ingresoMaria3;
	public List<Ingreso> ingresos;
	

	@BeforeEach
	public void SetUp() {
		ingresoMaria1 = new Ingreso("Enero","Sueldo",10.000);
		ingresoMaria2 = new Ingreso("Febrero","Sueldo",11.000);
		ingresoMaria3 = new IngresoHorasExtras("Febrero","Sueldo",11.000, 15);
		
		ingresos = new ArrayList<Ingreso>();
		maria = new Trabajador(ingresos);
		maria.agregarIngreso(ingresoMaria1);
		maria.agregarIngreso(ingresoMaria2);
		maria.agregarIngreso(ingresoMaria3);
	}
	
	@Test
	void test() {
		assertEquals(32.000, maria.getTotalPercibido());
		assertEquals(21.000, maria.getMontoImponible());
	}

}
