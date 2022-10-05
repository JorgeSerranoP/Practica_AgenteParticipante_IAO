package ontologia.conceptos;

public class Presupuesto extends Concepto {
	
	private Jugador jugador;
	private int cantidad;
	private Billetes dinero;
	
	public Presupuesto()
	{ ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Billetes getDinero() {
		return dinero;
	}

	public void setDinero(Billetes dinero) {
		this.dinero = dinero;
	}
	
	
}