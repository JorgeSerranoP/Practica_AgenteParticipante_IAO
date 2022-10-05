package ontologia.acciones;

import ontologia.conceptos.*;

public class Vuelve_exilio extends Accion {
	
	private Jugador jugador;
	private Localizacion exilio;
	private Localizacion localizacion;
	
    public Vuelve_exilio()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Localizacion getExilio() {
		return exilio;
	}

	public void setExilio(Localizacion exilio) {
		this.exilio = exilio;
	}

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}
    
    
}