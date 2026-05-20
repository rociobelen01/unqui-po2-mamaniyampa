package ar.edu.unq.po2.tp6.bancoyprestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {
	
	private Banco banco;
	private Cliente clienteRico;
	private Cliente clientePobre;
	private Cliente clienteMayor;
	private CreditoPersonal solicitudP;
	private CreditoHipotecario solicitudH;
	private Propiedad casa;

	@BeforeEach
	public void setUp() {
		banco = new Banco();
		
		clienteRico = new Cliente("Pedro", "Amarilla", "Calle falsa 1", 50, 2000);
		clientePobre = new Cliente("Jose", "Gomez", "Calle falsa 2", 25, 1000);
		clienteMayor = new Cliente("Franco", "Martinez", "Calle falsa 03", 60, 5000);
		
		casa = new Propiedad("Casa","Dire 1", 50000);
	}
	
	@Test
	void testCreditoPersonalAceptable() {
		// Caso: Ingresos > 15000 y cuota < 70% sueldo
        // Monto 1000 en 10 meses = cuota 100. 100 es < 1400 (70% de 2000)
		solicitudP = new CreditoPersonal("Credito 1", 1000, 10, clienteRico); 
        assertTrue(solicitudP.esAceptable());
	}
	
	@Test
	void testCreditoHipotecarioRechazadoPorEdad() {
		solicitudH = new CreditoHipotecario("Credito 2", 1000, 120, clienteMayor,casa);
		assertFalse(solicitudH.esAceptable());
	}
	
	@Test
	void testMontoTotalADesembolsar() {
		solicitudP = new CreditoPersonal("C1", 1000, 10, clienteRico);
		CreditoPersonal solicitudP1 = new CreditoPersonal("C2", 5000, 1, clientePobre);
		banco.registrarSolicitud(solicitudP1);
		banco.registrarSolicitud(solicitudP);
		
		// El monto total solo debe sumar la aprobada (1000)
		assertEquals(1000, banco.montoADesembolsar());
	}
	
	
}
