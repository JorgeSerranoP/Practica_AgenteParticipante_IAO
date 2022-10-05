package ontologia.predicados;

import ontologia.conceptos.*;

public class Cartas_intercambiadas extends Predicado {
    
	private Cartas_politicas cartas;
	private Jugador jugador1;
	private Jugador jugador2;
	
	public Cartas_intercambiadas()
	{ ; }

	public Cartas_politicas getCartas() {
		return cartas;
	}

	public void setCartas(Cartas_politicas cartas) {
		this.cartas = cartas;
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