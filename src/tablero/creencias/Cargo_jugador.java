package tablero.creencias;

import jadex.adapter.fipa.AgentIdentifier;

public class Cargo_jugador
{
    protected AgentIdentifier jugador;
	protected String cargo;
	
	public Cargo_jugador() {}
	
	public AgentIdentifier getJugador()
	{
		return jugador;
	}
	public String getCargo()
	{
		return cargo;
	}
	public void setCargo(String b)
	{
		this.cargo=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}

}