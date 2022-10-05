//Hecho por Iván Aguado Perulero
//NIA: 100405871
/*Al no haber programado todavía el agente jugador, he simulado que los mensajes se enviaban al tablero desde este propio plan
con el fin de hacerlo más entendible y coherente.*/

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

public class Descartar_cartas_plan extends Plan
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

		TieneMasDe6CartasCreencia tmdc = (TieneMasDe6CartasCreencia)getBeliefbase().getBelief("tieneMasDe6Cartas").getFact();
		TieneMasDe6Cartas predtmdc = new TieneMasDe6Cartas();

		tmdc.setJugador(jugador);
		boolean masDeSeis = tmdc.getTieneMasDe6Cartas();

		System.out.println("tablero le pregunta al jugador si tiene mas de 6 cartas");
		IMessageEvent	msg	= createMessageEvent("queryTieneMasDe6Cartas");
		msg.setContent(predtmdc);
		msg.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
		sendMessage(msg);

		Descartar_cartas dc = new Descartar_cartas();

		if (masDeSeis){
			IMessageEvent msg1 = createMessageEvent("agreeTieneMasDe6Cartas");
			msg1.setContent(predtmdc);
			msg1.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
			sendMessage(msg1);

			Cartas_politicas_jugador cartasJug = new Cartas_politicas_jugador();
			cartasJug.setJugador(jugador);
			cartasJug.setCartas(cartasJug.getCartas() - dc.getNumCartasDescartadas());
			getBeliefbase().getBelief("cartas_politicas_jugador").setFact(cartasJug);
			tmdc.setTieneMasDe6Cartas(false);

			Cartas_descartadas cd = new Cartas_descartadas();
			IMessageEvent	msg2	= createMessageEvent("informCartasDescartadas");
			msg2.setContent(cd); 
			for(int i = 0; i < result1.length; i++){
				msg2.getParameterSet(SFipa.RECEIVERS).addValue(result1[i].getName());
			}
			sendMessage(msg2);
		}

		else {
			IMessageEvent	msg3	= createMessageEvent("refuseTieneMasDe6Cartas");
			msg3.setContent(tmdc);
			msg3.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
			sendMessage(msg3);

			IMessageEvent	msg4	= createMessageEvent("requestDescartarCartas");
			msg4.setContent(dc);
			msg4.getParameterSet(SFipa.RECEIVERS).addValue(jugador);
			sendMessage(msg4);

			IMessageEvent	msg5	= createMessageEvent("agreeDescartarCartas");
			msg5.setContent(dc);
			msg5.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
			sendMessage(msg5);

			IMessageEvent	msg6	= createMessageEvent("refuseDescartarCartas");
			msg6.setContent(dc);
			msg6.getParameterSet(SFipa.RECEIVERS).addValue(tablero);
			sendMessage(msg6);

			Quiere_descartar qd = (Quiere_descartar)getBeliefbase().getBelief("quiere_descartar").getFact();
			boolean jugadorQuiereDescartar = (boolean) qd.getQuiereDescartar();
			
			Descartar_cartas dcContent = (Descartar_cartas) msg5.getContent();
			boolean puedeDescartar = (boolean) dcContent.getPuedeDescartar();

			if(puedeDescartar == jugadorQuiereDescartar){
				Cartas_politicas_jugador cartasJug = new Cartas_politicas_jugador();
				cartasJug.setJugador(jugador);
				cartasJug.setCartas(cartasJug.getCartas() - dc.getNumCartasDescartadas());
				getBeliefbase().getBelief("cartas_politicas_jugador").setFact(cartasJug);
				tmdc.setTieneMasDe6Cartas(false);

				Cartas_descartadas cd1 = new Cartas_descartadas();
				IMessageEvent msg7 = createMessageEvent("informCartasDescartadas");
				msg7.setContent(cd1); 
				for(int i = 0; i < result1.length; i++){
					msg7.getParameterSet(SFipa.RECEIVERS).addValue(result1[i].getName());
				}
			sendMessage(msg7);
			}
			
		}
    }
}
