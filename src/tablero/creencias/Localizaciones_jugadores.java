package tablero.creencias;

import java.util.HashMap;
import java.util.Map;

import jadex.adapter.fipa.AgentIdentifier;

public class Localizaciones_jugadores
{
	Map<AgentIdentifier,String> mapa= new HashMap<>();
	
	public Localizaciones_jugadores() {mapa= new HashMap<>();}
	
	public Map<AgentIdentifier,String> getLocalizaciones()
	{
		return mapa;
	}

	public void setLocalizaciones(AgentIdentifier a, String b)
	{
		mapa.put(a, b);
	}
}