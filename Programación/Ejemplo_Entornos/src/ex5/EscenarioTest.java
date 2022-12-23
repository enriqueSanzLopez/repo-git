package ex5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EscenarioTest {
	@Test
	void testcabecera_pelea() {
		Luchador luch1=new Luchador("Enrique");
		Luchador luch2=new Luchador("Ferran");
		Escenario practica=new Escenario("IES Serpis",luch1,luch2);
		String frase=practica.cabecera_pelea();
		assertEquals("Comienza la pelea entre Enrique y Ferran en IES Serpis",frase);
	}
	@Test
	void testPelea() {
		Luchador luch1=new Luchador("Enrique");
		Luchador luch2=new Luchador("Ferran");
		Escenario practica=new Escenario("IES Serpis",luch1,luch2);
		String resultado=practica.pelea(1);
		assertEquals(resultado,"El ganador de este round es: Enrique");
		resultado=practica.pelea(2);
		assertEquals(resultado,"El ganador de este round es: Ferran");
		resultado=practica.pelea(0);
		assertEquals(resultado,"El ganador de este round es: Ferran");
	}
}