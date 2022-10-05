package ontologia.predicados;

import ontologia.conceptos.*;

public class Carta_jugada extends Predicado{

    private Cartas_politicas cartas;
	private Jugador jugador;
	
	public Carta_jugada()
	{ ; }

	public Cartas_politicas getCartas() {
		return cartas;
	}

	public void setCartas(Cartas_politicas cartas) {
		this.cartas = cartas;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
}
