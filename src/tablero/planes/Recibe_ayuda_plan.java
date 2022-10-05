//Hecho por Julián Bernabé Calvo
//NIA: 100386230

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

public class Recibe_ayuda_plan extends Plan
{

    public void body()
    {

		//Buscamos al tablero porque estamos representando los mensajes de ambos (jugador y tablero) aunque deberia ir en los planes del jugador
		ServiceDescription sdTablero = new ServiceDescription();
		sdTablero.setType("tablero");
		AgentDescription dfadescTablero = new AgentDescription();
		dfadescTablero.addService(sdTablero);
		IGoal ftTablero = createGoal("df_search");
		ftTablero.getParameter("description").setValue(dfadescTablero);
		AgentDescription[]	result	= (AgentDescription[])ftTablero.getParameterSet("result").getValues();
		AgentIdentifier tablero = result[0].getName();

		ServiceDescription sdJugador = new ServiceDescription();
		sdJugador.setType("jugador");
		AgentDescription dfadescJugador = new AgentDescription();
		dfadescJugador.addService(sdJugador);
		IGoal ftJugador = createGoal("df_search");
		ftJugador.getParameter("description").setValue(dfadescJugador);
		AgentDescription[]	result1	= (AgentDescription[])ftJugador.getParameterSet("result").getValues();
		AgentIdentifier presidente = result1[0].getName();

		/*
		for(int i = 0; i < result1.length; i++){	
			String cargo2 = result1[i].getCargo();
			if(cargo2.equals("presidente")){
				AgentIdentifier presidente = result1[i].getName();
			}	
		}		
		*/ 
		
		boolean hayPresidente = (boolean) getBeliefbase().getBelief("hay_presidente").getFact();
		String fase = (String) getBeliefbase().getBelief("marcador_fase").getFact();
		String faseAyudaExtranjera = "Fase_Ayuda_Extranjera";

		IMessageEvent msg1 = createMessageEvent("queryIfFaseAyudaExtranjera");
		System.out.println("tablero pregunta si esta en la fase de ayuda extranjera");
        msg1.setContent(fase);
        msg1.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
        IMessageEvent queryResponse = sendMessageAndWait(msg1);

		if(hayPresidente == true && (fase.equals(faseAyudaExtranjera))) {

			System.out.println("el presidente acepta recibir la ayuda extranjera");
			IMessageEvent msg2 = createMessageEvent("agreeRecibeAyuda");
			msg2.setContent(fase);
			msg2.getParameterSet(SFipa.RECEIVERS).addValue(presidente);
			sendMessage(msg2);

			IMessageEvent	msg3	= createMessageEvent("requestEmpezarGolpe"); 
            Recibe_ayuda ayuda = new Recibe_ayuda();         
            msg3.setContent(ayuda);
		    msg3.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
		    sendMessage(msg3);

			Ayuda_recibida ar = new Ayuda_recibida();
			IMessageEvent	msg4	= createMessageEvent("informAyudaRecibida");
			msg4.setContent(ar);

			for(int i = 0; i < result1.length; i++){
				msg4.getParameterSet(SFipa.RECEIVERS).addValue(result1[i].getName());
			}
			sendMessage(msg4);
		}
		else {

			System.out.println("el presidente rechaza recibir la ayuda extranjera");
			IMessageEvent	msg5	= createMessageEvent("refuseRecibeAyuda");
			msg5.setContent(fase);
			msg5.getParameterSet(SFipa.RECEIVERS).addValue(presidente);
			sendMessage(msg5);

		}    
    }
}