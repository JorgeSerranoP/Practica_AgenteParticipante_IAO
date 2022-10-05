package ontologia.acciones;

import ontologia.conceptos.*;

public class Recibe_ayuda extends Accion {
	
	private Cargo presidente;
	private Billetes billete;
	
    public Recibe_ayuda()
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