package ontologia.conceptos;

public class Ayuda_extranjera extends Concepto {
	
	private Billetes presupuesto;
	private Cargo presidente;
	
	public Ayuda_extranjera()
	{ ; }

	public Billetes getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Billetes presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Cargo getPresidente() {
		return presidente;
	}

	public void setPresidente(Cargo presidente) {
		this.presidente = presidente;
	}
	
	
}