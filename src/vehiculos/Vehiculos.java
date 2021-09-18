package vehiculos;

public abstract class Vehiculos {

	private int kilometros;
	private Persona chofer;

	public Persona getChofer() {
		return this.chofer;
	}

	public Vehiculos(int kilometros, Persona chofer) {
		this.kilometros = kilometros;
		this.setChofer(chofer);
	}

	public int getKilometros() {
		return this.kilometros;
	}

	public Persona chofer() {
		return this.chofer;
	}

	public void setChofer(Persona nuevoChofer) {
		this.chofer = nuevoChofer;

	}

	public void asignarChofer(Persona Chofer) {
		if (this.getChofer() != null)
			throw new Error("Ya hay un chofer asignado");

		this.setChofer(Chofer);
	}

	abstract void cambiarChofer(Persona nuevoChofer);

	abstract void subirPersona(Persona pasajero);

}
