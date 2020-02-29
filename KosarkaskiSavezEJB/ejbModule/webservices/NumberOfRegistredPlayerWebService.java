package webservices;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import sessionBeans.StatelessBeanKolokvijumRemote;

/**
 * Session Bean implementation class NumberOfRegistredPlayerWebService
 */
@Stateless
@LocalBean
@WebService
public class NumberOfRegistredPlayerWebService implements NumberOfRegistredPlayerWebServiceRemote {

	@EJB
	StatelessBeanKolokvijumRemote bin;
	
    /**
     * Default constructor. 
     */
    public NumberOfRegistredPlayerWebService() {
        // TODO Auto-generated constructor stub
    }
    
    @WebMethod
	@Override
	public int getNumberOfPlayer(String imeTima) {
		return bin.vratiKosarkase(imeTima).size();
	}

}
