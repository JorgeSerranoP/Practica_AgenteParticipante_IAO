package ontologia.acciones;

import ontologia.conceptos.*;

public class Pierde_cartas extends Accion {
	
	private Jugador jugador;
	private Cartas_politicas cartas;
	
    public Pierde_cartas()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Cartas_politicas getCartas() {
		return cartas;
	}

	public void setCartas(Cartas_politicas cartas) {
		this.cartas = cartas;
	}
    
}