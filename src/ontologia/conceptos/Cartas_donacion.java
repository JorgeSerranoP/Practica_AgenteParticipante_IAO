package ontologia.conceptos;

public class Cartas_donacion extends Concepto {
	
	private Cartas_politicas carta;
	private Jugador jugador;
	private Billetes dinero;
	
	public Cartas_donacion()
	{ ; }
	
	public Cartas_politicas getCarta() {
		return carta;
	}

	public void setCarta(Cartas_politicas carta) {
		this.carta = carta;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Billetes getDinero() {
		return dinero;
	}

	public void setDinero(Billetes dinero) {
		this.dinero = dinero;
	}
	
	
}