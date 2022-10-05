package jugador.planes;

import jadex.util.SUtil;
import ontologia.acciones.*;
import ontologia.predicados.*;
import ontologia.conceptos.*;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import jadex.runtime.IGoal;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;
import java.util.Random;

public class Elegir_localizacion_plan extends Plan{
    public void body()
    {
        IMessageEvent request = (IMessageEvent) getInitialEvent();
        Elige_localizacion accion = (Elige_localizacion) request.getContent();
		AgentIdentifier sender = (AgentIdentifier) request.getParameter("sender").getValue();
        
        int billetes = (int) getBeliefbase().getBelief("billetes").getFact();
		System.out.println("Comprobando si hay dinero suficiente para ir al banco...");	
        
        Localizacion loc = new Localizacion();
        
		if (billetes>=6)
		{
			getBeliefbase().getBelief("localizacion").setFact("Banco");
            loc.setLocalizacion("Banco");
			System.out.println("El jugador ha elegido el banco como localizacion...");					
			IMessageEvent msgsend = createMessageEvent("informSend");
            Localizacion_elegida predicado = new Localizacion_elegida();
            predicado.setLocalizacion(loc);
			msgsend.setContent(predicado);
			msgsend.getParameterSet(SFipa.RECEIVERS).addValue(sender);
			sendMessage(msgsend); 
		}
		else 
		{
            int random = (int)(Math.random()*5+1);
            if(random == 1){
                getBeliefbase().getBelief("localizacion").setFact("Cuartel General");
                loc.setLocalizacion("Cuartel General");
                System.out.println("El jugador ha elegido el cuartel general como localizacion...");					
                IMessageEvent msgsend = createMessageEvent("informSend");
                Localizacion_elegida predicado = new Localizacion_elegida();
                predicado.setLocalizacion(loc);
                msgsend.setContent(predicado);
                msgsend.getParameterSet(SFipa.RECEIVERS).addValue(sender);
                sendMessage(msgsend);
            } else if(random == 2){
                getBeliefbase().getBelief("localizacion").setFact("Residencia");
                loc.setLocalizacion("Residencia");
                System.out.println("El jugador ha elegido el residencia como localizacion...");					
                IMessageEvent msgsend = createMessageEvent("informSend");
                Localizacion_elegida predicado = new Localizacion_elegida();
                predicado.setLocalizacion(loc);
                msgsend.setContent(predicado);
                msgsend.getParameterSet(SFipa.RECEIVERS).addValue(sender);
                sendMessage(msgsend);
            } else if(random == 3){
                getBeliefbase().getBelief("localizacion").setFact("Burdel");
                loc.setLocalizacion("Burdel");
                System.out.println("El jugador ha elegido el burdel como localizacion...");					
                IMessageEvent msgsend = createMessageEvent("informSend");
                Localizacion_elegida predicado = new Localizacion_elegida();
                predicado.setLocalizacion(loc);
                msgsend.setContent(predicado);
                msgsend.getParameterSet(SFipa.RECEIVERS).addValue(sender);
                sendMessage(msgsend);
            } else{
                getBeliefbase().getBelief("localizacion").setFact("Club Nocturno");
                loc.setLocalizacion("Club Nocturno");
                System.out.println("El jugador ha elegido el club nocturno como localizacion...");					
                IMessageEvent msgsend = createMessageEvent("informSend");
                Localizacion_elegida predicado = new Localizacion_elegida();
                predicado.setLocalizacion(loc);
                msgsend.setContent(predicado);
                msgsend.getParameterSet(SFipa.RECEIVERS).addValue(sender);
                sendMessage(msgsend);
            }
		}
    }
}
