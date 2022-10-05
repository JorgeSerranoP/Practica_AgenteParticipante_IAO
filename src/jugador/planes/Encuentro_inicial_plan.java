package jugador.planes;

import jadex.util.SUtil;
import ontologia.acciones.*;
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

public class Encuentro_inicial_plan extends Plan{
    public void body()
    {
        ServiceDescription sd = new ServiceDescription();
		sd.setType("tablero");
		AgentDescription dfadesc = new AgentDescription();
		dfadesc.addService(sd);
		IGoal ft = createGoal("df_search");
		ft.getParameter("description").setValue(dfadesc);
		dispatchSubgoalAndWait(ft);
		System.out.println ("Jugador busca tablero...");
		AgentDescription[]	result	= (AgentDescription[])ft.getParameterSet("result").getValues();
		if(result.length > 0){
			System.out.println ("Tablero encontrado");
			AgentIdentifier tablero = result[new Random().nextInt(result.length)].getName();
			getBeliefbase().getBelief("partida_iniciada").setFact(true);
		} else{
			System.out.println ("Tablero no encontrado");
		}
    }
}
