package ontologia.acciones;

import ontologia.conceptos.*;

public class Propone_candidatos extends Accion {
	
	private Jugador jugador;
	private Jugador candidato;
	
    public Propone_candidatos()
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