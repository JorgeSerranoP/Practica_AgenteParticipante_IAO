package ontologia.predicados;

import ontologia.conceptos.*;

public class Cartas_descartadas extends Predicado {
    
	private Cartas_politicas carta;
	
	public Cartas_descartadas()
	{ ; }

	public Cartas_politicas getCarta() {
		return carta;
	}

	public void setCarta(Cartas_politicas carta) {
		this.carta = carta;
	}
	
}