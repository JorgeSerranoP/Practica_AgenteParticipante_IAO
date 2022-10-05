package ontologia.acciones;

import ontologia.conceptos.Billetes;
import ontologia.conceptos.Jugador;
import ontologia.conceptos.Localizacion;

public class Operacion_bancaria extends Accion{

	private Localizacion banco;
	private Jugador jugador;
	private Billetes billetes;
	private String tipoOperacion;
	
	public Localizacion getBanco() {
		return banco;
	}

	public void setBanco(Localizacion banco) {
		this.banco = banco;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Billetes getBilletes() {
		return billetes;
	}

	public void setBilletes(Billetes billetes) {
		this.billetes = billetes;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public Operacion_bancaria()
    { ; }
	
}
