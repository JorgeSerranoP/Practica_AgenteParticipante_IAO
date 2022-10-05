package ontologia.predicados;

import ontologia.conceptos.*;

public class TieneMasDe6Cartas extends Predicado{

    private boolean tieneMasDe6cartas;
	private Jugador jugador;
	
	public TieneMasDe6Cartas()
	{ ; }

	public boolean getTieneMasDe6cartas() {
		return tieneMasDe6cartas;
	}

	public void setTieneMasDe6cartas(boolean tieneMasDe6cartas) {
		this.tieneMasDe6cartas = tieneMasDe6cartas;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
}
