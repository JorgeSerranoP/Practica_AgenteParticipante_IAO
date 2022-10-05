package tablero.creencias;

import jadex.adapter.fipa.AgentIdentifier;

public class Cartas_asesinato
{
    protected AgentIdentifier jugador;
	protected int cartas_asesinato;
	
	public Cartas_asesinato() {}
	
	public AgentIdentifier getJugador()
	{
		return jugador;
	}
	public int getCartasAsesinato()
	{
		return cartas_asesinato;
	}
	public void setCartasAsesinato(int b)
	{
		this.cartas_asesinato=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}

}