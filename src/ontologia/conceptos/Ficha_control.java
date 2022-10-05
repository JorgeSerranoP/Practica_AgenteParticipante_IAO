package ontologia.conceptos;

public class Ficha_control extends Concepto {
	
	private Cargo cunado;
	private Cargo cargo;
	
	public Ficha_control()
	{ ; }

	public Cargo getCunado() {
		return cunado;
	}

	public void setCunado(Cargo cunado) {
		this.cunado = cunado;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
}