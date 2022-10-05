package ontologia.acciones;

import ontologia.conceptos.*;

public class Coloca_ficha_control extends Accion {
    
	private Cargo cargo;
	private Ficha_control fichaControl;
	
	public Coloca_ficha_control()
    { ; }

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Ficha_control getFichaControl() {
		return fichaControl;
	}

	public void setFichaControl(Ficha_control fichaControl) {
		this.fichaControl = fichaControl;
	}
	
}