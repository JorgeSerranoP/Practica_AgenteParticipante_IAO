package ontologia.acciones;

import ontologia.conceptos.*;

public class Elige_localizacion extends Accion {
	
	private Jugador jugador;
	private Localizacion localizacion;
	
    public Elige_localizacion()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}
    
    
}