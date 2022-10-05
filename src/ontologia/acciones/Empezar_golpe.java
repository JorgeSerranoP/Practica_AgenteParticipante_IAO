package ontologia.acciones;

import ontologia.conceptos.*;

public class Empezar_golpe extends Accion {
	
	private Jugador jugador;
	private Golpe golpe;
	
    public Empezar_golpe()
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