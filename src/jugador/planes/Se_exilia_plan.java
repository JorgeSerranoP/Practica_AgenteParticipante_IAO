package jugador.planes;

import jadex.util.SUtil;
import ontologia.acciones.*;
import ontologia.conceptos.Localizacion;
import ontologia.predicados.*;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import jadex.runtime.IGoal;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;
import java.util.Random;

public class Se_exilia_plan extends Plan{
    public void body()
    {
        IMessageEvent request = (IMessageEvent) getInitialEvent();
        Se_exilia accion = (Se_exilia) request.getContent();
		AgentIdentifier sender = (AgentIdentifier) request.getParameter("sender").getValue();

 	    int billetes = (int) getBeliefbase().getBelief("billetes_en_suiza").getFact();
		System.out.println("Comprobando si hay dinero suficiente para exiliarse...");	
        
		Localizacion exilio = new Localizacion();

		if (billetes>=15)
		{
			getBeliefbase().getBelief("localizacion").setFact("Exilio");
			System.out.println("El jugador ha elegido exiliarse...");		
			exilio.setLocalizacion("Exilio");			
			IMessageEvent msgsend = createMessageEvent("informSend");
            Exiliado predicado = new Exiliado();
			predicado.setExilio(exilio);
			msgsend.setContent(predicado);
			msgsend.getParameterSet(SFipa.RECEIVERS).addValue(sender);
			sendMessage(msgsend); 
		}
		else 
		{	
            System.out.println("El jugador ha elegido no exiliarse...");
			exilio.setLocalizacion("NoExilio");				
            IMessageEvent msgsend = createMessageEvent("informSend");
            No_exiliado predicado = new No_exiliado();
			predicado.setExilio(exilio);
            msgsend.setContent(predicado);
            msgsend.getParameterSet(SFipa.RECEIVERS).addValue(sender);
            sendMessage(msgsend);
		}
    }
}