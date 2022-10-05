package tablero.creencias;

import jadex.adapter.fipa.AgentIdentifier;

public class Cartas_politicas_jugador
{
    protected AgentIdentifier jugador;
	protected int cartas_politicas;
	
	public Cartas_politicas_jugador() {}
	
	public AgentIdentifier getJugador()
	{
		return jugador;
	}
	public int getCartas()
	{
		return cartas_politicas;
	}
	public void setCartas(int b)
	{
		this.cartas_politicas=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}

}