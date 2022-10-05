package ontologia.predicados;

import ontologia.conceptos.*;

public class Presidente_votado extends Predicado{
    private Jugador presidente;
	
	public Presidente_votado()
	{ ; }

	public Jugador getPresidente() {
		return presidente;
	}

	public void setPresidente(Jugador presidente) {
		this.presidente = presidente;
	}
}
