package messageDrivenBeans;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import model.Kosarkasi;

/**
 * Message-Driven Bean implementation class for: MDBDrugaLiga
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "java:/jms/topic/lige"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Topic")
		}, 
		mappedName = "java:/jms/topic/lige")
public class MDBDrugaLiga implements MessageListener {

    /**
     * Default constructor. 
     */
    public MDBDrugaLiga() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
        ObjectMessage om=(ObjectMessage)message;
        try {
        	Kosarkasi k=(Kosarkasi)om.getObject();
        	if(k.getLiga().equalsIgnoreCase("DrugaLiga")) {
        		System.out.println("Igrac "+k.getIme()+" uspesno ubacen u drugu ligu!");
        	}
        	
        }catch (Exception e) {
			System.out.println("doslo do greske!");
		}
        
    }

}
