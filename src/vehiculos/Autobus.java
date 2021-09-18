package vehiculos;

import java.util.ArrayList;

public class Autobus extends Vehiculos {

	private int asientos;
	private final int CANTIDAD_ASIENTOS = 20;
	private ArrayList<Persona> pasajeros = new ArrayList<Persona>();

	public Autobus(int kilometros, Persona chofer) {
		super(kilometros, chofer);
		this.asientos = CANTIDAD_ASIENTOS;
	}

	public ArrayList<Persona> getPasajeros() {
		return pasajeros;
	}

	@Override
	public void cambiarChofer(Persona nuevoChofer) {
		if (pasajeros.size() > 0)
			throw new Error("Hay pasajeros");

		super.setChofer(nuevoChofer);

	}

	@Override
	public void subirPersona(Persona pasajero) {
		if (this.asientos <= 0)
			throw new Error("No hay mas asientos");

		this.pasajeros.add(pasajero);
		this.asientos--;

	}

}
