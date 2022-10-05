package tablero.creencias;

import jadex.adapter.fipa.AgentIdentifier;

public class Num_cargos_asignados
{
    protected AgentIdentifier jugador;
	protected int numCargos;
	
	public Num_cargos_asignados() {}
	
	public AgentIdentifier getJugador()
	{
		return jugador;
	}
	public int getNumCargos()
	{
		return numCargos;
	}
	public void setNumCargos(int b)
	{
		this.numCargos=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}
}
