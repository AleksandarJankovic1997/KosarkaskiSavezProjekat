package messageDrivenBeans;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import model.Kosarkasi;

/**
 * Message-Driven Bean implementation class for: MDBPrvaLiga
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "java:/jms/topic/lige"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Topic")
		}, 
		mappedName = "java:/jms/topic/lige")
public class MDBPrvaLiga implements MessageListener {

    /**
     * Default constructor. 
     */
    public MDBPrvaLiga() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
        ObjectMessage om=(ObjectMessage)message;
        try {
        	Kosarkasi k=(Kosarkasi)om.getObject();
        	if(k.getLiga().equalsIgnoreCase("PrvaLiga")) {
        		System.out.println("igrac ubacen u prvu ligu!");
        	}
        	
        }catch (Exception e) {
			System.out.println("greska");
		}
        
    }

}
