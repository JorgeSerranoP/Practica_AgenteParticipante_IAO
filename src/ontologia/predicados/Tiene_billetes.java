package ontologia.predicados;

import ontologia.conceptos.*;

public class Tiene_billetes extends Predicado {
    
	private Jugador jugador;
	private Billetes billetes;
	
	public Tiene_billetes()
	{ ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Billetes getBilletes() {
		return billetes;
	}

	public void setBilletes(Billetes billetes) {
		this.billetes = billetes;
	}
	
}