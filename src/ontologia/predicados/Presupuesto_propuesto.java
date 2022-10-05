package ontologia.predicados;

import ontologia.conceptos.*;

public class Presupuesto_propuesto extends Predicado {
    
	private Cargo presidente;
	private Presupuesto presupuesto;
	
    public Presupuesto_propuesto()
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
    
    
}