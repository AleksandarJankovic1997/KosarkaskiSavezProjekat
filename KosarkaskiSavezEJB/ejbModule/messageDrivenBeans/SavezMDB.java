package messageDrivenBeans;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.ws.BindingProvider;

import model.Kosarkasi;
import wsdlServices.EmailValidatorRemote;
import wsdlServices.EmailValidatorService;

/**
 * Message-Driven Bean implementation class for: SavezMDB
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "java:/jms/queue/savez"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		}, 
		mappedName = "java:/jms/queue/savez")
public class SavezMDB implements MessageListener {

	@PersistenceContext
	EntityManager em;
	
	@Inject
	JMSContext ctx;
	
	@Resource(mappedName ="java:/jms/topic/lige")
	Destination destinationTopic;
	
    /**
     * Default constructor. 
     */
    public SavezMDB() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
    	ObjectMessage om=(ObjectMessage)message;
    	try {
    		Kosarkasi k=(Kosarkasi)om.getObject();
    		EmailValidatorService service=new EmailValidatorService();
    		EmailValidatorRemote port=service.getEmailValidatorPort();
    		
    		((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"https://jovicev-ejb-servis.herokuapp.com/JovicevEJBServis-0.0.1-SNAPSHOT/EmailValidator");
    		
    		
    		if(port.validateEmail(k.getEmail())) {
    			sendToDB(k);
    			sendToTopic(k);
    			System.out.println("email je validan!");
    			
    		}
    		else {
    			System.out.println("email nije validan!");
    		}
    		
    	}catch (Exception e) {
			// TODO: handle exception
    	}
    }

	private void sendToTopic(Kosarkasi k) {
		ObjectMessage om=ctx.createObjectMessage();
		try {
			om.setObject(k);
			JMSProducer producer=ctx.createProducer();
			producer.send(destinationTopic, om);
		}catch (Exception e) {
			System.out.println("nije uspelo slanje na topic");
		}
	}

	private void sendToDB(Kosarkasi k) {
		em.persist(k);
		
	}

}
