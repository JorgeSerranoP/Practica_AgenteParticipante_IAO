package ontologia.acciones;

import ontologia.conceptos.*;

public class Descartar_billetes extends Accion {
    
	private Jugador jugador;
	private int billetes; 
	
	public Descartar_billetes()
    { ; }

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public int getBilletes() {
		return billetes;
	}

	public void setBilletes(int billetes) {
		this.billetes = billetes;
	}
	
	
	
}