package ontologia.acciones;

import ontologia.conceptos.*;

public class Se_exilia extends Accion {
	
	private Jugador jugador;
	private Localizacion exilio;
	
    public Se_exilia()
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
	
	
    
    
}