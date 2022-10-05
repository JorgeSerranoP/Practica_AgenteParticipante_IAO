package ontologia.acciones;

import ontologia.conceptos.Ficha_excusa;
import ontologia.conceptos.Jugador;

public class Activar_excusa extends Accion {
	
	private Jugador jugadorActivador;
	private Ficha_excusa fichaExcusa;
    
	public Activar_excusa()
    { ; }
	
	public Jugador getJugadorActivador() {
		return jugadorActivador;
	}
	public void setJugadorActivador(Jugador jugadorActivador) {
		this.jugadorActivador = jugadorActivador;
	}

	public Ficha_excusa getFichaExcusa() {
		return fichaExcusa;
	}

	public void setFichaExcusa(Ficha_excusa fichaExcusa) {
		this.fichaExcusa = fichaExcusa;
	}
    
}