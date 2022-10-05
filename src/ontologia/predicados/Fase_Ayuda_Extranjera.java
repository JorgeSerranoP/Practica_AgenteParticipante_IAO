package ontologia.predicados;

import ontologia.conceptos.*;

public class Fase_Ayuda_Extranjera extends Predicado {
	
	private Cargo presidente;
	private Billetes billete;
	
    public Fase_Ayuda_Extranjera()
    { ; }

	public Cargo getPresidente() {
		return presidente;
	}

	public void setPresidente(Cargo presidente) {
		this.presidente = presidente;
	}

	public Billetes getBillete() {
		return billete;
	}

	public void setBillete(Billetes billete) {
		this.billete = billete;
	}
    
    
}