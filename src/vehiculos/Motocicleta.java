package vehiculos;

public class Motocicleta extends Vehiculos {

	private Persona acompaņante;

	
	public Motocicleta(int kilometros, Persona chofer,Persona acompaņante) {
		this(kilometros, chofer);
		this.acompaņante=acompaņante;
	}
	
	public Motocicleta(int kilometros, Persona chofer) {
		super(kilometros, chofer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cambiarChofer(Persona chofer) {
		if (this.acompaņante != null)
			throw new Error("Hay un acompaņante");

		super.setChofer(chofer);
	}

	@Override
	public void subirPersona(Persona acompaņante) {
		if (this.acompaņante != null)
			throw new Error("Ya hay un acompaņante");

		this.acompaņante = acompaņante;

	}

	public Persona getAcompaņante() {
		return this.acompaņante;
	}

}
