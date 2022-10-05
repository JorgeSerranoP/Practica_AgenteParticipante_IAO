package ontologia.predicados;

import ontologia.conceptos.Cargo;
import ontologia.conceptos.Jugador;

public class Dimitido extends Predicado {
    
	private Jugador jugador;
	private Cargo presidente;
	
	public Dimitido()
	{ ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Cargo getPresidente() {
		return presidente;
	}

	public void setPresidente(Cargo presidente) {
		this.presidente = presidente;
	}
	
}
