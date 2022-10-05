package ontologia.acciones;

import ontologia.conceptos.*;

public class Volverse_cunado extends Accion {
	
	private Cargo presidente;
	private Cargo cunado;
	
    public Volverse_cunado()
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