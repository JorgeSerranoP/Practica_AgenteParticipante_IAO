package ontologia.acciones;

import ontologia.conceptos.*;

public class Intercambiar_cartas extends Accion {
	
	private Jugador jugador1;
	private Jugador jugador2;
	private Cartas_politicas cartas;
	
    public Intercambiar_cartas()
    { ; }

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

	public Cartas_politicas getCartas() {
		return cartas;
	}

	public void setCartas(Cartas_politicas cartas) {
		this.cartas = cartas;
	}
}