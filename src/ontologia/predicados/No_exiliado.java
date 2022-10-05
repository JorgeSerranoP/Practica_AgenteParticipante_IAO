package ontologia.predicados;

import ontologia.conceptos.*;

public class No_exiliado extends Predicado{
    private Localizacion exilio;

    public No_exiliado()
    { ; }

    public Localizacion getExilio() {
		return exilio;
	}

	public void setExilio(Localizacion exilio) {
		this.exilio = exilio;
	}
}
