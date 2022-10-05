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

public class Elige_localizacion_plan extends Plan{
    public void body()
    {
        ServiceDescription sd = new ServiceDescription();
		sd.setType("jugador");
        sd.setName("jugador1");
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		IGoal ft = createGoal("df_search");
		ft.getParameter("description").setValue(dfadesc);
		dispatchSubgoalAndWait(ft);
		System.out.println ("Tablero buscando jugador...");
		AgentDescription[]	result	= (AgentDescription[])ft.getParameterSet("result").getValues();
        AgentIdentifier jugador = result[new Random().nextInt(result.length)].getName();
		
        Elige_localizacion el = new Elige_localizacion();
        System.out.println ("Tablero pidiendo al jugador que elija una localizacion...");
        IMessageEvent	msg	= createMessageEvent("requestSend");
		msg.setContent(el);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);
    }
}
