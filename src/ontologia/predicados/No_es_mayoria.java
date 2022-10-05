package ontologia.predicados;

import ontologia.conceptos.Jugador;

public class No_es_mayoria extends Predicado {
    
	private int votos;
	private Jugador candidato;
	
	public No_es_mayoria()
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