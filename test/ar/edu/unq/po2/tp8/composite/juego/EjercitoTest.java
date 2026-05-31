package ar.edu.unq.po2.tp8.composite.juego;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EjercitoTest {
	
	Ejercito ejercito;
	Personaje ingeniero;
	Personaje caballero;
	
	Punto punto1,punto2;
	
	@BeforeEach
	public void setUp() {
		punto1= mock(Punto.class);
		punto2= mock(Punto.class);
		
		ingeniero = mock(Ingeniero.class);
		caballero = mock(Caballero.class);
		
		 ejercito = new Ejercito();
		
	    ejercito.agregarPersonaje(ingeniero);
	    ejercito.agregarPersonaje(caballero);
	}
	
	@Test
	void testEjercitoCamina_DelegaATodosSusMiembros() {
		 ejercito.caminar(punto2);
		 
		 // Verificamos que les envió el mensaje 'caminar' a sus componentes
		 verify(ingeniero).caminar(punto2);
		 verify(caballero).caminar(punto2);
	}

}
