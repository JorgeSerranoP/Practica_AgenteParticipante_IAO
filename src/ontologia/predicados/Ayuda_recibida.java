package ontologia.predicados;

import ontologia.conceptos.*;

public class Ayuda_recibida extends Predicado {
	
	private Ayuda_extranjera ayuda;
	private Billetes billetes;
	
	public Ayuda_recibida()
	{ ; }

	public Ayuda_extranjera getAyuda() {
		return ayuda;
	}

	public void setAyuda(Ayuda_extranjera ayuda) {
		this.ayuda = ayuda;
	}

	public Billetes getBilletes() {
		return billetes;
	}

	public void setBilletes(Billetes billetes) {
		this.billetes = billetes;
	}
	
}