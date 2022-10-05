package ontologia.predicados;

import ontologia.conceptos.*;

public class Es_cunado extends Predicado {
    
	private Cargo presidente;
	private Cargo cunado;
	public Es_cunado()
	{ ; }
	public Cargo getPresidente() {
		return presidente;
	}
	public void setPresidente(Cargo presidente) {
		this.presidente = presidente;
	}
	public Cargo getCunado() {
		return cunado;
	}
	public void setCunado(Cargo cunado) {
		this.cunado = cunado;
	}
	
}