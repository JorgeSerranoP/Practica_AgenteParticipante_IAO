package ontologia.predicados;

import ontologia.conceptos.Jugador;

public class Es_mayoria extends Predicado {
    
	private int votos;
	private Jugador candidato;
	
	public Es_mayoria()
	{ ; }

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	public Jugador getCandidato() {
		return candidato;
	}

	public void setCandidato(Jugador candidato) {
		this.candidato = candidato;
	}
	
}