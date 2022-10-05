package ontologia.acciones;

import ontologia.conceptos.*;

public class Descartar_cartas extends Accion {
	
	private Jugador jugador;
	private Cartas_politicas carta;
	private boolean puedeDescartar;
	private int numCartasDescartadas;
	
    public Descartar_cartas()
    { ; }

	public int getNumCartasDescartadas() {
		return numCartasDescartadas;
	}

	public void setNumCartasDescartadas(int numCartasDescartadas) {
		this.numCartasDescartadas = numCartasDescartadas;
	}

	public Cartas_politicas getCarta() {
		return carta;
	}

	public void setCarta(Cartas_politicas carta) {
		this.carta = carta;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public boolean getPuedeDescartar() {
		return puedeDescartar;
	}

	public void setPuedeDescartar(boolean puedeDescartar) {
		this.puedeDescartar = puedeDescartar;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
    
}