package vehiculos;

public class Motocicleta extends Vehiculos {

	private Persona acompañante;

	
	public Motocicleta(int kilometros, Persona chofer,Persona acompañante) {
		this(kilometros, chofer);
		this.acompañante=acompañante;
	}
	
	public Motocicleta(int kilometros, Persona chofer) {
		super(kilometros, chofer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cambiarChofer(Persona chofer) {
		if (this.acompañante != null)
			throw new Error("Hay un acompañante");

		super.setChofer(chofer);
	}

	@Override
	public void subirPersona(Persona acompañante) {
		if (this.acompañante != null)
			throw new Error("Ya hay un acompañante");

		this.acompañante = acompañante;

	}

	public Persona getAcompañante() {
		return this.acompañante;
	}

}
