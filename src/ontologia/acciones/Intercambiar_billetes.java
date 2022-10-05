package ontologia.acciones;

import ontologia.conceptos.*;

public class Intercambiar_billetes extends Accion {
	
	private Jugador jugador1;
	private Jugador jugador2;
	private Billetes billete;
	
    public Intercambiar_billetes()
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

	public Billetes getBillete() {
		return billete;
	}

	public void setBillete(Billetes billete) {
		this.billete = billete;
	}
    
    
}