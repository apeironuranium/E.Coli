package mult1;

import jade.core.Agent;

import java.io.IOException;

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.util.Logger;

public class FirstAgent extends Agent {private Logger myLogger = Logger.getMyLogger(getClass().getName());

public class WaitInfoAndReplyBehaviour extends CyclicBehaviour {

	public WaitInfoAndReplyBehaviour(Agent a) {
		super(a);
	}

	public void action() {
		ACLMessage  msg = myAgent.receive();
		if(msg != null){
			ACLMessage reply = msg.createReply();

			if(msg.getPerformative()== ACLMessage.REQUEST){
				String content = msg.getContent();
				if ((content != null) && (content.indexOf("What is your number") != -1)){
					myLogger.log(Logger.INFO, "Agent "+getLocalName()+" - Received Info Request from "+msg.getSender().getLocalName());
					reply.setPerformative(ACLMessage.INFORM);
					try {
						reply.setContentObject(4);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					myLogger.log(Logger.INFO, "Agent "+getLocalName()+" - Unexpected request ["+content+"] received from "+msg.getSender().getLocalName());
					reply.setPerformative(ACLMessage.REFUSE);
					reply.setContent("( UnexpectedContent ("+content+"))");
				}

			}
			else {
				myLogger.log(Logger.INFO, "Agent "+getLocalName()+" - Unexpected message ["+ACLMessage.getPerformative(msg.getPerformative())+"] received from "+msg.getSender().getLocalName());
				reply.setPerformative(ACLMessage.NOT_UNDERSTOOD);
				reply.setContent("( (Unexpected-act "+ACLMessage.getPerformative(msg.getPerformative())+") )");   
			}
			send(reply);
		}
		else {
			block();
		}
	}
} // END of inner class WaitInfoAndReplyBehaviour


protected void setup() {
	// Registration with the DF 
	DFAgentDescription dfd = new DFAgentDescription();
	ServiceDescription sd = new ServiceDescription();   
	sd.setType("PingAgent"); 
	sd.setName(getName());
	sd.setOwnership("TILAB");
	dfd.setName(getAID());
	dfd.addServices(sd);
	try {
		DFService.register(this,dfd);
		WaitInfoAndReplyBehaviour FirstAgent = new  WaitInfoAndReplyBehaviour(this);
		addBehaviour(FirstAgent);
	} catch (FIPAException e) {
		myLogger.log(Logger.SEVERE, "Agent "+getLocalName()+" - Cannot register with DF", e);
		doDelete();
	}
}

}


