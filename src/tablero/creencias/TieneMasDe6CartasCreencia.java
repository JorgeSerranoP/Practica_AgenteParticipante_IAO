package tablero.creencias;

import jadex.adapter.fipa.AgentIdentifier;

public class TieneMasDe6CartasCreencia
{
    protected AgentIdentifier jugador;
	protected Boolean tieneMasDe6Cartas;
	
	public TieneMasDe6CartasCreencia() {}
	
	public AgentIdentifier getJugador()
	{
		return jugador;
	}
	public boolean getTieneMasDe6Cartas()
	{
		return tieneMasDe6Cartas;
	}
	public void setTieneMasDe6Cartas(boolean b)
	{
		this.tieneMasDe6Cartas=b;
	}
	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}
}
