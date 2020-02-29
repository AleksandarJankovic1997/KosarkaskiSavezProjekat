package sessionBeans;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.ObjectMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Kosarkasi;

/**
 * Session Bean implementation class StatelessBeanKolokvijum
 */
@Stateless
@LocalBean
public class StatelessBeanKolokvijum implements StatelessBeanKolokvijumRemote {

	@PersistenceContext 
	EntityManager em;
	
	@Resource(mappedName = "java:/jms/queue/savez")
	Destination destinationQueue;
	
	@Inject
	JMSContext ctx;
	
    /**
     * Default constructor. 
     */
    public StatelessBeanKolokvijum() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void unesiIgraca(Kosarkasi k) {
		System.out.println("ovde1");
		ObjectMessage om=ctx.createObjectMessage();
		try {
			om.setObject(k);
			JMSProducer producer=ctx.createProducer();
			producer.send(destinationQueue, om);
		}catch (Exception e) {
			System.out.println("doslo je do greske!");
		}
	}

	@Override
	public List<Kosarkasi> vratiKosarkase(String team) {
		String query="SELECT k FROM Kosarkasi k WHERE k.klub=:tim";
		Query q=em.createQuery(query);
		q.setParameter("tim", team);
		List<Kosarkasi> kosarkasi=q.getResultList();
		
		return kosarkasi;
	}

	@Override
	public void azurirajTim(int id, String noviTim) {
		Kosarkasi k=em.find(Kosarkasi.class, id);
		k.setKlub(noviTim);
		em.merge(k);
	}

}
