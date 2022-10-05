package ontologia.acciones;

import ontologia.conceptos.*;

public class Vota_presidente extends Accion {
	
	private Jugador jugador;
	private Jugador candidato;
	
    public Vota_presidente()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Jugador getCandidato() {
		return candidato;
	}

	public void setCandidato(Jugador candidato) {
		this.candidato = candidato;
	}
    
    
}