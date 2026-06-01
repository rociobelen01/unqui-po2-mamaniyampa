package ar.edu.unq.po2.tp8.composite.sistemadearchivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DirectorioTest {
	
	Directorio root;
	
	FyleSystem archivo_1 ; 
	FyleSystem archivo_2 ;
	
	Date fechaAntigua;
	Date fechaNueva;
	
	@BeforeEach
	public void setUp() {
		
		root = new Directorio("root");
		
		archivo_1 = mock(FyleSystem.class);
		archivo_2 = mock(FyleSystem.class);
		
		fechaAntigua = new Date(126, 4, 10);
		fechaNueva = new Date(126, 6, 29);
		
		when(archivo_1.totalSize()).thenReturn(100);
		when(archivo_1.getFecha()).thenReturn(fechaAntigua);
		when(archivo_1.lastModified()).thenReturn(archivo_1);
		when(archivo_1.oldestElement()).thenReturn(archivo_1);
		
		when(archivo_2.totalSize()).thenReturn(250);
		when(archivo_2.getFecha()).thenReturn(fechaNueva);
		when(archivo_2.lastModified()).thenReturn(archivo_2);
		when(archivo_2.oldestElement()).thenReturn(archivo_2);
		
		root.agregarFile(archivo_1);
		root.agregarFile(archivo_2);
	}
	
	@Test
	void testTotalSize_SumaElTamanoDeTodosSusHijos() {
		assertEquals(350, root.totalSize());
		verify(archivo_1).totalSize();
		verify(archivo_2).totalSize();
	}
	
	@Test
	void testLastModified_RetornaElHijoConFechaMasReciente() {
		// Exercise
	    FyleSystem masNuevo = root.lastModified();

	    // Verify
	    assertEquals(archivo_2, masNuevo, "Debería retornar archivo_2 porque su fecha es más reciente");
	    verify(archivo_1).getFecha(); 
	    verify(archivo_2).getFecha();
	}

	@Test
	void testOldestElement_RetornaElHijoConFechaMasAntigua() {
		// Exercise
	    FyleSystem masAntiguo= root.oldestElement();

	    // Verify
	    assertEquals(archivo_1, masAntiguo, "Debería retornar archivo_1 porque su fecha es más antigua");

	}

}
