package tablero.creencias;

import jadex.adapter.fipa.AgentIdentifier;

public class Turno_jugador
{
    protected AgentIdentifier jugador;
	protected Boolean turno_jugador;
	
	public Turno_jugador() {}
	
	public AgentIdentifier getJugador()
	{
		return jugador;
	}
	public boolean getTurnoJugador()
	{
		return turno_jugador;
	}
	public void setTieneMasDe6Cartas(boolean b)
	{
		this.turno_jugador=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}

}
