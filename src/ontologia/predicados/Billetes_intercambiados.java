package ontologia.predicados;

import ontologia.conceptos.*;

public class Billetes_intercambiados extends Predicado {
    
	private Billetes billetes;
	private Jugador jugador1;
	private Jugador jugador2;
	
	public Billetes_intercambiados()
	{ ; }

	public Billetes getBilletes() {
		return billetes;
	}

	public void setBilletes(Billetes billetes) {
		this.billetes = billetes;
	}

	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	
}