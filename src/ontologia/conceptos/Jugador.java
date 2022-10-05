package ontologia.conceptos;

public class Jugador extends Concepto {
	
	private Cargo cargo;
	private Localizacion localizacion;
	private Cartas_politicas cartas;
	private Cartas_influencia cartas_influencia;
	private Cartas_donacion cartas_donacion;
	private Cartas_evento cartas_evento;
	private Cartas_voto cartas_voto;
	private Cartas_asesino cartas_asesino;
	private Cartas_soborno cartas_soborno;
	private Billetes billetes;
	private Presupuesto presupuesto;
	
	public Jugador()
	{ ; }

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}

	public Cartas_politicas getCartas() {
		return cartas;
	}

	public void setCartas(Cartas_politicas cartas) {
		this.cartas = cartas;
	}

	public Cartas_influencia getCartas_influencia() {
		return cartas_influencia;
	}

	public void setCartas_influencia(Cartas_influencia cartas_influencia) {
		this.cartas_influencia = cartas_influencia;
	}

	public Cartas_donacion getCartas_donacion() {
		return cartas_donacion;
	}

	public void setCartas_donacion(Cartas_donacion cartas_donacion) {
		this.cartas_donacion = cartas_donacion;
	}

	public Cartas_evento getCartas_evento() {
		return cartas_evento;
	}

	public void setCartas_evento(Cartas_evento cartas_evento) {
		this.cartas_evento = cartas_evento;
	}

	public Cartas_voto getCartas_voto() {
		return cartas_voto;
	}

	public void setCartas_voto(Cartas_voto cartas_voto) {
		this.cartas_voto = cartas_voto;
	}

	public Cartas_asesino getCartas_asesino() {
		return cartas_asesino;
	}

	public void setCartas_asesino(Cartas_asesino cartas_asesino) {
		this.cartas_asesino = cartas_asesino;
	}

	public Cartas_soborno getCartas_soborno() {
		return cartas_soborno;
	}

	public void setCartas_soborno(Cartas_soborno cartas_soborno) {
		this.cartas_soborno = cartas_soborno;
	}

	public Billetes getBilletes() {
		return billetes;
	}

	public void setBilletes(Billetes billetes) {
		this.billetes = billetes;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}
	
}