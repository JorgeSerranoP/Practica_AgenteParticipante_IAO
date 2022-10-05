package ontologia.predicados;

import ontologia.conceptos.*;

public class Cargo_asignado extends Predicado {
    
	private Jugador jugador;
	private Cargo presidente;
	private Cargo cargo;
	
	public Cargo_asignado()
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

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
}