package ontologia.predicados;

import ontologia.conceptos.*;

public class Golpe_empezado extends Predicado {
	
	private Jugador jugador;
	private Golpe golpe;
	
    public Golpe_empezado()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Golpe getGolpe() {
		return golpe;
	}

	public void setGolpe(Golpe golpe) {
		this.golpe = golpe;
	}
    
    
}
