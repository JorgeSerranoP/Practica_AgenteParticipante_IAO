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

public class Descartar_billetes_plan extends Plan
{

    public void body()
    {
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
		
		Descartar_billetes db= new Descartar_billetes();
		System.out.println("tablero le dice al jugador si quiere descartar billetes");
		IMessageEvent	msg1	= createMessageEvent("requestDescartarBilletes");
		msg1.setContent(db);
		msg1.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		
		IMessageEvent requestResponse = sendMessageAndWait(msg1);
		Descartar_billetes dbj = (Descartar_billetes) requestResponse.getContent();

		if(dbj.getBilletes() > 0){
			IMessageEvent	msg2	= createMessageEvent("agreeDescartarBilletes");
			msg2.setContent(dbj);
			msg2.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
			sendMessage(msg2);

			Billetes_jugador bj = new Billetes_jugador();
			bj.setJugador(jugador);
			bj.setBilletes(bj.getBilletes() - dbj.getBilletes());
			getBeliefbase().getBelief("billetes_jugador").setFact(bj);
			System.out.println("el jugador ha descartado billetes");

			Billetes_descartados bd = new Billetes_descartados();
			IMessageEvent	msg3	= createMessageEvent("informBilletesDescartados");
			msg3.setContent(bd);
			for(int i = 0; i < result1.length; i++){
				msg3.getParameterSet(SFipa.RECEIVERS).addValue(result1[i].getName());
			}
			sendMessage(msg3);
			
		} else{
			IMessageEvent	msg4	= createMessageEvent("refuseDescartarBilletes");
			msg4.setContent(db);
			msg4.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
			sendMessage(msg4);
			System.out.println("el jugador ha descartado billetes");
		}
    }
}