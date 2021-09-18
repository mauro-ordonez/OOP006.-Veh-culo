package vehiculos;

public class Motocicleta extends Vehiculos {

	private Persona acompa�ante;

	
	public Motocicleta(int kilometros, Persona chofer,Persona acompa�ante) {
		this(kilometros, chofer);
		this.acompa�ante=acompa�ante;
	}
	
	public Motocicleta(int kilometros, Persona chofer) {
		super(kilometros, chofer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cambiarChofer(Persona chofer) {
		if (this.acompa�ante != null)
			throw new Error("Hay un acompa�ante");

		super.setChofer(chofer);
	}

	@Override
	public void subirPersona(Persona acompa�ante) {
		if (this.acompa�ante != null)
			throw new Error("Ya hay un acompa�ante");

		this.acompa�ante = acompa�ante;

	}

	public Persona getAcompa�ante() {
		return this.acompa�ante;
	}

}
