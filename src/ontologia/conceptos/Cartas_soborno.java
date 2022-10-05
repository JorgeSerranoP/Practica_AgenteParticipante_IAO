package ontologia.conceptos;

public class Cartas_soborno extends Concepto {
	
	private Cartas_politicas carta;
	private Jugador jugador;
	private Billetes dinero;
	private boolean pago;
	
	public Cartas_soborno()
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

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	
}