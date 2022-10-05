package ontologia.acciones;

import ontologia.conceptos.*;

public class Forzar_presupuesto extends Accion {
	
	private Cargo ministro;
	private Presupuesto presupuesto;
	
    public Forzar_presupuesto()
    { ; }

	
	public Cargo getMinistro() {
		return ministro;
	}

	public void setMinistro(Cargo ministro) {
		this.ministro = ministro;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}
    
    
}