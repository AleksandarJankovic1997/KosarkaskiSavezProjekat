package webservices;

import javax.ejb.Remote;

@Remote
public interface NumberOfRegistredPlayerWebServiceRemote {

	public int getNumberOfPlayer(String imeTima);
	
}
