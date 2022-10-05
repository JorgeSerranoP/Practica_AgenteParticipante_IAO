package ontologia.predicados;

import ontologia.conceptos.Localizacion;

public class Localizacion_elegida  extends Predicado {
	private Localizacion localizacion;
	
	public Localizacion_elegida()
	{ ; }

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}
}
