package ontologia.acciones;

import ontologia.conceptos.*;

public class Intenta_asesinar extends Accion {
	
	private Jugador jugador1;
	private Jugador jugador2;
	
    public Intenta_asesinar()
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
    
    
}