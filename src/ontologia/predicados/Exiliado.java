package ontologia.predicados;

import ontologia.conceptos.*;

public class Exiliado extends Predicado {
	private Localizacion exilio;
	
    public Exiliado()
    { ; }

	public Localizacion getExilio() {
		return exilio;
	}

	public void setExilio(Localizacion exilio) {
		this.exilio = exilio;
	}
}