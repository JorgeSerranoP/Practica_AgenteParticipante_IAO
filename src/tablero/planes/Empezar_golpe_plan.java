//Hecho por Miriam Valdizán Arce
//NIA: 100386356

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

public class Empezar_golpe_plan extends Plan
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
		AgentIdentifier jugador = result1[0].getName();
	
        boolean ea = (boolean) getBeliefbase().getBelief("excusa_activada").getFact();

        IMessageEvent msg1 = createMessageEvent("queryIfExcusaActivada");
		System.out.println("tablero pregunta si la ficha de excusa esta activada");
        msg1.setContent(ea);
        msg1.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
        IMessageEvent queryResponse = sendMessageAndWait(msg1);
		
		if (ea == false) {

			IMessageEvent msg2 = createMessageEvent("refuseExcusaActivada");
			System.out.println("la ficha de excusa no esta activada");
            msg2.setContent(ea);
		    msg2.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		    sendMessage(msg2);

		}
        else {

            IMessageEvent	msg3	= createMessageEvent("agreeExcusaActivada");
            msg3.setContent(ea);
            msg3.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
            sendMessage(msg3);

            IMessageEvent	msg4	= createMessageEvent("requestEmpezarGolpe"); 
            Empezar_golpe eg = new Empezar_golpe();         
            msg4.setContent(eg);
		    msg4.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		    sendMessage(msg4);

			Golpe_empezado ge = new Golpe_empezado();
			IMessageEvent	msg5	= createMessageEvent("informGolpeEmpezado");
			msg5.setContent(ge);

			for(int i = 0; i < result1.length; i++){
				msg5.getParameterSet(SFipa.RECEIVERS).addValue(result1[i].getName());
			}
			sendMessage(msg5);
        }
	}
}