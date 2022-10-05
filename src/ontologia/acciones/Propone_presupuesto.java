package ontologia.acciones;

import ontologia.conceptos.*;

public class Propone_presupuesto extends Accion {
	
	private Cargo presidente;
	private Presupuesto presupuesto;
	
    public Propone_presupuesto()
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