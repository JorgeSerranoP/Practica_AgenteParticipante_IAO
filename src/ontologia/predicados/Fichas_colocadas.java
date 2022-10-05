package ontologia.predicados;

import ontologia.conceptos.*;

public class Fichas_colocadas extends Predicado {
    
	private Fichas_policia fichas_policia;
	private Ficha_excusa ficha_excusa;
	private Marcador_turno ficha_turno;
	private Ficha_control ficha_control;
	
	public Fichas_colocadas()
	{ ; }

	public Fichas_policia getFichas_policia() {
		return fichas_policia;
	}

	public void setFichas_policia(Fichas_policia fichas_policia) {
		this.fichas_policia = fichas_policia;
	}

	public Ficha_excusa getFicha_excusa() {
		return ficha_excusa;
	}

	public void setFicha_excusa(Ficha_excusa ficha_excusa) {
		this.ficha_excusa = ficha_excusa;
	}

	public Marcador_turno getFicha_turno() {
		return ficha_turno;
	}

	public void setFicha_turno(Marcador_turno ficha_turno) {
		this.ficha_turno = ficha_turno;
	}

	public Ficha_control getFicha_control() {
		return ficha_control;
	}

	public void setFicha_control(Ficha_control ficha_control) {
		this.ficha_control = ficha_control;
	}
	
}