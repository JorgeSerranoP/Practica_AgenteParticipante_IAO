package tablero.creencias;

import jadex.adapter.fipa.AgentIdentifier;

public class Quiere_descartar
{
    protected AgentIdentifier jugador;
	protected boolean quiereDescartar;
	
	public Quiere_descartar() {}
	
	public boolean getQuiereDescartar() {
        return quiereDescartar;
    }

    public void setQuiereDescartar(boolean quiereDescartar) {
        this.quiereDescartar = quiereDescartar;
    }

    public AgentIdentifier getJugador()
	{
		return jugador;
	}

	public void setJugador(AgentIdentifier h)
	{
		this.jugador=h;
	}

}
