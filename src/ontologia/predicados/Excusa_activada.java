package ontologia.predicados;

import ontologia.conceptos.*;

public class Excusa_activada extends Predicado {
    
	private Jugador jugador;
	private Ficha_excusa fichaEsxcusa;
    
	public Excusa_activada()
    { ; }
	
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Ficha_excusa getFichaEsxcusa() {
		return fichaEsxcusa;
	}

	public void setFichaEsxcusa(Ficha_excusa fichaEsxcusa) {
		this.fichaEsxcusa = fichaEsxcusa;
	}
    
}