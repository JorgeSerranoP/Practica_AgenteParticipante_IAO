package ontologia.conceptos;

public class Cartas_politicas extends Concepto {
	
	private String tipo;
	private int numero_cartas;
	
	public Cartas_politicas()
	{ ; }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero_cartas() {
		return numero_cartas;
	}

	public void setNumero_cartas(int numero_cartas) {
		this.numero_cartas = numero_cartas;
	}
	
}