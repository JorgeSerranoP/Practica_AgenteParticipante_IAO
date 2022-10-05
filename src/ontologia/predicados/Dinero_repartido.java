package ontologia.predicados;

import ontologia.conceptos.*;

public class Dinero_repartido extends Predicado {
	
	private Cargo presidente;
	private Presupuesto presupuesto;
	private Cargo cargo;
	
	public Dinero_repartido()
	{ ; }

	public Cargo getPresidente() {
		return presidente;
	}

	public void setPresidente(Cargo presidente) {
		this.presidente = presidente;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
}