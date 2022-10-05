package ontologia.acciones;

import ontologia.conceptos.*;

public class Ingresa_dinero extends Accion {
	
	private Jugador jugador;
	private Billetes billete;
	
    public Ingresa_dinero()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Billetes getBillete() {
		return billete;
	}

	public void setBillete(Billetes billete) {
		this.billete = billete;
	}
}