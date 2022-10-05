package ontologia.conceptos;

public class Cartas_voto extends Concepto {
	
	private int numero_votos;
	private Cartas_politicas carta;
	private Jugador jugador;
	
	public Cartas_voto()
	{ ; }

	public int getNumero_votos() {
		return numero_votos;
	}

	public void setNumero_votos(int numero_votos) {
		this.numero_votos = numero_votos;
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

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
	
}