package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiculos.Autobus;
import vehiculos.Persona;

public class autoBusTest {

	@Test
	public void queSecreaAutobus() {
		
		Autobus a1 = new Autobus(0, null);
		assertNotNull(a1);
	}
	
	@Test
	public void queAutobusTieneChofer() {
		Persona p1 = new Persona("luis");
		Autobus m1 = new Autobus(0, p1);
		assertEquals("luis", m1.getChofer().getNombre());	
	}

	@Test 
	public void queAutobusPuedeasignarChofer() {
		Persona p1 = new Persona("luis");
		Autobus m1 = new Autobus(0, null);
		m1.asignarChofer(p1);
		assertEquals("luis", m1.getChofer().getNombre());
	}
	
	@Test (expected = Error.class)
	public void queAutobusNoPuedeasignarChoferSiYaTieneUno() {
		Persona p1 = new Persona("luis");
		Persona p2 = new Persona("pedro");
		Autobus m1 = new Autobus(0, p1);
		m1.asignarChofer(p1);
		m1.asignarChofer(p2);
	}
	
	@Test
	public void queAutobusSabeSusKilometros() {
		
		Autobus m1 = new Autobus(100, null);
		assertEquals(100, m1.getKilometros());	
	}
	
	public void queAutobusPuedeCambiarChofer() {
		Persona p1 = new Persona("luis");
		Persona p2 = new Persona("Pedro");
		Persona p3 = new Persona("juan");
		Autobus m1 = new Autobus(0, p1);
		assertEquals("luis", m1.getChofer().getNombre());
		m1.subirPersona(p3);
		m1.cambiarChofer(p2);
		assertEquals("Pedro", m1.getChofer().getNombre());	
	}
	
	@Test(expected = Error.class)
	public void queAutobusNoPuedeCambiarChoferSiNoHayAlmenosUnPasajero() {
		Persona p1 = new Persona("luis");
		Persona p2 = new Persona("Pedro");
		Autobus m1 = new Autobus(0, null);	
		m1.subirPersona(p1);
		m1.cambiarChofer(p2);
	}
	
	@Test
	public void queAutobusPuedeSubirPasajeros() {
		Persona p1 = new Persona("Luis");
		Persona p2 = new Persona("Pedro");
		Persona p3 = new Persona("Juan");
		Persona p4 = new Persona("Mateo");
		
		Autobus m1 = new Autobus(0, p1);
		
		m1.subirPersona(p2);
		m1.subirPersona(p3);
		m1.subirPersona(p4);
		
		assertEquals(3, m1.getPasajeros().size());
	}
	
	
	@Test (expected = Error.class)
	public void queAutobusNoPuedeSubirMasDePasajerosCuandoNoHayMasAsientos() {
	
		Persona p1 = new Persona("Luis");
		Persona p2 = new Persona("Pedro");

		Autobus m1 = new Autobus(0, p1);

		for (int i = 0; i < 22; i++) {
			m1.subirPersona(p2);
		}
		
	}
	
	

}
