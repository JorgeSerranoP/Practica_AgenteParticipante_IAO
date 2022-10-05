package ontologia.predicados;

import ontologia.conceptos.*;

public class Billetes_descartados extends Predicado {
    
	private Billetes billetes;
	private Jugador jugador;
	
	public Billetes_descartados()
	{ ; }

	public Billetes getBilletes() {
		return billetes;
	}

	public void setBilletes(Billetes billetes) {
		this.billetes = billetes;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
}