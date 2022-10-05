package tablero.planes;

import jadex.util.SUtil;
import ontologia.acciones.*;
import ontologia.predicados.*;
import tablero.creencias.*;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import jadex.runtime.IGoal;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;
import java.util.Random;

public class Localizacion_elegida_plan extends Plan{
    public void body()
    {
        System.out.println("El tablero recibe el mensaje del jugador...");	
        IMessageEvent inform = (IMessageEvent) getInitialEvent();
        Localizacion_elegida predicado = (Localizacion_elegida) inform.getContent();
		AgentIdentifier sender = (AgentIdentifier) inform.getParameter("sender").getValue();

        System.out.println("Guardando localizacion en la base de creencias del tablero...");	
        Localizaciones_jugadores localizaciones = (Localizaciones_jugadores) getBeliefbase().getBelief("localizaciones_jugador").getFact();
        localizaciones.setLocalizaciones(sender, predicado.getLocalizacion().getLocalizacion());
    }
}
