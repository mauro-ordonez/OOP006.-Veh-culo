package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiculos.Motocicleta;
import vehiculos.Persona;

public class motoCicletaTest{

	@Test
	public void queSeCreanMotocicleta() {
		Motocicleta m1 = new Motocicleta(0, null);
		assertNotNull(m1);	
	}
	
	@Test
	public void queMotocicletaTieneChofer() {
		Persona p1 = new Persona("luis");
		Motocicleta m1 = new Motocicleta(0, p1);
		assertEquals("luis", m1.getChofer().getNombre());	
	}

	@Test 
	public void queMotocicletaPuedeasignarChofer() {
		Persona p1 = new Persona("luis");
		Motocicleta m1 = new Motocicleta(0, null);
		m1.asignarChofer(p1);
		assertEquals("luis", m1.getChofer().getNombre());
	}
	
	@Test (expected = Error.class)
	public void queMotocicletaNoPuedeasignarChoferSiYaTieneUno() {
		Persona p1 = new Persona("luis");
		Persona p2 = new Persona("pedro");
		Motocicleta m1 = new Motocicleta(0, p1);
		m1.asignarChofer(p1);
		m1.asignarChofer(p2);
	}
	
	@Test
	public void queMotocicletaSabeSusKilometros() {
		
		Motocicleta m1 = new Motocicleta(100, null);
		assertEquals(100, m1.getKilometros());	
	}
	
	public void queMotocicletaPuedeCambiarChofer() {
		Persona p1 = new Persona("luis");
		Persona p2 = new Persona("Pedro");
		Persona p3 = new Persona("juan");
		Motocicleta m1 = new Motocicleta(0, p1);
		assertEquals("luis", m1.getChofer().getNombre());
		m1.subirPersona(p3);
		m1.cambiarChofer(p2);
		assertEquals("Pedro", m1.getChofer().getNombre());	
	}
	
	@Test (expected = Error.class)
	public void queMotocicletaNoPuedeCambiarChoferSiNoHayAcompañante() {
		Persona p1 = new Persona("luis");
		Persona p2 = new Persona("Pedro");
		Persona p3 = new Persona("Alfrefo");
		Motocicleta m1 = new Motocicleta(0, p3);
		m1.subirPersona(p1);
		m1.cambiarChofer(p2);
		
		
	}
	
	@Test
	public void queMotocicletaPuedeSubirAcompañante() {
		Persona p1 = new Persona("luis");
		Motocicleta m1 = new Motocicleta(0, p1);
		
		m1.subirPersona(p1);
		assertEquals("luis", m1.getAcompañante().getNombre());
	}
	
	@Test (expected = Error.class)
	public void queMotocicletaNoPuedeSubirMasDeUnAcompañante() {
		Persona p1 = new Persona("luis");
		Persona p2 = new Persona("Pedro");
		Motocicleta m1 = new Motocicleta(0, p1);
		m1.subirPersona(p1);
		m1.subirPersona(p2);	
	}
	
}
